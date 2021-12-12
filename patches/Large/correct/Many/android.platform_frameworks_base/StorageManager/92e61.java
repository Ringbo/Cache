diff --git a/core/java/android/os/storage/StorageManager.java b/core/java/android/os/storage/StorageManager.java
index 5254d35..451327a 100644
--- a/core/java/android/os/storage/StorageManager.java
+++ b/core/java/android/os/storage/StorageManager.java
@@ -936,7 +936,7 @@
                 final BufferedReader reader = new BufferedReader(new InputStreamReader(fis));) {
             return Long.parseLong(reader.readLine());
         } catch (Exception e) {
-            Slog.w("Could not read " + path, e);
+            Slog.w(TAG, "Could not read " + path, e);
             return 0;
         }
     }
