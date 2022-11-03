;;Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

(def sum_of_squares
  (loop [n 1
         s 0]
    (if (<= n 100)
      (recur (inc n) (+ s (* n n)))
      s)))
(def sum 
  (loop [n 1
        s 0]
    (if (<= n 100)
      (recur (inc n) (+ s n))
      s)))

(println sum_of_squares)
(println (* sum sum))

(- (* sum sum) sum_of_squares)
