diff --git a/services/core/java/com/android/server/pm/PackageManagerServiceUtils.java b/services/core/java/com/android/server/pm/PackageManagerServiceUtils.java
index 38131e1..20ec9b5 100644
--- a/services/core/java/com/android/server/pm/PackageManagerServiceUtils.java
+++ b/services/core/java/com/android/server/pm/PackageManagerServiceUtils.java
@@ -579,16 +579,16 @@
             // Already existing package. Make sure signatures match
             boolean match = compareSignatures(pkgSetting.sharedUser.signatures.mSignatures,
                     parsedSignatures) == PackageManager.SIGNATURE_MATCH;
-            if (!match) {
+            if (!match && compareCompat) {
                 match = matchSignaturesCompat(
                         packageName, pkgSetting.sharedUser.signatures, parsedSignatures);
             }
-            if (!match && compareCompat) {
+            if (!match && compareRecover) {
                 match = matchSignaturesRecover(
                         packageName, pkgSetting.sharedUser.signatures.mSignatures, parsedSignatures);
                 compatMatch |= match;
             }
-            if (!match && compareRecover) {
+            if (!match) {
                 throw new PackageManagerException(INSTALL_FAILED_SHARED_USER_INCOMPATIBLE,
                         "Package " + packageName
                         + " has no signatures that match those in shared user "
