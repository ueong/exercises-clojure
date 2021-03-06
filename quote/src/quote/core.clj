(ns quote.core
  (:gen-class))
(use '[clojure.string :as s :only (trim)])

(defn user-prompt [prompt] 
	(print prompt "")
	(flush))

(defn get-input [prompt]
	(user-prompt prompt)
	(read-line))

(defn who-says-what [who what]
	(println (str who " says, \"" what "\"")))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (print "Hello World!"))
