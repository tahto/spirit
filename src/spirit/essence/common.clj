(ns spirit.essence.common
  (:require [hara.common.checks :refer [boolean?]]))

(def base
  {:type         {:default :string}
   :cardinality  {:check #{:one :many}
                  :default :one}
   :doc          {:check string?}
   :unique       {:check #{:value :identity}}
   :index        {:check boolean?}
   :required     {:check boolean?}
   :restrict     {}
   :default      {:check identity}})

(defmulti corporeal (fn [realm essence opts] realm))

(defmulti incorporeal (fn [realm schema opts] realm))
