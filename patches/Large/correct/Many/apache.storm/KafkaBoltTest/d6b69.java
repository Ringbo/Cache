diff --git a/external/storm-kafka/src/test/org/apache/storm/kafka/bolt/KafkaBoltTest.java b/external/storm-kafka/src/test/org/apache/storm/kafka/bolt/KafkaBoltTest.java
index cccbce0..3b8bea1 100644
--- a/external/storm-kafka/src/test/org/apache/storm/kafka/bolt/KafkaBoltTest.java
+++ b/external/storm-kafka/src/test/org/apache/storm/kafka/bolt/KafkaBoltTest.java
@@ -97,7 +97,7 @@
     }
 
     @Test
-    public void shouldAcknowledgeTickTuples() throws Exception {
+    public void shouldNotAcknowledgeTickTuples() throws Exception {
         // Given
         Tuple tickTuple = mockTickTuple();
 
@@ -105,7 +105,7 @@
         bolt.execute(tickTuple);
 
         // Then
-        verify(collector).ack(tickTuple);
+        verify(collector, never()).ack(tickTuple);
     }
 
     @Test
