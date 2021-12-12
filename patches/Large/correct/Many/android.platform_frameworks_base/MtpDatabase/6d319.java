diff --git a/media/java/android/mtp/MtpDatabase.java b/media/java/android/mtp/MtpDatabase.java
index 32a00d5..1244d7f 100755
--- a/media/java/android/mtp/MtpDatabase.java
+++ b/media/java/android/mtp/MtpDatabase.java
@@ -243,11 +243,11 @@
         }
     };
 
-    public MtpDatabase(Context context, Context userContext, String volumeName,
+    public MtpDatabase(Context context, String volumeName,
             String[] subDirectories) {
         native_setup();
         mContext = context;
-        mMediaProvider = userContext.getContentResolver()
+        mMediaProvider = context.getContentResolver()
                 .acquireContentProviderClient(MediaStore.AUTHORITY);
         mVolumeName = volumeName;
         mObjectsUri = Files.getMtpObjectsUri(volumeName);
