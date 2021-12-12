diff --git a/src/test/java/com/github/dockerjava/cmd/UpdateContainerCmdIT.java b/src/test/java/com/github/dockerjava/cmd/UpdateContainerCmdIT.java
index d63f6aa..238a0da 100644
--- a/src/test/java/com/github/dockerjava/cmd/UpdateContainerCmdIT.java
+++ b/src/test/java/com/github/dockerjava/cmd/UpdateContainerCmdIT.java
@@ -84,7 +84,7 @@
     @Test
     public void serDerDocs1() throws IOException {
         final ObjectMapper mapper = new ObjectMapper();
-        final JavaType type = mapper.getTypeFactory().uncheckedSimpleType(UpdateContainerCmdImpl.class);
+        final JavaType type = mapper.getTypeFactory().constructType(UpdateContainerCmdImpl.class);
 
         final UpdateContainerCmdImpl upd = testRoundTrip(VERSION_1_22,
                 "/containers/container/update/docs.json",
