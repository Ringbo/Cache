diff --git a/src/main/java/io/reactivex/internal/operators/observable/ObservableReduceSeedSingle.java b/src/main/java/io/reactivex/internal/operators/observable/ObservableReduceSeedSingle.java
index a36fe4c..4e064d9 100644
--- a/src/main/java/io/reactivex/internal/operators/observable/ObservableReduceSeedSingle.java
+++ b/src/main/java/io/reactivex/internal/operators/observable/ObservableReduceSeedSingle.java
@@ -57,7 +57,7 @@
 
         Disposable d;
 
-        public ReduceSeedObserver(SingleObserver<? super R> actual, BiFunction<R, ? super T, R> reducer, R value) {
+        ReduceSeedObserver(SingleObserver<? super R> actual, BiFunction<R, ? super T, R> reducer, R value) {
             this.actual = actual;
             this.value = value;
             this.reducer = reducer;
