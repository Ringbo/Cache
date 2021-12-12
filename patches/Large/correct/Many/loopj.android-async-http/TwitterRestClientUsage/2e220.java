diff --git a/examples/TwitterRestClientUsage.java b/examples/TwitterRestClientUsage.java
index bfa87d7..522eee7 100644
--- a/examples/TwitterRestClientUsage.java
+++ b/examples/TwitterRestClientUsage.java
@@ -6,7 +6,7 @@
 
 class TwitterRestClientUsage {
     public void getPublicTimeline() {
-        ExampleRestClient.get("statuses/public_timeline.json", null, new JsonHttpResponseHandler() {
+        TwitterRestClient.get("statuses/public_timeline.json", null, new JsonHttpResponseHandler() {
             @Override
             public void onSuccess(Object response) {
                 JSONArray timeline = (JSONArray)response;
