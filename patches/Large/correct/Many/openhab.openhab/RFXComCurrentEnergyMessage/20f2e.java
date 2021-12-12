diff --git a/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComCurrentEnergyMessage.java b/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComCurrentEnergyMessage.java
index 5ddaf07..089b46b 100644
--- a/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComCurrentEnergyMessage.java
+++ b/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComCurrentEnergyMessage.java
@@ -147,9 +147,9 @@
 
     @Override
     public byte[] decodeMessage() {
-        byte[] data = new byte[19];
+        byte[] data = new byte[20];
 
-        data[0] = 0x13;
+        data[0] = (byte)(data.length-1);
         data[1] = RFXComBaseMessage.PacketType.CURRENT_ENERGY.toByte();
         data[2] = subType.toByte();
         data[3] = seqNbr;
