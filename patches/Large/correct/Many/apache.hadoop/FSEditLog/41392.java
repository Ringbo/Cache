diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/FSEditLog.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/FSEditLog.java
index 54b5f1a..11c6948 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/FSEditLog.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/FSEditLog.java
@@ -341,7 +341,7 @@
    * File-based journals are skipped, since they are formatted by the
    * Storage format code.
    */
-  void formatNonFileJournals(NamespaceInfo nsInfo) throws IOException {
+  synchronized void formatNonFileJournals(NamespaceInfo nsInfo) throws IOException {
     Preconditions.checkState(state == State.BETWEEN_LOG_SEGMENTS,
         "Bad state: %s", state);
     
@@ -352,7 +352,7 @@
     }
   }
   
-  List<FormatConfirmable> getFormatConfirmables() {
+  synchronized List<FormatConfirmable> getFormatConfirmables() {
     Preconditions.checkState(state == State.BETWEEN_LOG_SEGMENTS,
         "Bad state: %s", state);
 
