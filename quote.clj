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
(defn print-result [what who]
	(println (str who " says, \"" what ".\"")))
(print-result (loop-input "What is the quote?") (loop-input "Who said it?") )