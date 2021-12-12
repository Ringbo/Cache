diff --git a/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComRainMessage.java b/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComRainMessage.java
index e457558..7e03019 100644
--- a/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComRainMessage.java
+++ b/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComRainMessage.java
@@ -112,7 +112,7 @@
 
     @Override
     public byte[] decodeMessage() {
-        byte[] data = new byte[10];
+        byte[] data = new byte[12];
 
         data[0] = 0x0B;
         data[1] = RFXComBaseMessage.PacketType.RAIN.toByte();
