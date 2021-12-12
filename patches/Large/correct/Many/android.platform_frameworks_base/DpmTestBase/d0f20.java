diff --git a/services/tests/servicestests/src/com/android/server/devicepolicy/DpmTestBase.java b/services/tests/servicestests/src/com/android/server/devicepolicy/DpmTestBase.java
index c80ca6c..b4b74b3 100644
--- a/services/tests/servicestests/src/com/android/server/devicepolicy/DpmTestBase.java
+++ b/services/tests/servicestests/src/com/android/server/devicepolicy/DpmTestBase.java
@@ -131,7 +131,7 @@
 
         doReturn(ai).when(mMockContext.ipackageManager).getApplicationInfo(
                 eq(admin.getPackageName()),
-                eq(PackageManager.GET_DISABLED_UNTIL_USED_COMPONENTS),
+                anyInt(),
                 eq(UserHandle.getUserId(packageUid)));
 
         // Set up queryBroadcastReceivers().
