diff --git a/plugin/src/test/java/org/elasticsearch/xpack/ml/job/persistence/MockClientBuilder.java b/plugin/src/test/java/org/elasticsearch/xpack/ml/job/persistence/MockClientBuilder.java
index 5b37091..a689adf 100644
--- a/plugin/src/test/java/org/elasticsearch/xpack/ml/job/persistence/MockClientBuilder.java
+++ b/plugin/src/test/java/org/elasticsearch/xpack/ml/job/persistence/MockClientBuilder.java
@@ -173,10 +173,10 @@
     }
 
     @SuppressWarnings({ "rawtypes", "unchecked" })
-    public MockClientBuilder createIndexRequest(ArgumentCaptor<CreateIndexRequest> requestCapture) {
+    public MockClientBuilder createIndexRequest(ArgumentCaptor<CreateIndexRequest> requestCapture, final String index) {
 
         doAnswer(invocation -> {
-            CreateIndexResponse response = new CreateIndexResponse(true, true) {};
+            CreateIndexResponse response = new CreateIndexResponse(true, true, index) {};
             ((ActionListener) invocation.getArguments()[1]).onResponse(response);
             return null;
         }).when(indicesAdminClient).create(requestCapture.capture(), any(ActionListener.class));
