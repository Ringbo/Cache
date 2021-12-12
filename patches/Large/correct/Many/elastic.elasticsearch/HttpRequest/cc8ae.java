diff --git a/elasticsearch/x-pack/watcher/src/main/java/org/elasticsearch/watcher/support/http/HttpRequest.java b/elasticsearch/x-pack/watcher/src/main/java/org/elasticsearch/watcher/support/http/HttpRequest.java
index 53e3026..90ba411 100644
--- a/elasticsearch/x-pack/watcher/src/main/java/org/elasticsearch/watcher/support/http/HttpRequest.java
+++ b/elasticsearch/x-pack/watcher/src/main/java/org/elasticsearch/watcher/support/http/HttpRequest.java
@@ -409,7 +409,7 @@
 
         public Builder jsonBody(ToXContent xContent) {
             return body(XContentHelper.toString(xContent))
-                    .setHeader("Content-Type", XContentType.JSON.restContentType());
+                    .setHeader("Content-Type", XContentType.JSON.mediaType());
         }
 
         public Builder connectionTimeout(TimeValue timeout) {
