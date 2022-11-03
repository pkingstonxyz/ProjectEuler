;;Prime factorization of 600851475143
(comment 
  Algorithm being implemented
  def primeFactors(n):
    c = 2
    while(n > 1):
 
        if(n % c == 0):
            print(c, end=" ")
            n = n / c
        else:
            c = c + 1
    Instead of printing, I'm going to add it to a set I'll build
    and print out at the end
)

(loop [n 600851475143
       c 2
       s #{}]
  (if (> n 1)
    (if (zero? (rem n c))
      (recur (/ n c) c (conj s c))
      (recur n (inc c) s))
    (println s)))
