diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index 6f1e851..91637e3 100644
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -10199,13 +10199,13 @@
                 // default to original signature matching
                 if (compareSignatures(oldPackage.mSignatures, pkg.mSignatures)
                     != PackageManager.SIGNATURE_MATCH) {
-                    res.setError(INSTALL_PARSE_FAILED_INCONSISTENT_CERTIFICATES,
+                    res.setError(INSTALL_FAILED_UPDATE_INCOMPATIBLE,
                             "New package has a different signature: " + pkgName);
                     return;
                 }
             } else {
                 if(!checkUpgradeKeySetLP(ps, pkg)) {
-                    res.setError(INSTALL_PARSE_FAILED_INCONSISTENT_CERTIFICATES,
+                    res.setError(INSTALL_FAILED_UPDATE_INCOMPATIBLE,
                             "New package not signed by keys specified by upgrade-keysets: "
                             + pkgName);
                     return;
