(ns maru.test.common.game.rule
  (:use [maru.common.game.rule] :reload)
  (:use [maru.common.board.core])
  (:use [clojure.test]))

(testing "liberty-count"
  (testing "empty-board"
    (is (= 0 (liberty-count :board :white (to-pos 0 0)))))
  (testing "move to the corner"
    (is (= 2 (liberty-count (play (to-pos 0 0) :white) :white (to-pos 0 0)))))


         )
