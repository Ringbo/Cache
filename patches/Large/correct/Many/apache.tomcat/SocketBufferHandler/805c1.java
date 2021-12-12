diff --git a/java/org/apache/tomcat/util/net/SocketBufferHandler.java b/java/org/apache/tomcat/util/net/SocketBufferHandler.java
index ccaedd5..d00d6f2 100644
--- a/java/org/apache/tomcat/util/net/SocketBufferHandler.java
+++ b/java/org/apache/tomcat/util/net/SocketBufferHandler.java
@@ -151,9 +151,9 @@
 
 
     public void expand(int newSize) {
-        configureReadBufferForRead();
+        configureReadBufferForWrite();
         readBuffer = ByteBufferUtils.expand(readBuffer, newSize);
-        configureWriteBufferForRead();
+        configureWriteBufferForWrite();
         writeBuffer = ByteBufferUtils.expand(writeBuffer, newSize);
     }
 }
