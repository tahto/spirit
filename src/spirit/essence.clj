(ns spirit.essence
  (:require [spirit.essence.common :as essence]))

(defn corporeal [realm essence]
  (essence/corporeal realm essence))

(defn incorporeal [realm schema]
  (essence/corporeal realm schema))