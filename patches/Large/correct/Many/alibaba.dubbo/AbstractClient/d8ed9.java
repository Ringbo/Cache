diff --git a/dubbo-remoting/dubbo-remoting-api/src/main/java/org/apache/dubbo/remoting/transport/AbstractClient.java b/dubbo-remoting/dubbo-remoting-api/src/main/java/org/apache/dubbo/remoting/transport/AbstractClient.java
index a945586..477fa71 100644
--- a/dubbo-remoting/dubbo-remoting-api/src/main/java/org/apache/dubbo/remoting/transport/AbstractClient.java
+++ b/dubbo-remoting/dubbo-remoting-api/src/main/java/org/apache/dubbo/remoting/transport/AbstractClient.java
@@ -276,7 +276,7 @@
             if (!isConnected()) {
                 throw new RemotingException(this, "Failed connect to server " + getRemoteAddress() + " from " + getClass().getSimpleName() + " "
                         + NetUtils.getLocalHost() + " using dubbo version " + Version.getVersion()
-                        + ", cause: Connect wait timeout: " + getTimeout() + "ms.");
+                        + ", cause: Connect wait timeout: " + getConnectTimeout() + "ms.");
             } else {
                 if (logger.isInfoEnabled()) {
                     logger.info("Successed connect to server " + getRemoteAddress() + " from " + getClass().getSimpleName() + " "
