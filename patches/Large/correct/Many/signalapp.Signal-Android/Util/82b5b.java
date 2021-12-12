diff --git a/src/org/thoughtcrime/securesms/util/Util.java b/src/org/thoughtcrime/securesms/util/Util.java
index 0848bd9..453afbc 100644
--- a/src/org/thoughtcrime/securesms/util/Util.java
+++ b/src/org/thoughtcrime/securesms/util/Util.java
@@ -428,7 +428,7 @@
     ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
 
     return (VERSION.SDK_INT >= VERSION_CODES.KITKAT && activityManager.isLowRamDevice()) ||
-           activityManager.getMemoryClass() <= 64;
+           activityManager.getLargeMemoryClass() <= 64;
   }
 
   public static int clamp(int value, int min, int max) {
