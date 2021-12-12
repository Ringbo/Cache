diff --git a/tests/permission/src/com/android/framework/permission/tests/WindowManagerPermissionTests.java b/tests/permission/src/com/android/framework/permission/tests/WindowManagerPermissionTests.java
index 53318a4..e4c4214 100644
--- a/tests/permission/src/com/android/framework/permission/tests/WindowManagerPermissionTests.java
+++ b/tests/permission/src/com/android/framework/permission/tests/WindowManagerPermissionTests.java
@@ -93,7 +93,7 @@
         }
         
         try {
-            mWm.addAppToken(0, null, 0, 0, 0, false, false);
+            mWm.addAppToken(0, null, 0, 0, 0, false, false, 0);
             fail("IWindowManager.addAppToken did not throw SecurityException as"
                     + " expected");
         } catch (SecurityException e) {
