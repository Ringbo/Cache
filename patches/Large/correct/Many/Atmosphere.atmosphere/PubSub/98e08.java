diff --git a/samples/pubsub/src/main/java/org/atmosphere/samples/pubsub/PubSub.java b/samples/pubsub/src/main/java/org/atmosphere/samples/pubsub/PubSub.java
index a511506..a11d476 100755
--- a/samples/pubsub/src/main/java/org/atmosphere/samples/pubsub/PubSub.java
+++ b/samples/pubsub/src/main/java/org/atmosphere/samples/pubsub/PubSub.java
@@ -186,7 +186,7 @@
      * @return A {@link Broadcastable} used to broadcast events.
      */
     @POST
-    @Broadcast(value = {StringFilterAggregator.class})
+    @Broadcast(filters = {StringFilterAggregator.class})
     @Path("aggregate")
     public Broadcastable aggregate(@FormParam("message") String message) {
         return broadcast(message);
