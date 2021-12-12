diff --git a/src/test/java/com/github/dockerjava/api/command/InspectExecResponseTest.java b/src/test/java/com/github/dockerjava/api/command/InspectExecResponseTest.java
index 7290f12..9c26418 100644
--- a/src/test/java/com/github/dockerjava/api/command/InspectExecResponseTest.java
+++ b/src/test/java/com/github/dockerjava/api/command/InspectExecResponseTest.java
@@ -21,7 +21,7 @@
     @Test
     public void test_1_22_SerDer1() throws Exception {
         final ObjectMapper mapper = new ObjectMapper();
-        final JavaType type = mapper.getTypeFactory().uncheckedSimpleType(InspectExecResponse.class);
+        final JavaType type = mapper.getTypeFactory().constructType(InspectExecResponse.class);
 
         final InspectExecResponse execResponse = testRoundTrip(RemoteApiVersion.VERSION_1_22,
                 "/exec/ID/1.json",
