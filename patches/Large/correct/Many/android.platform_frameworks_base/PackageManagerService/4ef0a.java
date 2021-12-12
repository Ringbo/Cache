diff --git a/services/java/com/android/server/pm/PackageManagerService.java b/services/java/com/android/server/pm/PackageManagerService.java
index 5450fd0..6af6938 100755
--- a/services/java/com/android/server/pm/PackageManagerService.java
+++ b/services/java/com/android/server/pm/PackageManagerService.java
@@ -867,7 +867,7 @@
                                     int[] uidArray = new int[] { res.pkg.applicationInfo.uid };
                                     ArrayList<String> pkgList = new ArrayList<String>(1);
                                     pkgList.add(res.pkg.applicationInfo.packageName);
-                                    sendResourcesChangedBroadcast(true, false,
+                                    sendResourcesChangedBroadcast(true, true,
                                             pkgList,uidArray, null);
                                 }
                             }
@@ -11058,7 +11058,7 @@
             if (uidArr != null) {
                 extras.putIntArray(Intent.EXTRA_CHANGED_UID_LIST, uidArr);
             }
-            if (replacing && !mediaStatus) {
+            if (replacing) {
                 extras.putBoolean(Intent.EXTRA_REPLACING, replacing);
             }
             String action = mediaStatus ? Intent.ACTION_EXTERNAL_APPLICATIONS_AVAILABLE
