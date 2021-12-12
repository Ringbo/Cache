diff --git a/src/main/java/io/vertx/core/http/impl/HttpClientRequestImpl.java b/src/main/java/io/vertx/core/http/impl/HttpClientRequestImpl.java
index d29e624..5dec8bb 100644
--- a/src/main/java/io/vertx/core/http/impl/HttpClientRequestImpl.java
+++ b/src/main/java/io/vertx/core/http/impl/HttpClientRequestImpl.java
@@ -599,7 +599,7 @@
 
     HttpClientConnection conn = stream.connection();
 
-    synchronized (conn) {
+    synchronized (this) {
       this.conn = conn;
       this.stream = stream;
       stream.beginRequest(this);
