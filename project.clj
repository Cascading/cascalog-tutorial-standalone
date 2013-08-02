;;
;; Copyright (c) 2007-2013 Concurrent, Inc. All Rights Reserved.
;;
;; Project and contact information: http://www.cascading.org/
;;
;; This file is part of the Cascading project.
;;
;; Licensed under the Apache License, Version 2.0 (the "License");
;; you may not use this file except in compliance with the License.
;; You may obtain a copy of the License at
;;
;;     http://www.apache.org/licenses/LICENSE-2.0
;;
;; Unless required by applicable law or agreed to in writing, software
;; distributed under the License is distributed on an "AS IS" BASIS,
;; WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
;; See the License for the specific language governing permissions and
;; limitations under the License.

(defproject cascalog-standalone-tutorial "1.10.1"
  :description "The cascalog tutorial"
  :url "http://cascalog.org/articles/getting_started.html"
  :license {:name "Apache license version 2"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :repositories {"conjars" "http://conjars.org/repo/"}

  :dependencies [[org.clojure/clojure "1.5.1"] 
                 [cascalog/cascalog "1.10.2"]
                 ; version range pulling in the latest 2.2 build
                 [cascading/cascading-hadoop "[2.2.0,2.3.0)" ]
                 ]
  :profiles {:provided
             {:dependencies
              [[org.apache.hadoop/hadoop-core "1.1.2"]]}} 
  ; the libdir plugin creates a directory with all dependencies, so that we can
  ; run fully offline
  :plugins [[lein-libdir "0.1.1"]]
  :libdir-path "lib")

