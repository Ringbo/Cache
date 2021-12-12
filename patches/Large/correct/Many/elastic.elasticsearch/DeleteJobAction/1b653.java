diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/DeleteJobAction.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/DeleteJobAction.java
index fed7a02..1e6e747 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/DeleteJobAction.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/DeleteJobAction.java
@@ -114,7 +114,7 @@
 
     static class RequestBuilder extends MasterNodeOperationRequestBuilder<Request, Response, RequestBuilder> {
 
-        public RequestBuilder(ElasticsearchClient client, DeleteJobAction action) {
+        RequestBuilder(ElasticsearchClient client, DeleteJobAction action) {
             super(client, action, new Request());
         }
     }
