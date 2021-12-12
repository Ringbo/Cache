diff --git a/packages/SystemUI/src/com/android/systemui/recent/RecentTasksLoader.java b/packages/SystemUI/src/com/android/systemui/recent/RecentTasksLoader.java
index b7434fd..34430d9 100644
--- a/packages/SystemUI/src/com/android/systemui/recent/RecentTasksLoader.java
+++ b/packages/SystemUI/src/com/android/systemui/recent/RecentTasksLoader.java
@@ -203,8 +203,7 @@
         Drawable icon = getFullResIcon(td.resolveInfo, pm);
         if (td.userId != UserHandle.myUserId()) {
             // Need to badge the icon
-            icon = mContext.getPackageManager().getUserBadgedDrawableForDensity(icon,
-                    new UserHandle(td.userId), null, 0);
+            icon = mContext.getPackageManager().getUserBadgedIcon(icon, new UserHandle(td.userId));
         }
         if (DEBUG) Log.v(TAG, "Loaded bitmap for task "
                 + td + ": " + thumbnail);
