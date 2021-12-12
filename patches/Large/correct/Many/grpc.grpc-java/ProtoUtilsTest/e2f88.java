diff --git a/protobuf/src/test/java/io/grpc/protobuf/ProtoUtilsTest.java b/protobuf/src/test/java/io/grpc/protobuf/ProtoUtilsTest.java
index c6212f4..c06d9e0 100644
--- a/protobuf/src/test/java/io/grpc/protobuf/ProtoUtilsTest.java
+++ b/protobuf/src/test/java/io/grpc/protobuf/ProtoUtilsTest.java
@@ -77,7 +77,8 @@
 
   @Test
   public void marshallerShouldNotLimitProtoSize() throws Exception {
-    byte[] bigName = new byte[100 * 1024 * 1024];
+    // The default limit is 64MB. Using a larger proto to verify that the limit is not enforced.
+    byte[] bigName = new byte[70 * 1024 * 1024];
     new Random().nextBytes(bigName);
 
     proto = Type.newBuilder().setNameBytes(ByteString.copyFrom(bigName)).build();
