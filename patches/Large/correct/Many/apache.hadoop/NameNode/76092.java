diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/NameNode.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/NameNode.java
index d679849..c53a374 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/NameNode.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/NameNode.java
@@ -207,7 +207,7 @@
   /** Format a new filesystem.  Destroys any filesystem that may already
    * exist at this location.  **/
   public static void format(Configuration conf) throws IOException {
-    format(conf, false);
+    format(conf, true);
   }
 
   static NameNodeMetrics metrics;
@@ -644,12 +644,12 @@
    * for each existing directory and format them.
    * 
    * @param conf
-   * @param isConfirmationNeeded
+   * @param force
    * @return true if formatting was aborted, false otherwise
    * @throws IOException
    */
   private static boolean format(Configuration conf,
-                                boolean isConfirmationNeeded)
+                                boolean force)
       throws IOException {
     String nsId = DFSUtil.getNamenodeNameServiceId(conf);
     String namenodeId = HAUtil.getNameNodeId(conf, nsId);
@@ -659,7 +659,7 @@
     Collection<URI> dirsToFormat = FSNamesystem.getNamespaceDirs(conf);
     List<URI> editDirsToFormat = 
                  FSNamesystem.getNamespaceEditsDirs(conf);
-    if (!confirmFormat(dirsToFormat, isConfirmationNeeded, true)) {
+    if (!confirmFormat(dirsToFormat, force, true)) {
       return true; // aborted
     }
 
@@ -868,7 +868,7 @@
 
     switch (startOpt) {
       case FORMAT:
-        boolean aborted = format(conf, true);
+        boolean aborted = format(conf, false);
         System.exit(aborted ? 1 : 0);
         return null; // avoid javac warning
       case GENCLUSTERID:
