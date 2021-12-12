diff --git a/tests/permission/src/com/android/framework/permission/tests/WindowManagerPermissionTests.java b/tests/permission/src/com/android/framework/permission/tests/WindowManagerPermissionTests.java
index 10baac5..53318a4 100644
--- a/tests/permission/src/com/android/framework/permission/tests/WindowManagerPermissionTests.java
+++ b/tests/permission/src/com/android/framework/permission/tests/WindowManagerPermissionTests.java
@@ -164,7 +164,7 @@
         }
         
         try {
-            mWm.setAppStartingWindow(null, "foo", 0, null, null, 0, 0, 0, null, false);
+            mWm.setAppStartingWindow(null, "foo", 0, null, null, 0, 0, 0, 0, null, false);
             fail("IWindowManager.setAppStartingWindow did not throw SecurityException as"
                     + " expected");
         } catch (SecurityException e) {
