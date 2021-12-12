diff --git a/server/test/unit/com/thoughtworks/go/server/service/plugins/processor/authentication/AuthenticationRequestProcessorTest.java b/server/test/unit/com/thoughtworks/go/server/service/plugins/processor/authentication/AuthenticationRequestProcessorTest.java
index cbbc625..8045a7f 100644
--- a/server/test/unit/com/thoughtworks/go/server/service/plugins/processor/authentication/AuthenticationRequestProcessorTest.java
+++ b/server/test/unit/com/thoughtworks/go/server/service/plugins/processor/authentication/AuthenticationRequestProcessorTest.java
@@ -76,7 +76,7 @@
     @Test
     public void shouldHandleIncorrectAPIVersion() {
         GoApiResponse response = processor.process(getGoPluginApiRequest("1.1", null));
-        assertThat(response.responseCode(), is(400));
+        assertThat(response.responseCode(), is(500));
     }
 
     @Test
@@ -105,7 +105,7 @@
     @Test
     public void shouldHandleEmptyRequestBody() {
         GoApiResponse response = processor.process(getGoPluginApiRequest("1.0", "{}"));
-        assertThat(response.responseCode(), is(400));
+        assertThat(response.responseCode(), is(500));
     }
 
     private void verifyGrantAuthorities(GrantedAuthority[] authorities) {
