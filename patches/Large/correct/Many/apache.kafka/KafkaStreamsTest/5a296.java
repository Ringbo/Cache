diff --git a/streams/src/test/java/org/apache/kafka/streams/KafkaStreamsTest.java b/streams/src/test/java/org/apache/kafka/streams/KafkaStreamsTest.java
index 73e7dc3..ab299dd 100644
--- a/streams/src/test/java/org/apache/kafka/streams/KafkaStreamsTest.java
+++ b/streams/src/test/java/org/apache/kafka/streams/KafkaStreamsTest.java
@@ -402,7 +402,8 @@
         assertNotNull(threadMetadata);
         assertEquals(2, threadMetadata.size());
         for (ThreadMetadata metadata : threadMetadata) {
-            assertTrue(Utils.mkList("RUNNING", "CREATED").contains(metadata.threadState()));
+            assertTrue("#threadState() was: " + metadata.threadState() + "; expected either RUNNING or CREATED",
+                Utils.mkList("RUNNING", "CREATED").contains(metadata.threadState()));
             assertEquals(0, metadata.standbyTasks().size());
             assertEquals(0, metadata.activeTasks().size());
         }
