diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/BPOfferService.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/BPOfferService.java
index 791b2e7..8f8dd21 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/BPOfferService.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/BPOfferService.java
@@ -148,7 +148,7 @@
     return false;
   }
   
-  String getBlockPoolId() {
+  synchronized String getBlockPoolId() {
     if (bpNSInfo != null) {
       return bpNSInfo.getBlockPoolID();
     } else {
@@ -163,7 +163,7 @@
   }
 
   @Override
-  public String toString() {
+  public synchronized String toString() {
     if (bpNSInfo == null) {
       // If we haven't yet connected to our NN, we don't yet know our
       // own block pool ID.
