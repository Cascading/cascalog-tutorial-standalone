# Cascalog tutorial

This is a standalone project of the [cascalog][cascalog] [tutorial][tutorial]. It is no different from
the tutorial in cascalog proper. The project exists for easier inclusion in the
[Cascading SDK][sdk]. It is not meant for direct download from gitub, it is used
by the buildsystem of [concurrent inc][concurrent], when assembling the SDK. 

## Making the tutorial ready for distribution

If you however want to use it for your own purpose anyway do the following:

 > gradle runLeiningen

This will create the directory `build/assembly/cascalog-tutorial-standalone`,
which is a fully working `leiningen 2` project. The project will contain a `lib`
directory with all jars necessary for running cascalog. There is also a task for
creating a tarball and for uploading the tarball into S3, which are used for
creating the [SDK][sdk].


[cascalog]: https://github.com/nathanmarz/cascalog
[tutorial]: http://nathanmarz.com/blog/introducing-cascalog-a-clojure-based-query-language-for-hado.html
[sdk]: http://cascading.org/sdk
[concurrent]: http://concurrentinc.com/


