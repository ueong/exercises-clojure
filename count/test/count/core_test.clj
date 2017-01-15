(ns count.core-test
  (:require [clojure.test :refer :all]
            [count.core :refer :all]))

(deftest get-input-test
  (testing "get-input should return user input"
    (is (= "Tom" (with-in-str "Tom" (get-input "What is your name?"))))))

(deftest count-characters-test
	(testing "count-characters should return number of characters of input"
		(is (= 5 (count-characters "Homer")))))

(deftest print-result-test
  (testing "print-result should print result message"
    (is (= (str "Homer has 5 characters." (System/getProperty "line.separator")) (with-out-str (print-result "Homer"))))))
