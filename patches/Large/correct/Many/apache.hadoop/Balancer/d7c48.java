diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/balancer/Balancer.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/balancer/Balancer.java
index 049e669..b64844b 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/balancer/Balancer.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/balancer/Balancer.java
@@ -190,7 +190,7 @@
    * balancing purpose at a datanode
    */
   public static final int MAX_NUM_CONCURRENT_MOVES = 5;
-  public static final int MAX_NO_PENDING_BLOCK_INTERATIONS = 5;
+  private static final int MAX_NO_PENDING_BLOCK_ITERATIONS = 5;
   
   private static final String USAGE = "Usage: java "
       + Balancer.class.getSimpleName()
@@ -782,7 +782,7 @@
           noPendingBlockIteration++;
           // in case no blocks can be moved for source node's task,
           // jump out of while-loop after 5 iterations.
-          if (noPendingBlockIteration >= MAX_NO_PENDING_BLOCK_INTERATIONS) {
+          if (noPendingBlockIteration >= MAX_NO_PENDING_BLOCK_ITERATIONS) {
             scheduledSize = 0;
           }
         }
