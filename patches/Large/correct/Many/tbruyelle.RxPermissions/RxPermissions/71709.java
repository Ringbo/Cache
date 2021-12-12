diff --git a/lib/src/main/java/com/tbruyelle/rxpermissions/RxPermissions.java b/lib/src/main/java/com/tbruyelle/rxpermissions/RxPermissions.java
index a64143f..a940524 100644
--- a/lib/src/main/java/com/tbruyelle/rxpermissions/RxPermissions.java
+++ b/lib/src/main/java/com/tbruyelle/rxpermissions/RxPermissions.java
@@ -47,7 +47,7 @@
             fragmentManager
                     .beginTransaction()
                     .add(rxPermissionsFragment, TAG)
-                    .commit();
+                    .commitAllowingStateLoss();
             fragmentManager.executePendingTransactions();
         }
         return rxPermissionsFragment;
