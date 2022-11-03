;;Largest palindrome of two 3 digit numbers
(comment
  So the basic idea is to loop from the top (* 999 999)
  to the bottom (* 100 100) and find the palindromes
)

(defn digest
  "Turns a number from a number to a list"
  [number]
  (loop [n number
         l []]
    (if (> n 0)
      (recur (quot n 10) (conj l (rem n 10)))
      l)))

(defn is_palindrome
  "Checks if a six digit number is a palindrome"
  [number]
  (loop [n (digest number)]
    (if (= (count n) 0)
      true
      (if (= (first n) (last n))
        (recur (drop 1 (drop-last n)))
        false))))

(loop [i 999]
  (when (>= i 100)
    (loop [j i]
      (when (is_palindrome (* i j))
        (println (* i j)))
      (when (>= j 100)
        (recur (dec j))))
    (recur (dec i))))
