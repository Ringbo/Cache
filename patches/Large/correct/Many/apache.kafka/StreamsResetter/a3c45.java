diff --git a/core/src/main/scala/kafka/tools/StreamsResetter.java b/core/src/main/scala/kafka/tools/StreamsResetter.java
index a61c092..83166cd 100644
--- a/core/src/main/scala/kafka/tools/StreamsResetter.java
+++ b/core/src/main/scala/kafka/tools/StreamsResetter.java
@@ -91,7 +91,7 @@
 
             adminClient = AdminClient.createSimplePlaintext(options.valueOf(bootstrapServerOption));
             final String groupId = options.valueOf(applicationIdOption);
-            if (!adminClient.describeConsumerGroup(groupId).consumers().get().isEmpty()) {
+            if (!adminClient.describeConsumerGroup(groupId, 0).consumers().get().isEmpty()) {
                 throw new IllegalStateException("Consumer group '" + groupId + "' is still active. " +
                     "Make sure to stop all running application instances before running the reset tool.");
             }
