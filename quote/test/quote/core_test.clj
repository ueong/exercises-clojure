(ns quote.core-test
  (:require [clojure.test :refer :all]
            [quote.core :refer :all]))

(deftest user-prompt-test
	(testing "user-prompt should print user prompt for input"
		(is (= "What's your name? " 
			(with-out-str (user-prompt "What's your name?"))))))
(deftest get-input-test
	(testing "get-input should return user input"
		(is (= "Tom"
			(with-in-str "Tom"
				(get-input "just prompt"))))))

(deftest who-says-what-test
	(testing "who-says-what should print who says what from two inputs"
		(is (= "Obi-Wan Kenobi says, \"These aren't the droids you're looking for.\"\n"
			(with-out-str (who-says-what "Obi-Wan Kenobi", "These aren't the droids you're looking for."))))))
