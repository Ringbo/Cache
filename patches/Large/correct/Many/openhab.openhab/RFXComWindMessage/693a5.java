diff --git a/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComWindMessage.java b/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComWindMessage.java
index 54b8255..1c8d002 100644
--- a/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComWindMessage.java
+++ b/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComWindMessage.java
@@ -137,7 +137,7 @@
 
     @Override
     public byte[] decodeMessage() {
-        byte[] data = new byte[16];
+        byte[] data = new byte[17];
 
         data[0] = 0x10;
         data[1] = RFXComBaseMessage.PacketType.RAIN.toByte();
