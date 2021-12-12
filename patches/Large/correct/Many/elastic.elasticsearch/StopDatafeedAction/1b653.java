diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/StopDatafeedAction.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/StopDatafeedAction.java
index fa69230..edd773b 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/StopDatafeedAction.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/action/StopDatafeedAction.java
@@ -111,7 +111,7 @@
 
     static class RequestBuilder extends ActionRequestBuilder<Request, RemovePersistentTaskAction.Response, RequestBuilder> {
 
-        public RequestBuilder(ElasticsearchClient client, StopDatafeedAction action) {
+        RequestBuilder(ElasticsearchClient client, StopDatafeedAction action) {
             super(client, action, new Request());
         }
     }
