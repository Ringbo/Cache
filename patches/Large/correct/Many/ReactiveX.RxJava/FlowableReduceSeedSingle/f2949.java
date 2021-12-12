diff --git a/src/main/java/io/reactivex/internal/operators/flowable/FlowableReduceSeedSingle.java b/src/main/java/io/reactivex/internal/operators/flowable/FlowableReduceSeedSingle.java
index 516752c..67fc400 100644
--- a/src/main/java/io/reactivex/internal/operators/flowable/FlowableReduceSeedSingle.java
+++ b/src/main/java/io/reactivex/internal/operators/flowable/FlowableReduceSeedSingle.java
@@ -59,7 +59,7 @@
 
         Subscription s;
 
-        public ReduceSeedObserver(SingleObserver<? super R> actual, BiFunction<R, ? super T, R> reducer, R value) {
+        ReduceSeedObserver(SingleObserver<? super R> actual, BiFunction<R, ? super T, R> reducer, R value) {
             this.actual = actual;
             this.value = value;
             this.reducer = reducer;
