diff --git a/modules/transport-netty4/src/main/java/org/elasticsearch/transport/netty4/Netty4InternalESLogger.java b/modules/transport-netty4/src/main/java/org/elasticsearch/transport/netty4/Netty4InternalESLogger.java
index aaa277e..91bbe1c 100644
--- a/modules/transport-netty4/src/main/java/org/elasticsearch/transport/netty4/Netty4InternalESLogger.java
+++ b/modules/transport-netty4/src/main/java/org/elasticsearch/transport/netty4/Netty4InternalESLogger.java
@@ -161,7 +161,7 @@
 
     @Override
     public void error(String msg) {
-        logger.equals(msg);
+        logger.error(msg);
     }
 
     @Override
