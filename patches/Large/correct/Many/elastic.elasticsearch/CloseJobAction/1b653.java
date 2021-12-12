diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/CloseJobAction.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/CloseJobAction.java
index bd13a3c..4908808 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/CloseJobAction.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/CloseJobAction.java
@@ -125,7 +125,7 @@
 
     static class RequestBuilder extends ActionRequestBuilder<Request, Response, RequestBuilder> {
 
-        public RequestBuilder(ElasticsearchClient client, CloseJobAction action) {
+        RequestBuilder(ElasticsearchClient client, CloseJobAction action) {
             super(client, action, new Request());
         }
     }
