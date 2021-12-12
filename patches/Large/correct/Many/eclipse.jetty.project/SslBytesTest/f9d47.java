diff --git a/jetty-client/src/test/java/org/eclipse/jetty/client/ssl/SslBytesTest.java b/jetty-client/src/test/java/org/eclipse/jetty/client/ssl/SslBytesTest.java
index 8e7c61e..0da45dd 100644
--- a/jetty-client/src/test/java/org/eclipse/jetty/client/ssl/SslBytesTest.java
+++ b/jetty-client/src/test/java/org/eclipse/jetty/client/ssl/SslBytesTest.java
@@ -150,7 +150,7 @@
             }
             catch (IOException x)
             {
-                logger.warn(x.getClass() + ": " + x.getMessage());
+                logger.info(x.getClass() + ": " + x.getMessage());
 
                 if(logger.isDebugEnabled())
                     logger.debug(x);
