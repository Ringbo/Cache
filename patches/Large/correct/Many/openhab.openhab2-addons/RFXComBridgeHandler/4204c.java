diff --git a/addons/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/handler/RFXComBridgeHandler.java b/addons/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/handler/RFXComBridgeHandler.java
index 78f16a0..7fb2e4f 100644
--- a/addons/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/handler/RFXComBridgeHandler.java
+++ b/addons/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/handler/RFXComBridgeHandler.java
@@ -325,7 +325,7 @@
             connector.sendMessage(data);
         } catch (IOException e) {
             updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.COMMUNICATION_ERROR);
-            throw new RFXComException(e);
+            throw new RFXComException("Send failed, reason: " + e.getMessage(), e);
         }
 
         try {
