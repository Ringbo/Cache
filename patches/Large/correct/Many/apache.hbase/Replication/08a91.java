diff --git a/src/main/java/org/apache/hadoop/hbase/replication/regionserver/Replication.java b/src/main/java/org/apache/hadoop/hbase/replication/regionserver/Replication.java
index 983ab86..464de86 100644
--- a/src/main/java/org/apache/hadoop/hbase/replication/regionserver/Replication.java
+++ b/src/main/java/org/apache/hadoop/hbase/replication/regionserver/Replication.java
@@ -191,7 +191,7 @@
   }
 
   @Override
-  public void postLogRoll(Path oldPath, Path newPath) {
+  public void postLogRoll(Path oldPath, Path newPath) throws IOException {
     getReplicationManager().logRolled(newPath);
   }
 
