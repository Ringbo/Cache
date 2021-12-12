diff --git a/test/org/pentaho/di/run/sortedmerge/RunSortedMerge.java b/test/org/pentaho/di/run/sortedmerge/RunSortedMerge.java
index b361b43..ea8ef43 100644
--- a/test/org/pentaho/di/run/sortedmerge/RunSortedMerge.java
+++ b/test/org/pentaho/di/run/sortedmerge/RunSortedMerge.java
@@ -23,7 +23,7 @@
                 LogWriter.LOG_LEVEL_ERROR, 
                 AllRunTests.getOldTargetDatabase(),
                 AllRunTests.getNewTargetDatabase(),
-                1000
+                1000000
             );
         timedTransRunner.runOldAndNew();
         
