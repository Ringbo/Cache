diff --git a/services/java/com/android/server/MountService.java b/services/java/com/android/server/MountService.java
index c6aca2f..e8d7882 100644
--- a/services/java/com/android/server/MountService.java
+++ b/services/java/com/android/server/MountService.java
@@ -1603,7 +1603,7 @@
             boolean mounted = false;
             try {
                 mounted = Environment.MEDIA_MOUNTED.equals(getVolumeState(primary.getPath()));
-            } catch (IllegalStateException e) {
+            } catch (IllegalArgumentException e) {
             }
 
             if (!mounted) {
