(ns hello.core-test
  (:require [clojure.test :refer :all]
            [hello.core :refer :all]))

(deftest get-input-test
  (testing "get-input should return user input"
    (is (= "Tom" (with-in-str "Tom" (get-input "What is your name? "))))))

(deftest string-concat-test
	(testing "string-concat should make hello message from a name"
		(is (= "Hello, Brian, nice to meet you!" (string-concat "Brian")))))

(deftest hello-test
  (testing "hello should print hello message"
    (is (= (str "Hello, Tom, nice to meet you!" (System/getProperty "line.separator")) (with-out-str (hello "Tom"))))))
