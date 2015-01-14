(ns luminiferous.web.routes
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [luminiferous.web.scratch :as scratch]))

(defroutes web-ui
  (GET "/" [] scratch/hello-world)
  (GET "/example/test.json" [] "\"hello from json\"")
  (route/resources "/pub")
  (route/not-found "<h1>404 - Not Found</h1>"))
