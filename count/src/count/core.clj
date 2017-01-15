(ns count.core)
(use '[clojure.string :as s :only (trim)])

(defn user-prompt [prompt] (print prompt "") (flush))

(defn get-input [prompt]
	(user-prompt prompt)
	(s/trim (read-line)))

(defn loop-input [prompt]
		(if-let [input (not-empty (get-input prompt))]
			input
			(do
				(println "Input something") 
				(recur prompt))))

(defn count-characters [input] (count input))
(defn print-result [input]
	(println input "has" (count-characters input) "characters."))

(defn -main []
  (print-result (loop-input "What is the input string?")))