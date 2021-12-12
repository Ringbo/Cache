diff --git a/java/org/apache/tomcat/util/net/SecureNioChannel.java b/java/org/apache/tomcat/util/net/SecureNioChannel.java
index 0122c8a..4075a0b 100644
--- a/java/org/apache/tomcat/util/net/SecureNioChannel.java
+++ b/java/org/apache/tomcat/util/net/SecureNioChannel.java
@@ -77,7 +77,7 @@
             netOutBuffer = ByteBuffer.allocateDirect(DEFAULT_NET_BUFFER_SIZE);
         } else {
             netInBuffer = ByteBuffer.allocate(DEFAULT_NET_BUFFER_SIZE);
-            netOutBuffer = ByteBuffer.allocateDirect(DEFAULT_NET_BUFFER_SIZE);
+            netOutBuffer = ByteBuffer.allocate(DEFAULT_NET_BUFFER_SIZE);
         }
 
         // selector pool for blocking operations
