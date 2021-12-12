diff --git a/services/core/java/com/android/server/pm/DefaultPermissionGrantPolicy.java b/services/core/java/com/android/server/pm/DefaultPermissionGrantPolicy.java
index a7682dc..a5c6180 100644
--- a/services/core/java/com/android/server/pm/DefaultPermissionGrantPolicy.java
+++ b/services/core/java/com/android/server/pm/DefaultPermissionGrantPolicy.java
@@ -848,7 +848,7 @@
             return false;
         }
         PackageSetting sysPkg = mService.mSettings.getDisabledSystemPkgLPr(pkg.packageName);
-        if (sysPkg != null) {
+        if (sysPkg != null && sysPkg.pkg != null) {
             if ((sysPkg.pkg.applicationInfo.flags & ApplicationInfo.FLAG_PERSISTENT) == 0) {
                 return false;
             }
