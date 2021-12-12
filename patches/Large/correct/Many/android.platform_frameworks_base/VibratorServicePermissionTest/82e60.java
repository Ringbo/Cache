diff --git a/tests/permission/src/com/android/framework/permission/tests/VibratorServicePermissionTest.java b/tests/permission/src/com/android/framework/permission/tests/VibratorServicePermissionTest.java
index 274ac00..2416828 100644
--- a/tests/permission/src/com/android/framework/permission/tests/VibratorServicePermissionTest.java
+++ b/tests/permission/src/com/android/framework/permission/tests/VibratorServicePermissionTest.java
@@ -46,7 +46,7 @@
      */
     public void testVibrate() throws RemoteException {
         try {
-            mVibratorService.vibrate(2000, new Binder());
+            mVibratorService.vibrate(null, 2000, new Binder());
             fail("vibrate did not throw SecurityException as expected");
         } catch (SecurityException e) {
             // expected
@@ -62,7 +62,7 @@
      */
     public void testVibratePattern() throws RemoteException {
         try {
-            mVibratorService.vibratePattern(new long[] {0}, 0, new Binder());
+            mVibratorService.vibratePattern(null, new long[] {0}, 0, new Binder());
             fail("vibratePattern did not throw SecurityException as expected");
         } catch (SecurityException e) {
             // expected
