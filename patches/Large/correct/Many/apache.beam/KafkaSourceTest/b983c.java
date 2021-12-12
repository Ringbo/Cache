diff --git a/sdks/java/extensions/euphoria/euphoria-kafka/src/test/java/cz/seznam/euphoria/kafka/KafkaSourceTest.java b/sdks/java/extensions/euphoria/euphoria-kafka/src/test/java/cz/seznam/euphoria/kafka/KafkaSourceTest.java
index 913c333..f9e0d78 100644
--- a/sdks/java/extensions/euphoria/euphoria-kafka/src/test/java/cz/seznam/euphoria/kafka/KafkaSourceTest.java
+++ b/sdks/java/extensions/euphoria/euphoria-kafka/src/test/java/cz/seznam/euphoria/kafka/KafkaSourceTest.java
@@ -45,14 +45,14 @@
   public void testPartitions() {
     Node leaderNode = new Node(1, "localhost", 3333);
     PartitionInfo pi = new PartitionInfo("topic", 0, leaderNode, null, null);
-    tryGetPartitions(Collections.emptyList());
+    tryGetPartitions(Collections.singletonList(pi));
   }
 
   @Test(expected = IllegalStateException.class)
   @SuppressWarnings("unchecked")
   public void testNoLeader() {
     PartitionInfo pi = new PartitionInfo("topic", 0, Node.noNode(), null, null);
-    tryGetPartitions(Collections.emptyList());
+    tryGetPartitions(Collections.singletonList(pi));
   }
 
   public void tryGetPartitions(List<PartitionInfo> partitions) {
