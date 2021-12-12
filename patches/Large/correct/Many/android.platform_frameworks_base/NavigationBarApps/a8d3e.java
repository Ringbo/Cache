diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarApps.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarApps.java
index a51f62a..58c9722 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarApps.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarApps.java
@@ -1060,7 +1060,7 @@
             ris = packageManager.queryIntentActivitiesAsUser(intentToResolve, 0, userId);
         }
         if (ris == null || ris.size() <= 0) {
-            Slog.e(TAG, "Failed to build intent for " + packageName);
+            Slog.i(TAG, "Failed to build intent for " + packageName);
             return null;
         }
         return new ComponentName(ris.get(0).activityInfo.packageName,
