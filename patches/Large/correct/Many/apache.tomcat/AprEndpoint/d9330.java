diff --git a/java/org/apache/tomcat/util/net/AprEndpoint.java b/java/org/apache/tomcat/util/net/AprEndpoint.java
index df00a6c..1d80e74 100644
--- a/java/org/apache/tomcat/util/net/AprEndpoint.java
+++ b/java/org/apache/tomcat/util/net/AprEndpoint.java
@@ -848,7 +848,7 @@
             pool = Pool.create(serverSockPool);
             int size = pollerSize / pollerThreadCount;
             int timeout = getKeepAliveTimeout();
-            if (timeout < 0) {
+            if (timeout <= 0) {
                 timeout = socketProperties.getSoTimeout();
             }
             serverPollset = allocatePoller(size, pool, timeout);
