diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/StartDatafeedAction.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/StartDatafeedAction.java
index 87861c0..15bb7d9 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/StartDatafeedAction.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/StartDatafeedAction.java
@@ -189,7 +189,7 @@
 
     static class RequestBuilder extends ActionRequestBuilder<Request, PersistentActionResponse, RequestBuilder> {
 
-        public RequestBuilder(ElasticsearchClient client, StartDatafeedAction action) {
+        RequestBuilder(ElasticsearchClient client, StartDatafeedAction action) {
             super(client, action, new Request());
         }
     }
