diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index adc60dd..bf8c9da 100755
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -868,7 +868,7 @@
                                     int[] uidArray = new int[] { res.pkg.applicationInfo.uid };
                                     ArrayList<String> pkgList = new ArrayList<String>(1);
                                     pkgList.add(res.pkg.applicationInfo.packageName);
-                                    sendResourcesChangedBroadcast(true, false,
+                                    sendResourcesChangedBroadcast(true, true,
                                             pkgList,uidArray, null);
                                 }
                             }
@@ -11116,7 +11116,7 @@
             if (uidArr != null) {
                 extras.putIntArray(Intent.EXTRA_CHANGED_UID_LIST, uidArr);
             }
-            if (replacing && !mediaStatus) {
+            if (replacing) {
                 extras.putBoolean(Intent.EXTRA_REPLACING, replacing);
             }
             String action = mediaStatus ? Intent.ACTION_EXTERNAL_APPLICATIONS_AVAILABLE
