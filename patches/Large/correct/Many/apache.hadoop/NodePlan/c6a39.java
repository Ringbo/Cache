diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/diskbalancer/planner/NodePlan.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/diskbalancer/planner/NodePlan.java
index 153536a..c72bb1f 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/diskbalancer/planner/NodePlan.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/diskbalancer/planner/NodePlan.java
@@ -166,7 +166,7 @@
   public String toJson() throws IOException {
     ObjectMapper mapper = new ObjectMapper();
     JavaType planType = mapper.constructType(NodePlan.class);
-    return mapper.writerWithType(planType)
+    return mapper.writerFor(planType)
         .writeValueAsString(this);
   }
 
