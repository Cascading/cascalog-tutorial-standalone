(defproject cascalog-playground "1.10.1"
  :description "The cascalog tutorial"
  :url "http://cascalog.org/articles/getting_started.html"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories {"conjars" "http://conjars.org/repo/"}

  :dependencies [[org.clojure/clojure "1.5.1"] 
                 [cascalog/cascalog "1.10.1"]
                 ; version range pulling in the latest 2.2-wip build
                 [cascading/cascading-hadoop "[2.2.0,2.3.0)" ]
                 ]
  :profiles {:provided
             {:dependencies
              [[org.apache.hadoop/hadoop-core "1.1.2"]]}} 
  :plugins [[lein-libdir "0.1.1"]
            [lein-tar "2.0.0"] 
           ]
  :libdir-path "lib")

