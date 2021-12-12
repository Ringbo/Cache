diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/BPOfferService.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/BPOfferService.java
index 084b9de..5caf54f 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/BPOfferService.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/BPOfferService.java
@@ -331,7 +331,8 @@
     }
   }
 
-  synchronized DatanodeRegistration createRegistration() {
+  synchronized DatanodeRegistration createRegistration()
+      throws IOException {
     Preconditions.checkState(bpNSInfo != null,
         "getRegistration() can only be called after initial handshake");
     return dn.createBPRegistration(bpNSInfo);
