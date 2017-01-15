(ns mad-libs.core
  (:gen-class))

(defn user-prompt [prompt] 
	(print prompt "")
	(flush))

(defn get-input [prompt]
	(user-prompt prompt)
	(read-line))

(defn mad-libs [noun verb adjective adverb]
	(println (str "Do you " verb " your " adjective " " noun " " adverb "? That's hilarious!")))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
