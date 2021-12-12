diff --git a/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComDateTimeMessage.java b/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComDateTimeMessage.java
index 0e33b63..d082447 100644
--- a/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComDateTimeMessage.java
+++ b/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComDateTimeMessage.java
@@ -163,9 +163,9 @@
 
     @Override
     public byte[] decodeMessage() {
-        byte[] data = new byte[13];
+        byte[] data = new byte[14];
 
-        data[0] = 0x0D;
+        data[0] = (byte)(data.length-1);
         data[1] = RFXComBaseMessage.PacketType.DATE_TIME.toByte();
         data[2] = subType.toByte();
         data[3] = seqNbr;
