diff --git a/rxjava-core/src/main/java/rx/Observable.java b/rxjava-core/src/main/java/rx/Observable.java
index 4723484..e6a3dd4 100644
--- a/rxjava-core/src/main/java/rx/Observable.java
+++ b/rxjava-core/src/main/java/rx/Observable.java
@@ -5296,7 +5296,9 @@
      * @see <a href="https://github.com/Netflix/RxJava/wiki/Observable-Utility-Operators#wiki-parallel">RxJava Wiki: parallel()</a>
      */
     public final <R> Observable<R> parallel(Func1<Observable<T>, Observable<R>> f) {
-        return lift(new OperatorParallel<T, R>(f, Schedulers.computation()));
+        // TODO move this back to Schedulers.computation() again once that is properly using eventloops
+        // see https://github.com/Netflix/RxJava/issues/713 for why this was changed
+        return lift(new OperatorParallel<T, R>(f, Schedulers.newThread()));
     }
 
     /**
