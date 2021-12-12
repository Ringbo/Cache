diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/OpenJobAction.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/OpenJobAction.java
index d256fa9..feb2979 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/OpenJobAction.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/OpenJobAction.java
@@ -136,7 +136,7 @@
 
     static class RequestBuilder extends ActionRequestBuilder<Request, Response, RequestBuilder> {
 
-        public RequestBuilder(ElasticsearchClient client, OpenJobAction action) {
+        RequestBuilder(ElasticsearchClient client, OpenJobAction action) {
             super(client, action, new Request());
         }
     }
