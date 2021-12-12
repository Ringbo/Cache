diff --git a/client/rest-high-level/src/main/java/org/elasticsearch/client/MLRequestConverters.java b/client/rest-high-level/src/main/java/org/elasticsearch/client/MLRequestConverters.java
index 024ba9e..6c1cc20 100644
--- a/client/rest-high-level/src/main/java/org/elasticsearch/client/MLRequestConverters.java
+++ b/client/rest-high-level/src/main/java/org/elasticsearch/client/MLRequestConverters.java
@@ -70,7 +70,7 @@
         return request;
     }
 
-    static Request openJob(OpenJobRequest openJobRequest) {
+    static Request openJob(OpenJobRequest openJobRequest) throws IOException {
         String endpoint = new EndpointBuilder()
                 .addPathPartAsIs("_xpack")
                 .addPathPartAsIs("ml")
