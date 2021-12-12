diff --git a/src/test/java/com/corundumstudio/socketio/parser/DecoderEventPacketTest.java b/src/test/java/com/corundumstudio/socketio/parser/DecoderEventPacketTest.java
index ad8990f..1c6bbef 100644
--- a/src/test/java/com/corundumstudio/socketio/parser/DecoderEventPacketTest.java
+++ b/src/test/java/com/corundumstudio/socketio/parser/DecoderEventPacketTest.java
@@ -51,7 +51,7 @@
     public void testDecodeWithData() throws IOException {
         JacksonJsonSupport jsonSupport = new JacksonJsonSupport();
         jsonSupport.addEventMapping("", "edwald", HashMap.class, Integer.class, String.class);
-        PacketDecoder decoder = new PacketDecoder(jsonSupport, new NamespacesHub(new Configuration()), ackManager);
+        PacketDecoder decoder = new PacketDecoder(jsonSupport, ackManager);
 
         Packet packet = decoder.decodePacket("5:::{\"name\":\"edwald\",\"args\":[{\"a\": \"b\"},2,\"3\"]}", null);
         Assert.assertEquals(PacketType.EVENT, packet.getType());
