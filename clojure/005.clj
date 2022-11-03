;;Smallest number evenly divisible by numbers 1-20

(defn evenly_divisible
  "Checks if a number is evenly divisble by 1-20"
  [number]
  (loop [n number
         i 2]
    (if (<= i 20)
      (if (= (rem n i) 0)
        (recur n (inc i))
        false)
      true)))

(loop [n 1]
  (if (evenly_divisible n)
  n
  (recur (inc n))))
