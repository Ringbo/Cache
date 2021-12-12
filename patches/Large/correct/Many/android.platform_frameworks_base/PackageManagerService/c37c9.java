diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index d2a627e..aea00da 100644
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -10260,7 +10260,7 @@
                             || !bp.packageSetting.keySetData.isUsingUpgradeKeySets()
                             || ((PackageSetting) bp.packageSetting).sharedUser != null) {
                         sigsOk = compareSignatures(bp.packageSetting.signatures.mSignatures,
-                                pkg.mSignatures) != PackageManager.SIGNATURE_MATCH;
+                                pkg.mSignatures) == PackageManager.SIGNATURE_MATCH;
                     } else {
                         sigsOk = checkUpgradeKeySetLP((PackageSetting) bp.packageSetting, pkg);
                     }
