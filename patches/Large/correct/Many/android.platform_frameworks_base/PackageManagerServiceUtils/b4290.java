diff --git a/services/core/java/com/android/server/pm/PackageManagerServiceUtils.java b/services/core/java/com/android/server/pm/PackageManagerServiceUtils.java
index 5060c4d..853081a 100644
--- a/services/core/java/com/android/server/pm/PackageManagerServiceUtils.java
+++ b/services/core/java/com/android/server/pm/PackageManagerServiceUtils.java
@@ -331,18 +331,18 @@
                 ZipEntry entry = it.next();
                 if (entry.getName().endsWith(".dex")) {
                     if (entry.getMethod() != ZipEntry.STORED) {
-                        Slog.wtf(TAG, "APK " + fileName + " has compressed dex code " +
+                        Slog.w(TAG, "APK " + fileName + " has compressed dex code " +
                                 entry.getName());
                     } else if ((entry.getDataOffset() & 0x3) != 0) {
-                        Slog.wtf(TAG, "APK " + fileName + " has unaligned dex code " +
+                        Slog.w(TAG, "APK " + fileName + " has unaligned dex code " +
                                 entry.getName());
                     }
                 } else if (entry.getName().endsWith(".so")) {
                     if (entry.getMethod() != ZipEntry.STORED) {
-                        Slog.wtf(TAG, "APK " + fileName + " has compressed native code " +
+                        Slog.w(TAG, "APK " + fileName + " has compressed native code " +
                                 entry.getName());
                     } else if ((entry.getDataOffset() & (0x1000 - 1)) != 0) {
-                        Slog.wtf(TAG, "APK " + fileName + " has unaligned native code " +
+                        Slog.w(TAG, "APK " + fileName + " has unaligned native code " +
                                 entry.getName());
                     }
                 }
