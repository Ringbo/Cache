diff --git a/services/core/java/com/android/server/am/RecentTasks.java b/services/core/java/com/android/server/am/RecentTasks.java
index 862a973..c63eaac 100644
--- a/services/core/java/com/android/server/am/RecentTasks.java
+++ b/services/core/java/com/android/server/am/RecentTasks.java
@@ -462,10 +462,12 @@
                     final boolean sameActivity = task.realActivity != null
                             && tr.realActivity != null
                             && task.realActivity.equals(tr.realActivity);
-                    if (!sameActivity) {
+                    // If the document is open in another app or is not the same
+                    // document, we don't need to trim it.
+                    if (!sameActivity || !sameIntent) {
                         continue;
-                    }
-                    if (maxRecents > 0 && !doTrim) {
+                    // Otherwise only trim if we are over our max recents for this task
+                    } else if (maxRecents > 0 && !doTrim) {
                         --maxRecents;
                         continue;
                     }
