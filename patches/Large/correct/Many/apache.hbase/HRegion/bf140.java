diff --git a/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/HRegion.java b/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/HRegion.java
index ff56a26..d291b39 100644
--- a/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/HRegion.java
+++ b/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/HRegion.java
@@ -4736,7 +4736,7 @@
                   HConstants.HREGION_EDITS_REPLAY_SKIP_ERRORS + " instead.");
         }
         if (skipErrors) {
-          Path p = WALSplitter.moveAsideBadEditsFile(walFS, edits);
+          Path p = WALSplitter.moveAsideBadEditsFile(fs, edits);
           LOG.error(HConstants.HREGION_EDITS_REPLAY_SKIP_ERRORS
               + "=true so continuing. Renamed " + edits +
               " as " + p, e);
