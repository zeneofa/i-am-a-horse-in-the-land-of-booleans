(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false)
  )

(defn abs [x]
  (if (< x 0)
  (* x -1)
  (* x 1)))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
  true
  false
  ))

(defn fizzbuzz [n]
  (cond 
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else "")
  )

(defn teen? [age]
  (< 12 age 20)
  )

(defn not-teen? [age]
  (if (not (teen? age))
    true
    false
    )
  )

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x) (* (count x) 2)
    (vector? x) (* (count x) 2)
    :else true
    )
  )

(defn leap-year? [year]
  (cond
    (and (divides? 100 year)
         (divides? 400 year)
         ) true
    (and (divides? 4 year)
         ( not (divides? 100 year))
         ) true
    :else false)
  )

; '_______'
