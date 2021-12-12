diff --git a/services/java/com/android/server/MountService.java b/services/java/com/android/server/MountService.java
index 2e0c977..ce83a45 100644
--- a/services/java/com/android/server/MountService.java
+++ b/services/java/com/android/server/MountService.java
@@ -1577,7 +1577,7 @@
             boolean mounted = false;
             try {
                 mounted = Environment.MEDIA_MOUNTED.equals(getVolumeState(primary.getPath()));
-            } catch (IllegalStateException e) {
+            } catch (IllegalArgumentException e) {
             }
 
             if (!mounted) {
