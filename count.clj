(use '[clojure.string :as s :only (trim)])
(defn get-input [prompt]
	(print prompt "")
	(flush)
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
(print-result (loop-input "What is the input string?"))