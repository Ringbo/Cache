diff --git a/hadoop-hdfs-project/hadoop-hdfs-httpfs/src/main/java/org/apache/hadoop/fs/http/client/HttpFSFileSystem.java b/hadoop-hdfs-project/hadoop-hdfs-httpfs/src/main/java/org/apache/hadoop/fs/http/client/HttpFSFileSystem.java
index 03c8548..4a1a205 100644
--- a/hadoop-hdfs-project/hadoop-hdfs-httpfs/src/main/java/org/apache/hadoop/fs/http/client/HttpFSFileSystem.java
+++ b/hadoop-hdfs-project/hadoop-hdfs-httpfs/src/main/java/org/apache/hadoop/fs/http/client/HttpFSFileSystem.java
@@ -159,7 +159,7 @@
    * Get operations.
    */
   public enum GetOpValues {
-    OPEN, GETFILESTATUS, LISTSTATUS, GETHOMEDIR, GETCONTENTSUMMARY, GETFILECHECKSUM,
+    OPEN, GETFILESTATUS, LISTSTATUS, GETHOMEDIRECTORY, GETCONTENTSUMMARY, GETFILECHECKSUM,
     GETDELEGATIONTOKEN, GETFILEBLOCKLOCATIONS, INSTRUMENTATION
   }
 
@@ -684,7 +684,7 @@
   @Override
   public Path getHomeDirectory() {
     Map<String, String> params = new HashMap<String, String>();
-    params.put(OP_PARAM, GetOpValues.GETHOMEDIR.toString());
+    params.put(OP_PARAM, GetOpValues.GETHOMEDIRECTORY.toString());
     try {
       HttpURLConnection conn = getConnection(HTTP_GET, params, new Path(getUri().toString(), "/"), false);
       validateResponse(conn, HttpURLConnection.HTTP_OK);
