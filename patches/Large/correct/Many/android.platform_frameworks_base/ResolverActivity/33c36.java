diff --git a/core/java/com/android/internal/app/ResolverActivity.java b/core/java/com/android/internal/app/ResolverActivity.java
index 4ad0819..e63c57f 100644
--- a/core/java/com/android/internal/app/ResolverActivity.java
+++ b/core/java/com/android/internal/app/ResolverActivity.java
@@ -150,8 +150,7 @@
 
             resizeGrid();
         } else if (count == 1) {
-            startActivityAsUser(mAdapter.intentForPosition(0),
-                    new UserHandle(UserHandle.getUserId(mLaunchedFromUid)));
+            startActivity(mAdapter.intentForPosition(0));
             mPackageMonitor.unregister();
             mRegistered = false;
             finish();
@@ -364,12 +363,12 @@
                     if (r.match > bestMatch) bestMatch = r.match;
                 }
                 getPackageManager().addPreferredActivity(filter, bestMatch, set,
-                        intent.getComponent(), UserHandle.getUserId(mLaunchedFromUid));
+                        intent.getComponent());
             }
         }
 
         if (intent != null) {
-            startActivityAsUser(intent, new UserHandle(UserHandle.getUserId(mLaunchedFromUid)));
+            startActivity(intent);
         }
     }
 
@@ -377,7 +376,7 @@
         Intent in = new Intent().setAction("android.settings.APPLICATION_DETAILS_SETTINGS")
                 .setData(Uri.fromParts("package", ri.activityInfo.packageName, null))
                 .addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
-        startActivityAsUser(in, new UserHandle(UserHandle.getUserId(mLaunchedFromUid)));
+        startActivity(in);
     }
 
     private final class DisplayResolveInfo {
@@ -436,10 +435,9 @@
             if (mBaseResolveList != null) {
                 mCurrentResolveList = mBaseResolveList;
             } else {
-                mCurrentResolveList = mPm.queryIntentActivitiesAsUser(
+                mCurrentResolveList = mPm.queryIntentActivities(
                         mIntent, PackageManager.MATCH_DEFAULT_ONLY
-                        | (mAlwaysUseOption ? PackageManager.GET_RESOLVED_FILTER : 0),
-                        UserHandle.getUserId(mLaunchedFromUid));
+                        | (mAlwaysUseOption ? PackageManager.GET_RESOLVED_FILTER : 0));
                 // Filter out any activities that the launched uid does not
                 // have permission for.  We don't do this when we have an explicit
                 // list of resolved activities, because that only happens when
