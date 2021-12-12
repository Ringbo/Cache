diff --git a/src/main/java/io/vertx/core/http/impl/HttpClientImpl.java b/src/main/java/io/vertx/core/http/impl/HttpClientImpl.java
index 27fd1d1..94b7311 100644
--- a/src/main/java/io/vertx/core/http/impl/HttpClientImpl.java
+++ b/src/main/java/io/vertx/core/http/impl/HttpClientImpl.java
@@ -895,7 +895,7 @@
   }
 
   @Override
-  public synchronized void close() {
+  public void close() {
     synchronized (this) {
       checkClosed();
       closed = true;
