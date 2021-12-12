diff --git a/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComCurrentMessage.java b/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComCurrentMessage.java
index 995c6cd..7852203 100644
--- a/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComCurrentMessage.java
+++ b/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComCurrentMessage.java
@@ -128,7 +128,7 @@
 
     @Override
     public byte[] decodeMessage() {
-        byte[] data = new byte[13];
+        byte[] data = new byte[14];
 
         data[0] = 0x0D;
         data[1] = RFXComBaseMessage.PacketType.CURRENT.toByte();
