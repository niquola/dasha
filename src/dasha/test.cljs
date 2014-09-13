(ns dasha.test
  (:require-macros  [cljs.core.async.macros :refer  [go-loop alt! go]])
  (:require  [reagent.core :as rc]
             [cljs.core.async :refer  [put! alts! chan <! >!]]
             [cljs.reader :as cr]))

(defn log [msg] (.log js/console msg))

(defn by-id [id] (. js/document  (getElementById id)))

(def app (rc/atom (js/Date.)))

(defn title-cmp [x]
  [:h1 "rand: " [:span (:rand @x)]])

(defn layout []
  [:div.app
   [:h1 "rc"]
   [title-cmp app]])


(def es (js/EventSource. "/async"))
(set! (.-onmessage es) (fn [x] (log x)))

(log "here")
(log es)


; (def ws (js/WebSocket. "ws://nicola.waveaccess.ru:10005/"))
; (aset ws "onmessage"
;   (fn [x]
;     #_(log (cr/read-string (.-data x)))
;     (reset! app (cr/read-string (.-data x)))))

(rc/render-component [layout] (by-id "app"))
