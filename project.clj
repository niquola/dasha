(defproject dasha "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins  [[lein-cljsbuild "1.0.3"]]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/core.async "0.1.338.0-5c5012-alpha"]
                 [ring "1.3.1"]
                 [hiccup "1.0.5"]
                 [markdown-clj "0.9.47"]
                 [compojure "1.1.8"]
                 [org.clojure/clojurescript "0.0-2311"]
                 [om "0.7.1"]
                 [reagent "0.4.2"]
                 [http-kit "2.1.16"]]
  :cljsbuild {:builds  [{:id "dev"
                         :source-paths  ["src"]
                         :incremental true
                         :compiler  {:output-to "resources/public/app.js"
                                     :output-dir "resources/public"
                                     :optimizations :none
                                     :source-map true}}]}
  )
