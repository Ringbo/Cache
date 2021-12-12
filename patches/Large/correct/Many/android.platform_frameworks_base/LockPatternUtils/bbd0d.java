diff --git a/core/java/com/android/internal/widget/LockPatternUtils.java b/core/java/com/android/internal/widget/LockPatternUtils.java
index 5a7d519..93f90f6 100644
--- a/core/java/com/android/internal/widget/LockPatternUtils.java
+++ b/core/java/com/android/internal/widget/LockPatternUtils.java
@@ -438,10 +438,9 @@
      * Calls back SetupFaceLock to delete the temporary gallery file
      */
     public void deleteTempGallery() {
-        Intent intent = new Intent().setClassName("com.android.facelock",
-                "com.android.facelock.SetupFaceLock");
+        Intent intent = new Intent().setAction("com.android.facelock.DELETE_GALLERY");
         intent.putExtra("deleteTempGallery", true);
-        mContext.startActivity(intent);
+        mContext.sendBroadcast(intent);
     }
 
     /**
@@ -449,10 +448,9 @@
     */
     void deleteGallery() {
         if(usingBiometricWeak()) {
-            Intent intent = new Intent().setClassName("com.android.facelock",
-                    "com.android.facelock.SetupFaceLock");
+            Intent intent = new Intent().setAction("com.android.facelock.DELETE_GALLERY");
             intent.putExtra("deleteGallery", true);
-            mContext.startActivity(intent);
+            mContext.sendBroadcast(intent);
         }
     }
 
