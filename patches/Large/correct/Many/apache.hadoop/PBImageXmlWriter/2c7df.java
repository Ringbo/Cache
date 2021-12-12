diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/tools/offlineImageViewer/PBImageXmlWriter.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/tools/offlineImageViewer/PBImageXmlWriter.java
index 659f133..1f43b5b 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/tools/offlineImageViewer/PBImageXmlWriter.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/tools/offlineImageViewer/PBImageXmlWriter.java
@@ -113,7 +113,7 @@
         case INODE:
           dumpINodeSection(is);
           break;
-        case INODE_REFRENCE:
+        case INODE_REFERENCE:
           dumpINodeReferenceSection(is);
           break;
         case INODE_DIR:
