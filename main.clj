;; ejercicio 1
(defn funclineal [m b x]
  (+(* m x) b))
(funclineal 4 5 6)
;;ejercicio 2
(defn pendiente [x1 y1 x2 y2]
(cond 
  (== (/(- y2 y1)(- x2 x1)) 0) "La pendiente es constante"
  (> (/(- y2 y1)(- x2 x1)) 0) "La pendiente es creciente"
  (< (/(- y2 y1)(- x2 x1)) 0) "La pendiente es decreciente"))
;;ejercicio 3
(defn funcpuntoenrecta [m b x y]
(cond
  (= (funclineal m b x) y) "El punto esta en la recta"
  :else "El punto NO esta en la recta"))
(funcpuntoenrecta 4 5 6 26)
;;ejercicio 4
(defn funcB [m x y]
  (- y (* m x)))
;;ejercicio 5
(defn funcM [x1 y1 x2 y2]
 (/(- y2 y1)(- x2 x1)))
(funcM -2 -4 0 2)
(defn funcmb [x1 y1 x2 y2]
  (def m (funcM x1 y1 x2 y2))
  (def b (funcB m x1 y1))
 (str "m:" m  " " "b:" b))
(funcmb -2 -4 0 2)


