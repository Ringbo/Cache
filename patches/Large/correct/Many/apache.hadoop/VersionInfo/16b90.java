diff --git a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/util/VersionInfo.java b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/util/VersionInfo.java
index 1d96d99..324c57f 100644
--- a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/util/VersionInfo.java
+++ b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/util/VersionInfo.java
@@ -86,7 +86,7 @@
   }
 
   protected String _getBuildVersion(){
-    return getVersion() +
+    return _getVersion() +
       " from " + _getRevision() +
       " by " + _getUser() +
       " source checksum " + _getSrcChecksum();
