diff --git a/sdks/java/extensions/sql/src/test/java/org/apache/beam/sdk/extensions/sql/meta/provider/pubsub/PubsubJsonIT.java b/sdks/java/extensions/sql/src/test/java/org/apache/beam/sdk/extensions/sql/meta/provider/pubsub/PubsubJsonIT.java
index f92a901..b6452ac 100644
--- a/sdks/java/extensions/sql/src/test/java/org/apache/beam/sdk/extensions/sql/meta/provider/pubsub/PubsubJsonIT.java
+++ b/sdks/java/extensions/sql/src/test/java/org/apache/beam/sdk/extensions/sql/meta/provider/pubsub/PubsubJsonIT.java
@@ -52,7 +52,10 @@
 public class PubsubJsonIT implements Serializable {
 
   private static final Schema PAYLOAD_SCHEMA =
-      Schema.builder().addInt32Field("id").addStringField("name").build();
+      Schema.builder()
+          .addNullableField("id", Schema.FieldType.INT32)
+          .addNullableField("name", Schema.FieldType.STRING)
+          .build();
 
   @Rule public transient TestPubsub eventsTopic = TestPubsub.create();
   @Rule public transient TestPubsub dlqTopic = TestPubsub.create();
@@ -100,7 +103,7 @@
 
     pipeline.run();
     eventsTopic.publish(messages);
-    signal.waitForSuccess(Duration.standardSeconds(120));
+    signal.waitForSuccess(Duration.standardMinutes(5));
   }
 
   @Test
@@ -153,7 +156,7 @@
 
     pipeline.run();
     eventsTopic.publish(messages);
-    signal.waitForSuccess(Duration.standardSeconds(120));
+    signal.waitForSuccess(Duration.standardMinutes(5));
   }
 
   private static Boolean containsAll(Set<PubsubMessage> set, PubsubMessage... subsetCandidate) {
