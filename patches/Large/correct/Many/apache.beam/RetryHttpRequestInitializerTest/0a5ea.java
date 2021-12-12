diff --git a/sdks/java/extensions/google-cloud-platform-core/src/test/java/org/apache/beam/sdk/util/RetryHttpRequestInitializerTest.java b/sdks/java/extensions/google-cloud-platform-core/src/test/java/org/apache/beam/sdk/util/RetryHttpRequestInitializerTest.java
index 5e7c2d0..3c3282e 100644
--- a/sdks/java/extensions/google-cloud-platform-core/src/test/java/org/apache/beam/sdk/util/RetryHttpRequestInitializerTest.java
+++ b/sdks/java/extensions/google-cloud-platform-core/src/test/java/org/apache/beam/sdk/util/RetryHttpRequestInitializerTest.java
@@ -239,7 +239,7 @@
     try {
       result.executeUnparsed();
       fail();
-    } catch (Throwable t) {
+    } catch (IOException e) {
     }
 
     verify(mockHttpResponseInterceptor).interceptResponse(any(HttpResponse.class));
