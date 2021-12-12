diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/tools/offlineImageViewer/LsrPBImage.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/tools/offlineImageViewer/LsrPBImage.java
index b697057..7e1cea0 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/tools/offlineImageViewer/LsrPBImage.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/tools/offlineImageViewer/LsrPBImage.java
@@ -115,7 +115,7 @@
         case INODE:
           loadINodeSection(is);
           break;
-        case INODE_REFRENCE:
+        case INODE_REFERENCE:
           loadINodeReferenceSection(is);
           break;
         case INODE_DIR:
