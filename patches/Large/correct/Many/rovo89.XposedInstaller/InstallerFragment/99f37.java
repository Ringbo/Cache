diff --git a/app/src/main/java/de/robv/android/xposed/installer/InstallerFragment.java b/app/src/main/java/de/robv/android/xposed/installer/InstallerFragment.java
index 67ef654..6f7da24 100644
--- a/app/src/main/java/de/robv/android/xposed/installer/InstallerFragment.java
+++ b/app/src/main/java/de/robv/android/xposed/installer/InstallerFragment.java
@@ -403,7 +403,7 @@
                         @Override
                         public void onPositive(MaterialDialog dialog) {
                             super.onPositive(dialog);
-                            reboot(null);
+                            softReboot();
                         }
                     });
                 } else {
