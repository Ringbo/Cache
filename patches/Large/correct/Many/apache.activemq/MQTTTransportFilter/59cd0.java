diff --git a/activemq-mqtt/src/main/java/org/apache/activemq/transport/mqtt/MQTTTransportFilter.java b/activemq-mqtt/src/main/java/org/apache/activemq/transport/mqtt/MQTTTransportFilter.java
index a347371..f89a6ee 100644
--- a/activemq-mqtt/src/main/java/org/apache/activemq/transport/mqtt/MQTTTransportFilter.java
+++ b/activemq-mqtt/src/main/java/org/apache/activemq/transport/mqtt/MQTTTransportFilter.java
@@ -226,7 +226,7 @@
      *        the connection frame received timeout value.
      */
     public void setConnectAttemptTimeout(long connectTimeout) {
-        this.setConnectAttemptTimeout(connectTimeout);
+        wireFormat.setConnectAttemptTimeout(connectTimeout);
     }
 
     public boolean getPublishDollarTopics() {
