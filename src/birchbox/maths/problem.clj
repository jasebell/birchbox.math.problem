(ns birchbox.maths.problem)

(def customers [{:id 1 :name "User1"}
                {:id 2 :name "User2"}
                {:id 3 :name "User3"}
                {:id 4 :name "User4"}
                {:id 5 :name "User5"}
                {:id 6 :name "User6"}
                {:id 7 :name "User7"}
                {:id 8 :name "User8"}
                {:id 9 :name "User9"}
                {:id 10 :name "User10"}])

(def products [{:id 1 :name "Product1" :stockqty 5}
               {:id 2 :name "Product2" :stockqty 2}
               {:id 3 :name "Product3" :stockqty 3}
               {:id 4 :name "Product4" :stockqty 9}
               {:id 5 :name "Product5" :stockqty 10}
               {:id 6 :name "Product6" :stockqty 2}
               {:id 7 :name "Product7" :stockqty 12}
               {:id 8 :name "Product8" :stockqty 15}
               {:id 9 :name "Product9" :stockqty 1}
               {:id 10 :name "Product10" :stockqty 8}])

(defn sum-products [products customers]
  (->> products
       (map (fn [product] [(:stockqty product) (count customers)] ))))





