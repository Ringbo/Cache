diff --git a/services/core/java/com/android/server/am/RecentTasks.java b/services/core/java/com/android/server/am/RecentTasks.java
index b216114..edd16ef 100644
--- a/services/core/java/com/android/server/am/RecentTasks.java
+++ b/services/core/java/com/android/server/am/RecentTasks.java
@@ -465,7 +465,7 @@
                     if (!sameActivity) {
                         continue;
                     }
-                    if (maxRecents > 0) {
+                    if (maxRecents > 0 && !doTrim) {
                         --maxRecents;
                         continue;
                     }
