(ns spirit.essence.datomic
  (:require [spirit.essence.common :as essence]
            [spirit.essence.datomic.generate :as generate]
            [spirit.essence.datomic.analyse :as analyse]))

(defmethod essence/corporeal :datomic
  [_ essence _]
  (generate/datomic essence))

(defmethod essence/incorporeal :datomic
  [_ schema _]
  (analyse/analyse schema))
