diff --git a/services/core/java/com/android/server/am/RecentTasks.java b/services/core/java/com/android/server/am/RecentTasks.java
index ab5d4b6..5c05ab6 100644
--- a/services/core/java/com/android/server/am/RecentTasks.java
+++ b/services/core/java/com/android/server/am/RecentTasks.java
@@ -621,7 +621,7 @@
         for (int i = 0; i < recentsCount; i++) {
             final TaskRecord tr = get(i);
             if (task != tr) {
-                if (task.stack != tr.stack) {
+                if (task.stack != null && tr.stack != null && task.stack != tr.stack) {
                     continue;
                 }
                 if (task.userId != tr.userId) {
