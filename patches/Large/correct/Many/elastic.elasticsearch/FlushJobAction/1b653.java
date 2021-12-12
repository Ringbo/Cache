diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/FlushJobAction.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/FlushJobAction.java
index 5d41094..8c72eb1 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/FlushJobAction.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/FlushJobAction.java
@@ -187,7 +187,7 @@
 
     static class RequestBuilder extends ActionRequestBuilder<Request, Response, RequestBuilder> {
 
-        public RequestBuilder(ElasticsearchClient client, FlushJobAction action) {
+        RequestBuilder(ElasticsearchClient client, FlushJobAction action) {
             super(client, action, new Request());
         }
     }
