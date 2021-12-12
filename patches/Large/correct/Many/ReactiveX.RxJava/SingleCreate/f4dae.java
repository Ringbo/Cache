diff --git a/src/main/java/io/reactivex/internal/operators/single/SingleCreate.java b/src/main/java/io/reactivex/internal/operators/single/SingleCreate.java
index 294a49d..a654a39 100644
--- a/src/main/java/io/reactivex/internal/operators/single/SingleCreate.java
+++ b/src/main/java/io/reactivex/internal/operators/single/SingleCreate.java
@@ -63,7 +63,7 @@
                 if (d != DisposableHelper.DISPOSED) {
                     try {
                         if (value == null) {
-                            actual.onError(new NullPointerException());
+                            actual.onError(new NullPointerException("Emitter got a null value. Null values are generally not allowed in 2.x operators and sources."));
                         } else {
                             actual.onSuccess(value);
                         }
@@ -79,7 +79,7 @@
         @Override
         public void onError(Throwable t) {
             if (t == null) {
-                t = new NullPointerException();
+                t = new NullPointerException("Emitter got a null throwable. Null values are generally not allowed in 2.x operators and sources.");
             }
             if (get() != DisposableHelper.DISPOSED) {
                 Disposable d = getAndSet(DisposableHelper.DISPOSED);
