diff --git a/core/java/android/security/keystore/recovery/RecoveryController.java b/core/java/android/security/keystore/recovery/RecoveryController.java
index 3e5ad97..f234cf9 100644
--- a/core/java/android/security/keystore/recovery/RecoveryController.java
+++ b/core/java/android/security/keystore/recovery/RecoveryController.java
@@ -605,7 +605,7 @@
             throws InternalRecoveryServiceException, UnrecoverableKeyException {
         try {
             String grantAlias = mBinder.getKey(alias);
-            if (grantAlias == null) {
+            if (grantAlias == null || "".equals(grantAlias)) {
                 return null;
             }
             return getKeyFromGrant(grantAlias);
