(defproject achtungonline "0.1.0-SNAPSHOT"
  :description "Server for Achtung Online"
  :license {}
  :dependencies [[org.clojure/clojure "1.9.0-alpha14"]
                 [http-kit "2.1.18"]
                 [compojure "1.5.1"]
                 [org.clojure/data.json "0.2.6"]
                 [aleph "0.4.1"]
                 [gloss "0.2.5"]
                 [ysera "1.0.2"]]
  :main ^:skip-aot achtungonline.main
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
