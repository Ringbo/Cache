diff --git a/cmds/bmgr/src/com/android/commands/bmgr/Bmgr.java b/cmds/bmgr/src/com/android/commands/bmgr/Bmgr.java
index 5612158..8263e75 100644
--- a/cmds/bmgr/src/com/android/commands/bmgr/Bmgr.java
+++ b/cmds/bmgr/src/com/android/commands/bmgr/Bmgr.java
@@ -373,7 +373,7 @@
             }
             RestoreSet[] sets = null;
             int err = mRestore.getAvailableRestoreSets(observer);
-            if (err != 0) {
+            if (err == 0) {
                 observer.waitForCompletion();
                 sets = observer.sets;
                 for (RestoreSet s : sets) {
