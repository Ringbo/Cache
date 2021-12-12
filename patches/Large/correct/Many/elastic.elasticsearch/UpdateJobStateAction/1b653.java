diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/UpdateJobStateAction.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/UpdateJobStateAction.java
index 7220f0a..96da125 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/UpdateJobStateAction.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/UpdateJobStateAction.java
@@ -132,7 +132,7 @@
 
     static class RequestBuilder extends MasterNodeOperationRequestBuilder<Request, Response, RequestBuilder> {
 
-        public RequestBuilder(ElasticsearchClient client, UpdateJobStateAction action) {
+        RequestBuilder(ElasticsearchClient client, UpdateJobStateAction action) {
             super(client, action, new Request());
         }
     }
