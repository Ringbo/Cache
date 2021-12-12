diff --git a/core/java/com/android/internal/app/ResolverActivity.java b/core/java/com/android/internal/app/ResolverActivity.java
index f2bf9e1..1f2acc9 100644
--- a/core/java/com/android/internal/app/ResolverActivity.java
+++ b/core/java/com/android/internal/app/ResolverActivity.java
@@ -760,7 +760,7 @@
                 } else {
                     try {
                         AppGlobals.getPackageManager().setLastChosenActivity(intent,
-                                intent.resolveTypeIfNeeded(getContentResolver()),
+                                intent.resolveType(getContentResolver()),
                                 PackageManager.MATCH_DEFAULT_ONLY,
                                 filter, bestMatch, intent.getComponent());
                     } catch (RemoteException re) {
