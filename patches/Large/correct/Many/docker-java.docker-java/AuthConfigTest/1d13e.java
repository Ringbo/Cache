diff --git a/src/test/java/com/github/dockerjava/api/model/AuthConfigTest.java b/src/test/java/com/github/dockerjava/api/model/AuthConfigTest.java
index add1e7a..d470ff1 100644
--- a/src/test/java/com/github/dockerjava/api/model/AuthConfigTest.java
+++ b/src/test/java/com/github/dockerjava/api/model/AuthConfigTest.java
@@ -25,7 +25,7 @@
     @Test
     public void serderDocs1() throws IOException {
         final ObjectMapper mapper = new ObjectMapper();
-        final JavaType type = mapper.getTypeFactory().uncheckedSimpleType(AuthConfig.class);
+        final JavaType type = mapper.getTypeFactory().constructType(AuthConfig.class);
 
         final AuthConfig authConfig = testRoundTrip(RemoteApiVersion.VERSION_1_22,
                 "/other/AuthConfig/docs1.json",
@@ -47,7 +47,7 @@
     @Test
     public void serderDocs2() throws IOException {
         final ObjectMapper mapper = new ObjectMapper();
-        final JavaType type = mapper.getTypeFactory().uncheckedSimpleType(AuthConfig.class);
+        final JavaType type = mapper.getTypeFactory().constructType(AuthConfig.class);
 
         final AuthConfig authConfig = testRoundTrip(RemoteApiVersion.VERSION_1_22,
                 "/other/AuthConfig/docs2.json",
@@ -66,7 +66,7 @@
     @Test
     public void compatibleWithIdentitytoken() throws IOException {
         final ObjectMapper mapper = new ObjectMapper();
-        final JavaType type = mapper.getTypeFactory().uncheckedSimpleType(AuthConfig.class);
+        final JavaType type = mapper.getTypeFactory().constructType(AuthConfig.class);
         final AuthConfig authConfig = testRoundTrip(RemoteApiVersion.VERSION_1_23,
                 "/other/AuthConfig/docs1.json",
                 type
@@ -83,7 +83,7 @@
     @Test
     public void shouldNotFailWithStackOrchestratorInConfig() throws IOException {
         final ObjectMapper mapper = new ObjectMapper();
-        final JavaType type = mapper.getTypeFactory().uncheckedSimpleType(AuthConfig.class);
+        final JavaType type = mapper.getTypeFactory().constructType(AuthConfig.class);
         final AuthConfig authConfig = testRoundTrip(RemoteApiVersion.VERSION_1_25,
                 "/other/AuthConfig/orchestrators.json",
                 type
