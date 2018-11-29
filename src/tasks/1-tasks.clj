;1.2
(println (/ (+ (+ 4 5) (- 2 (- 3 (+ 6 (/ 4 5))))) (* 3 (* (- 6 2) (- 2 7)))))

; 1.3
(defn square [a] (* a a))
(defn sum-of-squares [a b c]
  (println (+ (square (max a b)) (square (max b c)))))

(sum-of-squares 3 2 4) ; 25

;1.4
(defn a-plus-abs-b [a b]
        ((if (> b 0) + -) a b)) ; if b>0 => + else -

;1.5
(defn p[] (p))
(defn test [x y]
        (if (= x 0)
          0
          y))

(test 0 (p))
; Applicative order vs Normal order
;
; In the applicative order the arguments to a function are
; always evaluated completely before the function is applied,
; so we recieve stack overflow error at 22
; In the normal order arguments to a function are not
; evaluated unless they are actually used.
; Clojure uses applicative order(both the operator and
; the operands (if any) are evaluated, from left to right).