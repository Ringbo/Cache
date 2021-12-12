diff --git a/services/tests/servicestests/src/com/android/server/devicepolicy/DevicePolicyManagerServiceMigrationTest.java b/services/tests/servicestests/src/com/android/server/devicepolicy/DevicePolicyManagerServiceMigrationTest.java
index 3a6b983..b440095 100644
--- a/services/tests/servicestests/src/com/android/server/devicepolicy/DevicePolicyManagerServiceMigrationTest.java
+++ b/services/tests/servicestests/src/com/android/server/devicepolicy/DevicePolicyManagerServiceMigrationTest.java
@@ -183,7 +183,8 @@
         // Check the new owner restrictions.
         DpmTestUtils.assertRestrictions(
                 DpmTestUtils.newRestrictions(
-                        UserManager.DISALLOW_ADD_USER
+                        UserManager.DISALLOW_ADD_USER,
+                        UserManager.DISALLOW_ADD_MANAGED_PROFILE
                 ),
                 dpms.getDeviceOwnerAdminLocked().ensureUserRestrictions());
 
