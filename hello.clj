(defn get-input [prompt] 
  (print prompt)
  (flush)
  (read-line))
(defn string-concat [name] (str "Hello, " name ", nice to meet you!"))
(defn hello [input] 
  (println (string-concat input)))
(hello (get-input "What is your name? "))
