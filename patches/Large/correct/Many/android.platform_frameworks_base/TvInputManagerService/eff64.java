diff --git a/services/core/java/com/android/server/tv/TvInputManagerService.java b/services/core/java/com/android/server/tv/TvInputManagerService.java
index 0fffa0f..4895d12 100644
--- a/services/core/java/com/android/server/tv/TvInputManagerService.java
+++ b/services/core/java/com/android/server/tv/TvInputManagerService.java
@@ -288,9 +288,10 @@
 
         if (DEBUG) Slog.d(TAG, "buildTvInputList");
         PackageManager pm = mContext.getPackageManager();
-        List<ResolveInfo> services = pm.queryIntentServices(
+        List<ResolveInfo> services = pm.queryIntentServicesAsUser(
                 new Intent(TvInputService.SERVICE_INTERFACE),
-                PackageManager.GET_SERVICES | PackageManager.GET_META_DATA);
+                PackageManager.GET_SERVICES | PackageManager.GET_META_DATA,
+                userId);
         List<TvInputInfo> inputList = new ArrayList<TvInputInfo>();
         for (ResolveInfo ri : services) {
             ServiceInfo si = ri.serviceInfo;
