diff --git a/packages/SystemUI/src/com/android/systemui/recent/RecentTasksLoader.java b/packages/SystemUI/src/com/android/systemui/recent/RecentTasksLoader.java
index 4281ccf..2a225d9 100644
--- a/packages/SystemUI/src/com/android/systemui/recent/RecentTasksLoader.java
+++ b/packages/SystemUI/src/com/android/systemui/recent/RecentTasksLoader.java
@@ -337,8 +337,7 @@
                 mContext.getSystemService(Context.ACTIVITY_SERVICE);
 
                 final List<ActivityManager.RecentTaskInfo> recentTasks =
-                        am.getRecentTasksForUser(MAX_TASKS,
-                                ActivityManager.RECENT_IGNORE_UNAVAILABLE, UserHandle.USER_CURRENT);
+                        am.getRecentTasks(MAX_TASKS, ActivityManager.RECENT_IGNORE_UNAVAILABLE);
                 int numTasks = recentTasks.size();
                 ActivityInfo homeInfo = new Intent(Intent.ACTION_MAIN)
                         .addCategory(Intent.CATEGORY_HOME).resolveActivityInfo(pm, 0);
