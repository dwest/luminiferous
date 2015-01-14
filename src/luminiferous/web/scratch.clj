(ns luminiferous.web.scratch
  (:require [hiccup.core]
            [hiccup.page :as hiccup-page]
            [luminiferous.web.components :as components]))

(defn hello-world
  "Just setting up a landing page and linking polymer dependencies..."
  [& args]
  (hiccup-page/html5
   [:html
    [:head
     (hiccup-page/include-js 
      "/pub/lib/webcomponentsjs/webcomponents.min.js")
     [:title "Hello World"]
     (components/import
      "/pub/elements/tabbed-pages.html")]
    [:body
     [:tabbed-pages
      [:div {:data-tab-title "First"} "Page the first"]
      [:div {:data-tab-title "Second"} "Page the second"]
      [:div {:data-tab-title "Third"} "Page the third"]]
     [:footer
      [:div {:style "display: none;"}
       ; js imports
       ]]]]))

