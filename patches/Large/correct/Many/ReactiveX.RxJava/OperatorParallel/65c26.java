diff --git a/rxjava-core/src/main/java/rx/operators/OperatorParallel.java b/rxjava-core/src/main/java/rx/operators/OperatorParallel.java
index e7ac12d..dcc92bf 100644
--- a/rxjava-core/src/main/java/rx/operators/OperatorParallel.java
+++ b/rxjava-core/src/main/java/rx/operators/OperatorParallel.java
@@ -41,7 +41,7 @@
     public Subscriber<? super T> call(Subscriber<? super R> op) {
 
         Func1<Subscriber<? super GroupedObservable<Long, T>>, Subscriber<? super T>> groupBy =
-                new OnSubscribeGroupBy<Long, T>(new Func1<T, Long>() {
+                new OperatorGroupBy<Long, T>(new Func1<T, Long>() {
 
                     long i = 0;
 
