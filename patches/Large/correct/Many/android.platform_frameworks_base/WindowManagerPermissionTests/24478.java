diff --git a/tests/permission/src/com/android/framework/permission/tests/WindowManagerPermissionTests.java b/tests/permission/src/com/android/framework/permission/tests/WindowManagerPermissionTests.java
index 5df018e..c3ac22c 100644
--- a/tests/permission/src/com/android/framework/permission/tests/WindowManagerPermissionTests.java
+++ b/tests/permission/src/com/android/framework/permission/tests/WindowManagerPermissionTests.java
@@ -423,7 +423,7 @@
         }
 
         try {
-            mWm.freezeRotation();
+            mWm.freezeRotation(-1);
             mWm.getSwitchState(0);
             fail("IWindowManager.freezeRotation did not throw SecurityException as"
                     + " expected");
