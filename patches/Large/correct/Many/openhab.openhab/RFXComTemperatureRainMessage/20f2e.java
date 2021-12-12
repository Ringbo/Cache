diff --git a/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComTemperatureRainMessage.java b/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComTemperatureRainMessage.java
index 8410fb9..0012bf3 100644
--- a/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComTemperatureRainMessage.java
+++ b/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComTemperatureRainMessage.java
@@ -108,9 +108,9 @@
 
     @Override
     public byte[] decodeMessage() {
-        byte[] data = new byte[10];
+        byte[] data = new byte[11];
 
-        data[0] = 0x0B;
+        data[0] = (byte)(data.length-1);
         data[1] = RFXComBaseMessage.PacketType.TEMPERATURE_RAIN.toByte();
         data[2] = subType.toByte();
         data[3] = seqNbr;
