diff --git a/server/test/unit/com/thoughtworks/go/server/service/plugins/processor/session/SessionRequestProcessorTest.java b/server/test/unit/com/thoughtworks/go/server/service/plugins/processor/session/SessionRequestProcessorTest.java
index e7a2a51..fd2e02e 100644
--- a/server/test/unit/com/thoughtworks/go/server/service/plugins/processor/session/SessionRequestProcessorTest.java
+++ b/server/test/unit/com/thoughtworks/go/server/service/plugins/processor/session/SessionRequestProcessorTest.java
@@ -63,7 +63,7 @@
     @Test
     public void shouldHandleIncorrectAPIVersion() {
         GoApiResponse response = processor.process(getGoPluginApiRequest("1.1", null, null));
-        assertThat(response.responseCode(), is(400));
+        assertThat(response.responseCode(), is(500));
     }
 
     @Test
@@ -95,7 +95,7 @@
 
         GoApiResponse response = applicationAccessorSpy.process(getGoPluginApiRequest("1.0", SessionRequestProcessor.PUT_INTO_SESSION, requestBody));
 
-        assertThat(response.responseCode(), is(400));
+        assertThat(response.responseCode(), is(500));
     }
 
     @Test
@@ -130,7 +130,7 @@
 
         GoApiResponse response = applicationAccessorSpy.process(getGoPluginApiRequest("1.0", SessionRequestProcessor.GET_FROM_SESSION, requestBody));
 
-        assertThat(response.responseCode(), is(400));
+        assertThat(response.responseCode(), is(500));
     }
 
     @Test
@@ -159,7 +159,7 @@
 
         GoApiResponse response = applicationAccessorSpy.process(getGoPluginApiRequest("1.0", SessionRequestProcessor.REMOVE_FROM_SESSION, requestBody));
 
-        assertThat(response.responseCode(), is(400));
+        assertThat(response.responseCode(), is(500));
     }
 
     private GoApiRequest getGoPluginApiRequest(final String apiVersion, final String authenticateUserRequest, final String requestBody) {
