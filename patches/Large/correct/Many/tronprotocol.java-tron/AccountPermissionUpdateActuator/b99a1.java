diff --git a/src/main/java/org/tron/core/actuator/AccountPermissionUpdateActuator.java b/src/main/java/org/tron/core/actuator/AccountPermissionUpdateActuator.java
index e56cf2c..5ff10ef 100644
--- a/src/main/java/org/tron/core/actuator/AccountPermissionUpdateActuator.java
+++ b/src/main/java/org/tron/core/actuator/AccountPermissionUpdateActuator.java
@@ -79,7 +79,7 @@
       throw new ContractValidateException("ownerAddress account does not exist");
     }
     //Only support active and owner
-    if (accountPermissionUpdateContract.getPermissionsCount() == 2) {
+    if (accountPermissionUpdateContract.getPermissionsCount() != 2) {
       throw new ContractValidateException("permission's count should be 2.");
     }
     boolean containOwner = false;
