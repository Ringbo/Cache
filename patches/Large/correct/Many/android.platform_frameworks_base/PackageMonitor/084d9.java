diff --git a/core/java/com/android/internal/content/PackageMonitor.java b/core/java/com/android/internal/content/PackageMonitor.java
index 3798d62..31ca3de 100644
--- a/core/java/com/android/internal/content/PackageMonitor.java
+++ b/core/java/com/android/internal/content/PackageMonitor.java
@@ -371,23 +371,25 @@
         } else if (Intent.ACTION_EXTERNAL_APPLICATIONS_AVAILABLE.equals(action)) {
             String[] pkgList = intent.getStringArrayExtra(Intent.EXTRA_CHANGED_PACKAGE_LIST);
             mAppearingPackages = pkgList;
-            mChangeType = PACKAGE_TEMPORARY_CHANGE;
+            mChangeType = intent.getBooleanExtra(Intent.EXTRA_REPLACING, false)
+                    ? PACKAGE_UPDATING : PACKAGE_TEMPORARY_CHANGE;
             mSomePackagesChanged = true;
             if (pkgList != null) {
                 onPackagesAvailable(pkgList);
                 for (int i=0; i<pkgList.length; i++) {
-                    onPackageAppeared(pkgList[i], PACKAGE_TEMPORARY_CHANGE);
+                    onPackageAppeared(pkgList[i], mChangeType);
                 }
             }
         } else if (Intent.ACTION_EXTERNAL_APPLICATIONS_UNAVAILABLE.equals(action)) {
             String[] pkgList = intent.getStringArrayExtra(Intent.EXTRA_CHANGED_PACKAGE_LIST);
             mDisappearingPackages = pkgList;
-            mChangeType = PACKAGE_TEMPORARY_CHANGE;
+            mChangeType = intent.getBooleanExtra(Intent.EXTRA_REPLACING, false)
+                    ? PACKAGE_UPDATING : PACKAGE_TEMPORARY_CHANGE;
             mSomePackagesChanged = true;
             if (pkgList != null) {
                 onPackagesUnavailable(pkgList);
                 for (int i=0; i<pkgList.length; i++) {
-                    onPackageDisappeared(pkgList[i], PACKAGE_TEMPORARY_CHANGE);
+                    onPackageDisappeared(pkgList[i], mChangeType);
                 }
             }
         }
