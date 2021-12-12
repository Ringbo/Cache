diff --git a/activemq-core/src/main/java/org/apache/activemq/broker/TransportConnection.java b/activemq-core/src/main/java/org/apache/activemq/broker/TransportConnection.java
index 9cdebd6..461125a 100755
--- a/activemq-core/src/main/java/org/apache/activemq/broker/TransportConnection.java
+++ b/activemq-core/src/main/java/org/apache/activemq/broker/TransportConnection.java
@@ -290,7 +290,7 @@
         } else if (!stopping.get() && !inServiceException) {
             inServiceException = true;
             try {
-                SERVICELOG.error("Async error occurred: " + e, e);
+                SERVICELOG.warn("Async error occurred: " + e, e);
                 ConnectionError ce = new ConnectionError();
                 ce.setException(e);
                 dispatchAsync(ce);
