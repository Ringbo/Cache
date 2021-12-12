diff --git a/src/main/java/io/vertx/core/impl/SucceededFuture.java b/src/main/java/io/vertx/core/impl/SucceededFuture.java
index 1561f7c..bd5be09 100644
--- a/src/main/java/io/vertx/core/impl/SucceededFuture.java
+++ b/src/main/java/io/vertx/core/impl/SucceededFuture.java
@@ -22,11 +22,11 @@
 /**
  * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
  */
-public class SucceededFuture<T> implements Future<T> {
+class SucceededFuture<T> implements Future<T> {
 
   private final T result;
 
-  public SucceededFuture(T result) {
+  SucceededFuture(T result) {
     this.result = result;
   }
 
@@ -43,22 +43,22 @@
 
   @Override
   public void complete(T result) {
-    throw new IllegalStateException();
+    throw new IllegalStateException("Result is already complete: succeeded");
   }
 
   @Override
   public void complete() {
-    throw new IllegalStateException();
+    throw new IllegalStateException("Result is already complete: succeeded");
   }
 
   @Override
   public void fail(Throwable cause) {
-    throw new IllegalStateException();
+    throw new IllegalStateException("Result is already complete: succeeded");
   }
 
   @Override
   public void fail(String failureMessage) {
-    throw new IllegalStateException();
+    throw new IllegalStateException("Result is already complete: succeeded");
   }
 
   @Override
@@ -103,6 +103,6 @@
 
   @Override
   public void handle(AsyncResult<T> asyncResult) {
-    throw new IllegalStateException();
+    throw new IllegalStateException("Result is already complete: succeeded");
   }
 }
