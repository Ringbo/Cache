diff --git a/core/java/com/android/internal/app/ResolverActivity.java b/core/java/com/android/internal/app/ResolverActivity.java
index bffbe11..4ad0819 100644
--- a/core/java/com/android/internal/app/ResolverActivity.java
+++ b/core/java/com/android/internal/app/ResolverActivity.java
@@ -436,9 +436,10 @@
             if (mBaseResolveList != null) {
                 mCurrentResolveList = mBaseResolveList;
             } else {
-                mCurrentResolveList = mPm.queryIntentActivities(
+                mCurrentResolveList = mPm.queryIntentActivitiesAsUser(
                         mIntent, PackageManager.MATCH_DEFAULT_ONLY
-                        | (mAlwaysUseOption ? PackageManager.GET_RESOLVED_FILTER : 0));
+                        | (mAlwaysUseOption ? PackageManager.GET_RESOLVED_FILTER : 0),
+                        UserHandle.getUserId(mLaunchedFromUid));
                 // Filter out any activities that the launched uid does not
                 // have permission for.  We don't do this when we have an explicit
                 // list of resolved activities, because that only happens when
