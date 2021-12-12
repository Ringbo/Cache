diff --git a/src/main/java/io/reactivex/internal/operators/completable/CompletableCreate.java b/src/main/java/io/reactivex/internal/operators/completable/CompletableCreate.java
index 39bb98a..e843e24 100644
--- a/src/main/java/io/reactivex/internal/operators/completable/CompletableCreate.java
+++ b/src/main/java/io/reactivex/internal/operators/completable/CompletableCreate.java
@@ -74,7 +74,7 @@
         @Override
         public void onError(Throwable t) {
             if (t == null) {
-                t = new NullPointerException();
+                t = new NullPointerException("Emitter got a null throwable. Null values are generally not allowed in 2.x operators and sources.");
             }
             if (get() != DisposableHelper.DISPOSED) {
                 Disposable d = getAndSet(DisposableHelper.DISPOSED);
