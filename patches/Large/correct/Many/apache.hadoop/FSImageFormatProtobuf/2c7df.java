diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/FSImageFormatProtobuf.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/FSImageFormatProtobuf.java
index 9224543..284f39d 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/FSImageFormatProtobuf.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/FSImageFormatProtobuf.java
@@ -235,7 +235,7 @@
           inodeLoader.loadINodeSection(in);
         }
           break;
-        case INODE_REFRENCE:
+        case INODE_REFERENCE:
           snapshotLoader.loadINodeReferenceSection(in);
           break;
         case INODE_DIR:
@@ -548,7 +548,7 @@
     NS_INFO("NS_INFO"),
     STRING_TABLE("STRING_TABLE"),
     INODE("INODE"),
-    INODE_REFRENCE("INODE_REFRENCE"),
+    INODE_REFERENCE("INODE_REFERENCE"),
     SNAPSHOT("SNAPSHOT"),
     INODE_DIR("INODE_DIR"),
     FILES_UNDERCONSTRUCTION("FILES_UNDERCONSTRUCTION"),
