diff --git a/community/test/java/org/neo4j/ha/LocalhostZooKeeperCluster.java b/community/test/java/org/neo4j/ha/LocalhostZooKeeperCluster.java
index 5236d30..9d42d71 100644
--- a/community/test/java/org/neo4j/ha/LocalhostZooKeeperCluster.java
+++ b/community/test/java/org/neo4j/ha/LocalhostZooKeeperCluster.java
@@ -68,7 +68,7 @@
     private String config( TargetDirectory target, int id, int port )
     {
         File config = target.file( "zookeeper" + id + ".cfg" );
-        File dataDir = target.directory( "zk" + id + "data" );
+        File dataDir = target.directory( "zk" + id + "data", true );
         try
         {
             PrintWriter conf = new PrintWriter( config );
