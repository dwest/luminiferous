(defproject luminiferous "0.1.0-SNAPSHOT"
  :description "A Frontend to KVM"
  :url "todo"
  :license {:name "MIT"
            :url "http://choosealicense.com/licenses/mit/"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2665"]
                 [compojure "1.3.1"]
                 [hiccup "1.0.5"]]

  :prep-tasks ["javac" "compile" "bower"]

  :plugins [[lein-ring "0.9.1"]
            [org.clojars.wokier/lein-bower "0.3.0"]]

  :ring {:handler luminiferous.web.routes/web-ui})
