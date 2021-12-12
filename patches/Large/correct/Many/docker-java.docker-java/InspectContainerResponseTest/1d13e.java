diff --git a/src/test/java/com/github/dockerjava/api/command/InspectContainerResponseTest.java b/src/test/java/com/github/dockerjava/api/command/InspectContainerResponseTest.java
index ee38b70..6b4a5ec 100644
--- a/src/test/java/com/github/dockerjava/api/command/InspectContainerResponseTest.java
+++ b/src/test/java/com/github/dockerjava/api/command/InspectContainerResponseTest.java
@@ -68,7 +68,7 @@
     public void roundTrip_full_healthcheck() throws IOException {
 
         final ObjectMapper mapper = new ObjectMapper();
-        final JavaType type = mapper.getTypeFactory().uncheckedSimpleType(InspectContainerResponse.class);
+        final JavaType type = mapper.getTypeFactory().constructType(InspectContainerResponse.class);
 
         final InspectContainerResponse response = testRoundTrip(RemoteApiVersion.VERSION_1_24,
                 "/containers/inspect/1.json",
@@ -139,7 +139,7 @@
     public void inspect_windows_container() throws IOException {
 
         final ObjectMapper mapper = new ObjectMapper();
-        final JavaType type = mapper.getTypeFactory().uncheckedSimpleType(InspectContainerResponse.class);
+        final JavaType type = mapper.getTypeFactory().constructType(InspectContainerResponse.class);
 
         final InspectContainerResponse response = testRoundTrip(RemoteApiVersion.VERSION_1_38,
                 "/containers/inspect/lcow.json",
