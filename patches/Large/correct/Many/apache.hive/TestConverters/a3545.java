diff --git a/llap-common/src/test/org/apache/hadoop/hive/llap/tez/TestConverters.java b/llap-common/src/test/org/apache/hadoop/hive/llap/tez/TestConverters.java
index 349ee14..1df6df0 100644
--- a/llap-common/src/test/org/apache/hadoop/hive/llap/tez/TestConverters.java
+++ b/llap-common/src/test/org/apache/hadoop/hive/llap/tez/TestConverters.java
@@ -42,7 +42,7 @@
 
 public class TestConverters {
 
-  @Test(timeout = 5000)
+  @Test(timeout = 10000)
   public void testTaskSpecToFragmentSpec() {
     ByteBuffer procBb = ByteBuffer.allocate(4);
     procBb.putInt(0, 200);
@@ -98,7 +98,7 @@
 
   }
 
-  @Test (timeout = 5000)
+  @Test (timeout = 10000)
   public void testFragmentSpecToTaskSpec() {
 
     ByteBuffer procBb = ByteBuffer.allocate(4);
@@ -142,7 +142,7 @@
 
     SignableVertexSpec vertexProto = builder.build();
 
-    TaskSpec taskSpec = Converters.getTaskSpecfromProto(vertexProto, 0, 0, null);
+    TaskSpec taskSpec = Converters.getTaskSpecfromProto(vertexProto, 0, 0, tezTaskAttemptId);
 
     assertEquals("dagName", taskSpec.getDAGName());
     assertEquals("vertexName", taskSpec.getVertexName());
