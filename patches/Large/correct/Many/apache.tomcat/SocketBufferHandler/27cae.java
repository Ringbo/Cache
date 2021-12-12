diff --git a/java/org/apache/tomcat/util/net/SocketBufferHandler.java b/java/org/apache/tomcat/util/net/SocketBufferHandler.java
index ace149f..b275773 100644
--- a/java/org/apache/tomcat/util/net/SocketBufferHandler.java
+++ b/java/org/apache/tomcat/util/net/SocketBufferHandler.java
@@ -78,9 +78,9 @@
 
     public boolean isReadBufferEmpty() {
         if (readBufferConfiguredForWrite) {
-            return readBuffer.position() > 0;
+            return readBuffer.position() == 0;
         } else {
-            return readBuffer.remaining() > 0;
+            return readBuffer.remaining() == 0;
         }
     }
 
