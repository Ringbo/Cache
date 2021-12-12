diff --git a/core/java/android/app/LauncherActivity.java b/core/java/android/app/LauncherActivity.java
index 9ec7f41..88e2356 100644
--- a/core/java/android/app/LauncherActivity.java
+++ b/core/java/android/app/LauncherActivity.java
@@ -166,7 +166,7 @@
                 if (item.icon == null) {
                     item.icon = mIconResizer.createIconThumbnail(item.resolveInfo.loadIcon(getPackageManager()));
                 }
-                text.setCompoundDrawablesWithIntrinsicBounds(item.icon, null, null, null);
+                text.setCompoundDrawablesRelativeWithIntrinsicBounds(item.icon, null, null, null);
             }
         }
 
