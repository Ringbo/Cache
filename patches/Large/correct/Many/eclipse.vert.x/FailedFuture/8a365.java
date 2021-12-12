diff --git a/src/main/java/io/vertx/core/impl/FailedFuture.java b/src/main/java/io/vertx/core/impl/FailedFuture.java
index 41183f5..22f5bee 100644
--- a/src/main/java/io/vertx/core/impl/FailedFuture.java
+++ b/src/main/java/io/vertx/core/impl/FailedFuture.java
@@ -47,22 +47,22 @@
 
   @Override
   public void complete(T result) {
-    throw new IllegalStateException();
+    throw new IllegalStateException("Result is already complete: failed");
   }
 
   @Override
   public void complete() {
-    throw new IllegalStateException();
+    throw new IllegalStateException("Result is already complete: failed");
   }
 
   @Override
   public void fail(Throwable cause) {
-    throw new IllegalStateException();
+    throw new IllegalStateException("Result is already complete: failed");
   }
 
   @Override
   public void fail(String failureMessage) {
-    throw new IllegalStateException();
+    throw new IllegalStateException("Result is already complete: failed");
   }
 
   @Override
@@ -107,6 +107,6 @@
 
   @Override
   public void handle(AsyncResult<T> asyncResult) {
-    throw new IllegalStateException();
+    throw new IllegalStateException("Result is already complete: failed");
   }
 }
