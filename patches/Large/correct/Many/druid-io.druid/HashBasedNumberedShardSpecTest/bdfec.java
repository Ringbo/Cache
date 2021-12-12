diff --git a/server/src/test/java/io/druid/server/shard/HashBasedNumberedShardSpecTest.java b/server/src/test/java/io/druid/server/shard/HashBasedNumberedShardSpecTest.java
index 5f17601..2ab8265 100644
--- a/server/src/test/java/io/druid/server/shard/HashBasedNumberedShardSpecTest.java
+++ b/server/src/test/java/io/druid/server/shard/HashBasedNumberedShardSpecTest.java
@@ -196,8 +196,9 @@
   }
 
   @Test
-  public void testValidity(){
-    for(int i=Integer.MIN_VALUE;i<=Integer.MAX_VALUE;i++){
+  public void testValidity()
+  {
+    for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
       {
         int partitionNum = Math.abs((int) ((long) i % 2));
         if(partitionNum != 0 && partitionNum != 1){
