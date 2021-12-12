diff --git a/integration-tests/jersey/src/test/java/org/atmosphere/jersey/tests/BuilderPubSubTest.java b/integration-tests/jersey/src/test/java/org/atmosphere/jersey/tests/BuilderPubSubTest.java
index 6065e87..70a6243 100644
--- a/integration-tests/jersey/src/test/java/org/atmosphere/jersey/tests/BuilderPubSubTest.java
+++ b/integration-tests/jersey/src/test/java/org/atmosphere/jersey/tests/BuilderPubSubTest.java
@@ -180,14 +180,14 @@
 
     @POST
     @Path("filter")
-    @Broadcast(resumeOnBroadcast = true, value = {XSSHtmlFilter.class})
+    @Broadcast(resumeOnBroadcast = true, filters = {XSSHtmlFilter.class})
     public Broadcastable filter(@FormParam("message") String message) {
         return broadcast(message);
     }
 
     @POST
     @Path("aggregate")
-    @Broadcast(resumeOnBroadcast = true, value = {StringFilterAggregator.class})
+    @Broadcast(resumeOnBroadcast = true, filters = {StringFilterAggregator.class})
     public Broadcastable aggregate(@FormParam("message") String message) {
         return broadcast(message);
     }
