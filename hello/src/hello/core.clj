(ns hello.core)

(defn user-prompt [prompt] (print prompt) (flush))
(def user-message println)

(defn get-input [prompt] 
  (user-prompt prompt)
  (read-line))
(defn string-concat [name] (str "Hello, " name ", nice to meet you!"))
(defn hello [input] 
  (user-message (string-concat input)))

(defn -main []
  (hello (get-input "What is your name? ")))
