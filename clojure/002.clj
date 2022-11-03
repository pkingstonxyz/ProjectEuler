;;Sum of all even fibbonacci terms up to 4000000
(loop [term 1
       prev 1
       sum 0]
  (println (str term))
  (if (< term 4000000)
    (if (zero? (rem term 2))
      (recur (+ term prev) term (+ sum term))
      (recur (+ term prev) term sum))
    (println (str "The sum is " sum))))
