diff --git a/src-ui/org/pentaho/di/ui/spoon/Spoon.java b/src-ui/org/pentaho/di/ui/spoon/Spoon.java
index fd9108d..6dfecb2 100644
--- a/src-ui/org/pentaho/di/ui/spoon/Spoon.java
+++ b/src-ui/org/pentaho/di/ui/spoon/Spoon.java
@@ -3921,7 +3921,7 @@
 
       // See if a transformation with the same name isn't already
       // loaded...
-      while (findJob(delegates.tabs.makeTabName(jobMeta, true)) != null) {
+      while (findJob(delegates.tabs.makeTabName(jobMeta, false)) != null) {
         nr++;
         jobMeta.setName(STRING_JOB + " " + nr); // rename
       }
