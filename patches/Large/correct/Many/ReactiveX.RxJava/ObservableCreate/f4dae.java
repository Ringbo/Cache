diff --git a/src/main/java/io/reactivex/internal/operators/observable/ObservableCreate.java b/src/main/java/io/reactivex/internal/operators/observable/ObservableCreate.java
index e30ec52..a14703e 100644
--- a/src/main/java/io/reactivex/internal/operators/observable/ObservableCreate.java
+++ b/src/main/java/io/reactivex/internal/operators/observable/ObservableCreate.java
@@ -60,7 +60,7 @@
         @Override
         public void onNext(T t) {
             if (t == null) {
-                onError(new NullPointerException());
+                onError(new NullPointerException("Emitter got a null value. Null values are generally not allowed in 2.x operators and sources."));
             }
             if (!isDisposed()) {
                 observer.onNext(t);
@@ -70,7 +70,7 @@
         @Override
         public void onError(Throwable t) {
             if (t == null) {
-                t = new NullPointerException();
+                t = new NullPointerException("Emitter got a null throwable. Null values are generally not allowed in 2.x operators and sources.");
             }
             if (!isDisposed()) {
                 try {
