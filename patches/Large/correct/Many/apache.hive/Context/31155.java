diff --git a/ql/src/java/org/apache/hadoop/hive/ql/Context.java b/ql/src/java/org/apache/hadoop/hive/ql/Context.java
index febdb93..1103b2a 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/Context.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/Context.java
@@ -206,14 +206,14 @@
     if (explain) {
       try {
         if (localScratchDir != null)
-          FileSystem.getLocal(conf).delete(localScratchDir);
+          FileSystem.getLocal(conf).delete(localScratchDir, true);
       } catch (Exception e) {
         LOG.warn("Error Removing Scratch: " + StringUtils.stringifyException(e));
       }
     } else {
       for (Path p: allScratchDirs) {
         try {
-          p.getFileSystem(conf).delete(p);
+          p.getFileSystem(conf).delete(p, true);
         } catch (Exception e) {
           LOG.warn("Error Removing Scratch: " + StringUtils.stringifyException(e));
         }
