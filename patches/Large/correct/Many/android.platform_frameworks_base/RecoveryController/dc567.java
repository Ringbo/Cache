diff --git a/core/java/android/security/keystore/recovery/RecoveryController.java b/core/java/android/security/keystore/recovery/RecoveryController.java
index 10c1c9e..3e5ad97 100644
--- a/core/java/android/security/keystore/recovery/RecoveryController.java
+++ b/core/java/android/security/keystore/recovery/RecoveryController.java
@@ -578,7 +578,7 @@
             if (grantAlias == null) {
                 throw new InternalRecoveryServiceException("Null grant alias");
             }
-            return getKeyFromGrant(alias);
+            return getKeyFromGrant(grantAlias);
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         } catch (UnrecoverableKeyException e) {
