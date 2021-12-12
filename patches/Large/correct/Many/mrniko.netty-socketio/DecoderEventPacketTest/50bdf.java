diff --git a/src/test/java/com/corundumstudio/socketio/parser/DecoderEventPacketTest.java b/src/test/java/com/corundumstudio/socketio/parser/DecoderEventPacketTest.java
index f41e439..5f6f030 100644
--- a/src/test/java/com/corundumstudio/socketio/parser/DecoderEventPacketTest.java
+++ b/src/test/java/com/corundumstudio/socketio/parser/DecoderEventPacketTest.java
@@ -45,7 +45,7 @@
     @Test
     public void testDecodeWithData() throws IOException {
         JacksonJsonSupport jsonSupport = new JacksonJsonSupport(new Configuration());
-        jsonSupport.addEventMapping("edwald", HashMap.class);
+        jsonSupport.addEventMapping("edwald", HashMap.class, Integer.class, String.class);
         Decoder decoder = new Decoder(jsonSupport, ackManager);
 
         Packet packet = decoder.decodePacket("5:::{\"name\":\"edwald\",\"args\":[{\"a\": \"b\"},2,\"3\"]}", null);
