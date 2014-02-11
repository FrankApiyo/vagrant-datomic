(ns examples.core
  (:require [datomic.api :as d :refer [db]]))

;; Datomic examples

(def conn (atom nil))

(def config
  { :ip "33.33.33.33"
    :port 4334
    :database "hello" })

(def uri
  (apply
    (partial format "datomic:free://%s:%s/%s")
      (reverse (vals config))))

(defn connect! [uri]
  (do
    (d/create-database uri)
    (reset! conn (d/connect uri))))
