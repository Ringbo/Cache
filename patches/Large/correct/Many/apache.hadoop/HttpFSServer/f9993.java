diff --git a/hadoop-hdfs-project/hadoop-hdfs-httpfs/src/main/java/org/apache/hadoop/fs/http/server/HttpFSServer.java b/hadoop-hdfs-project/hadoop-hdfs-httpfs/src/main/java/org/apache/hadoop/fs/http/server/HttpFSServer.java
index 43d1f72..95c4942 100644
--- a/hadoop-hdfs-project/hadoop-hdfs-httpfs/src/main/java/org/apache/hadoop/fs/http/server/HttpFSServer.java
+++ b/hadoop-hdfs-project/hadoop-hdfs-httpfs/src/main/java/org/apache/hadoop/fs/http/server/HttpFSServer.java
@@ -291,7 +291,7 @@
           response = Response.ok(json).type(MediaType.APPLICATION_JSON).build();
           break;
         }
-        case GETHOMEDIR: {
+        case GETHOMEDIRECTORY: {
           FSOperations.FSHomeDir command = new FSOperations.FSHomeDir();
           JSONObject json = fsExecute(user, doAs.value(), command);
           AUDIT_LOG.info("");
