diff --git a/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComEnergyMessage.java b/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComEnergyMessage.java
index d2fc092..01d6d0c 100644
--- a/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComEnergyMessage.java
+++ b/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComEnergyMessage.java
@@ -139,7 +139,7 @@
 
     @Override
     public byte[] decodeMessage() {
-        byte[] data = new byte[17];
+        byte[] data = new byte[18];
 
         data[0] = 0x11;
         data[1] = RFXComBaseMessage.PacketType.ENERGY.toByte();
