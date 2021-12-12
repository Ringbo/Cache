diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/InternalOpenJobAction.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/InternalOpenJobAction.java
index 7976e53..74825f2 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/InternalOpenJobAction.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/InternalOpenJobAction.java
@@ -62,7 +62,7 @@
 
     static class RequestBuilder extends ActionRequestBuilder<Request, Response, RequestBuilder> {
 
-        public RequestBuilder(ElasticsearchClient client, InternalOpenJobAction action) {
+        RequestBuilder(ElasticsearchClient client, InternalOpenJobAction action) {
             super(client, action, new Request());
         }
     }
