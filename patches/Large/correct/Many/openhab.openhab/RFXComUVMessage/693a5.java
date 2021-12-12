diff --git a/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComUVMessage.java b/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComUVMessage.java
index ba32214..d89eb87 100644
--- a/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComUVMessage.java
+++ b/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComUVMessage.java
@@ -126,7 +126,7 @@
 
     @Override
     public byte[] decodeMessage() {
-        byte[] data = new byte[9];
+        byte[] data = new byte[10];
 
         data[0] = 0x09;
         data[1] = RFXComBaseMessage.PacketType.UV.toByte();
