diff --git a/transport/mqtt/src/main/java/org/thingsboard/server/transport/mqtt/MqttTransportHandler.java b/transport/mqtt/src/main/java/org/thingsboard/server/transport/mqtt/MqttTransportHandler.java
index 76cdf1a..36868c5 100644
--- a/transport/mqtt/src/main/java/org/thingsboard/server/transport/mqtt/MqttTransportHandler.java
+++ b/transport/mqtt/src/main/java/org/thingsboard/server/transport/mqtt/MqttTransportHandler.java
@@ -247,7 +247,7 @@
 
     private MqttMessage createUnSubAckMessage(int msgId) {
         MqttFixedHeader mqttFixedHeader =
-                new MqttFixedHeader(SUBACK, false, AT_LEAST_ONCE, false, 0);
+                new MqttFixedHeader(UNSUBACK, false, AT_LEAST_ONCE, false, 0);
         MqttMessageIdVariableHeader mqttMessageIdVariableHeader = MqttMessageIdVariableHeader.from(msgId);
         return new MqttMessage(mqttFixedHeader, mqttMessageIdVariableHeader);
     }
