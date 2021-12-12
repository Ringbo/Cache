diff --git a/src/java/org/jivesoftware/messenger/muc/spi/MUCUserImpl.java b/src/java/org/jivesoftware/messenger/muc/spi/MUCUserImpl.java
index d8512ab..bf134d7 100644
--- a/src/java/org/jivesoftware/messenger/muc/spi/MUCUserImpl.java
+++ b/src/java/org/jivesoftware/messenger/muc/spi/MUCUserImpl.java
@@ -284,8 +284,8 @@
     }
 
     public void process(IQ packet) {
-        // Ignore IQs of type ERROR sent to a room 
-        if (IQ.Type.error == packet.getType()) {
+        // Ignore IQs of type ERROR or RESULT sent to a room
+        if (IQ.Type.error == packet.getType() || IQ.Type.result == packet.getType()) {
             return;
         }
         lastPacketTime = System.currentTimeMillis();
