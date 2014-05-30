(defproject examples "0.1.0-SNAPSHOT"
  :description "Datomic examples"
  :url "http://owainlewis.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :jvm-opts ^:replace ["-Xmx1g" "-server"]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.datomic/datomic-free "0.9.4766.11"]])
