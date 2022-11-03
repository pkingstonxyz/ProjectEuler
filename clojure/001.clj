;;Sum of all numbers divisible by 3 or 5 from 1-1000
(loop [iteration 1 
       sum 0]
  (if (< iteration 1000)
    (recur (inc iteration) 
           (if (or (zero? (rem iteration 3)) (zero? (rem iteration 5)))
             (+ sum iteration)
             (sum)))
    (println (str "Sum is " sum))))
