diff --git a/src/main/java/io/reactivex/internal/operators/maybe/MaybeCreate.java b/src/main/java/io/reactivex/internal/operators/maybe/MaybeCreate.java
index a0bcbfc..1db8614 100644
--- a/src/main/java/io/reactivex/internal/operators/maybe/MaybeCreate.java
+++ b/src/main/java/io/reactivex/internal/operators/maybe/MaybeCreate.java
@@ -69,7 +69,7 @@
                 if (d != DisposableHelper.DISPOSED) {
                     try {
                         if (value == null) {
-                            actual.onError(new NullPointerException());
+                            actual.onError(new NullPointerException("Emitter got a null value. Null values are generally not allowed in 2.x operators and sources."));
                         } else {
                             actual.onSuccess(value);
                         }
@@ -85,7 +85,7 @@
         @Override
         public void onError(Throwable t) {
             if (t == null) {
-                t = new NullPointerException();
+                t = new NullPointerException("Emitter got a null throwable. Null values are generally not allowed in 2.x operators and sources.");
             }
             if (get() != DisposableHelper.DISPOSED) {
                 Disposable d = getAndSet(DisposableHelper.DISPOSED);
