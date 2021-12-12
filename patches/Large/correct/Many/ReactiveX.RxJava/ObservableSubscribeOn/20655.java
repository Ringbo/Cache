diff --git a/src/main/java/io/reactivex/internal/operators/observable/ObservableSubscribeOn.java b/src/main/java/io/reactivex/internal/operators/observable/ObservableSubscribeOn.java
index 5876727..de9b402 100644
--- a/src/main/java/io/reactivex/internal/operators/observable/ObservableSubscribeOn.java
+++ b/src/main/java/io/reactivex/internal/operators/observable/ObservableSubscribeOn.java
@@ -22,7 +22,7 @@
 public final class ObservableSubscribeOn<T> extends AbstractObservableWithUpstream<T, T> {
     final Scheduler scheduler;
 
-    public ObservableSubscribeOn(Observable<T> source, Scheduler scheduler) {
+    public ObservableSubscribeOn(ObservableSource<T> source, Scheduler scheduler) {
         super(source);
         this.scheduler = scheduler;
     }
