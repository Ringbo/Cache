diff --git a/integration-tests/jersey/src/test/java/org/atmosphere/jersey/tests/PubSubTest.java b/integration-tests/jersey/src/test/java/org/atmosphere/jersey/tests/PubSubTest.java
index ec08640..007cbb2 100644
--- a/integration-tests/jersey/src/test/java/org/atmosphere/jersey/tests/PubSubTest.java
+++ b/integration-tests/jersey/src/test/java/org/atmosphere/jersey/tests/PubSubTest.java
@@ -166,14 +166,14 @@
 
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
