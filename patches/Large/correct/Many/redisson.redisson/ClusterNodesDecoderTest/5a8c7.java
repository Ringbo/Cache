diff --git a/redisson/src/test/java/org/redisson/client/protocol/decoder/ClusterNodesDecoderTest.java b/redisson/src/test/java/org/redisson/client/protocol/decoder/ClusterNodesDecoderTest.java
index 69fe85e..0d4252c 100644
--- a/redisson/src/test/java/org/redisson/client/protocol/decoder/ClusterNodesDecoderTest.java
+++ b/redisson/src/test/java/org/redisson/client/protocol/decoder/ClusterNodesDecoderTest.java
@@ -14,7 +14,7 @@
 
     @Test
     public void test() throws IOException {
-        ClusterNodesDecoder decoder = new ClusterNodesDecoder();
+        ClusterNodesDecoder decoder = new ClusterNodesDecoder(false);
         ByteBuf buf = Unpooled.buffer();
         
         String info = "7af253f8c20a3b3fbd481801bd361ec6643c6f0b 192.168.234.129:7001@17001 master - 0 1478865073260 8 connected 5461-10922\n" +
