(ns examples.core
  (:require [datomic.api :as d :refer [db]]))

;; Datomic examples

(def conn (atom nil))

;; Vagrant config
(def config
  { :ip "33.33.33.33"
    :port 4334
    :database "hello" })

(def uri
  (apply
    (partial format "datomic:free://%s:%s/%s")
      (vals config)))

(defn connect! [uri]
  (do
    (d/create-database uri)
    (reset! conn (d/connect uri))))

;; Connect to the Vagrant Datomic instance

(connect! uri)

;; Queries and transactions

(def transaction
  (d/transact
    @conn
    [[:db/add (d/tempid :db.part/user)
     :db/doc
     "OH HAI"]]))

(defn get-first-entity []
  (let [entities
    (d/q '[:find ?entity
           :where [?entity
                    :db/doc "OH HAI"]]
           (d/db @conn))]
  (ffirst entities)))
