diff --git a/src/org/wordpress/android/GCMIntentService.java b/src/org/wordpress/android/GCMIntentService.java
index 5c6dd61..0bd5459 100644
--- a/src/org/wordpress/android/GCMIntentService.java
+++ b/src/org/wordpress/android/GCMIntentService.java
@@ -53,7 +53,7 @@
 
     @Override
     protected void onError(Context context, String errorId) {
-        AppLog.v(T.NOTIFS, "GCM Error: " + errorId);
+        AppLog.e(T.NOTIFS, "GCM Error: " + errorId);
     }
 
     private static String mPreviousNoteId = null;
