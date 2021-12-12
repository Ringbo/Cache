diff --git a/src/main/java/io/reactivex/internal/operators/observable/ObservableReduceMaybe.java b/src/main/java/io/reactivex/internal/operators/observable/ObservableReduceMaybe.java
index c9d016a..55706d7 100644
--- a/src/main/java/io/reactivex/internal/operators/observable/ObservableReduceMaybe.java
+++ b/src/main/java/io/reactivex/internal/operators/observable/ObservableReduceMaybe.java
@@ -55,7 +55,7 @@
 
         Disposable d;
 
-        public ReduceObserver(MaybeObserver<? super T> observer, BiFunction<T, T, T> reducer) {
+        ReduceObserver(MaybeObserver<? super T> observer, BiFunction<T, T, T> reducer) {
             this.actual = observer;
             this.reducer = reducer;
         }
