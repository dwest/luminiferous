(ns luminiferous.web.components)

;;;; Components
;;;; Utility functions

(defn import [& components]
  (for [component components]
    [:link {:rel "import" :href component}]))
