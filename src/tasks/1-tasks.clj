; 1.2
(println (/ (+ (+ 4 5) (- 2 (- 3 (+ 6 (/ 4 5))))) (* 3 (* (- 6 2) (- 2 7)))))


; 1.3
(defn square [a] (* a a))

(defn sum-of-squares [a b c]
  (println (+ (square (max a b)) (square (max b c)))))

(sum-of-squares 3 2 4) ; 25