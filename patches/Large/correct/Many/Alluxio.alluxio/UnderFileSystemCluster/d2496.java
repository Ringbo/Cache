diff --git a/minicluster/src/main/java/tachyon/underfs/UnderFileSystemCluster.java b/minicluster/src/main/java/tachyon/underfs/UnderFileSystemCluster.java
index ec92af1..c4bfcb0 100644
--- a/minicluster/src/main/java/tachyon/underfs/UnderFileSystemCluster.java
+++ b/minicluster/src/main/java/tachyon/underfs/UnderFileSystemCluster.java
@@ -128,7 +128,7 @@
         && sUnderFSClass.equals("tachyon.underfs.hdfs.LocalMiniDFSCluster");
   }
 
-  protected final String mBaseDir;
+  protected String mBaseDir;
 
   protected final TachyonConf mTachyonConf;
 
