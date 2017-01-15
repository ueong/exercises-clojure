(ns mad-libs.core-test
  (:require [clojure.test :refer :all]
            [mad-libs.core :refer :all]))

(deftest user-prompt-test
	(testing "user-prompt should print user prompt for input"
		(is (= "What's your name? " 
			(with-out-str (user-prompt "What's your name?"))))))
(deftest get-input-test
	(testing "get-input should return user input"
		(is (= "Tom"
			(with-in-str "Tom"
				(get-input "just prompt"))))))

(deftest mad-libs-test
	(testing "mad-libs should print story from user-input noun, verb, adjective, adverb"
		(is (=
			"Do you walk your blue dog quickly? That's hilarious!\n"
			(with-out-str (mad-libs "dog" "walk" "blue" "quickly"))))))