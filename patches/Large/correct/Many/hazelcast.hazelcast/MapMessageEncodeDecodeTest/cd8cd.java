diff --git a/hazelcast/src/test/java/com/hazelcast/client/protocol/MapMessageEncodeDecodeTest.java b/hazelcast/src/test/java/com/hazelcast/client/protocol/MapMessageEncodeDecodeTest.java
index 6fa5ea8..9c50ed6 100644
--- a/hazelcast/src/test/java/com/hazelcast/client/protocol/MapMessageEncodeDecodeTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/client/protocol/MapMessageEncodeDecodeTest.java
@@ -55,7 +55,7 @@
     @Test
     public void shouldEncodeDecodeWithHeaderCorrectly_PUT() {
         byteBuffer = ByteBuffer
-                .allocate(MapPutParameters.encodeSizeCost(NAME, BYTES_DATA, BYTES_DATA, THE_LONG, THE_LONG, THE_BOOLEAN));
+                .allocate(MapPutParameters.encodeSizeCost(NAME, BYTES_DATA, BYTES_DATA));
         ClientMessage cmEncode = new ClientMessage();
         cmEncode.wrapForEncode(byteBuffer, 0);
 
