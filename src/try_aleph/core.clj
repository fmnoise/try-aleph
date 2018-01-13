(ns try-aleph.core
  (:gen-class)
  (:require [aleph.http :as http]))

(defn -main [& _]
  (http/start-server (fn [_] {:body "hi from aleph"})
                     {:port 8888}))
