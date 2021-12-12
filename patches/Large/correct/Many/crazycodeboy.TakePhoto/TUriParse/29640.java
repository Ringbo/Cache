diff --git a/takephoto_library/src/main/java/com/jph/takephoto/uitl/TUriParse.java b/takephoto_library/src/main/java/com/jph/takephoto/uitl/TUriParse.java
index 6e21125..f958fa1 100644
--- a/takephoto_library/src/main/java/com/jph/takephoto/uitl/TUriParse.java
+++ b/takephoto_library/src/main/java/com/jph/takephoto/uitl/TUriParse.java
@@ -73,7 +73,7 @@
         if(uri==null)return null;
         String path;
         if(TextUtils.equals(uri.getAuthority(),TConstant.getFileProviderName(context))){
-            path=new File(Environment.getExternalStorageDirectory(),uri.getPath().replace("camera_photos/","")).getAbsolutePath();
+            path=new File(uri.getPath().replace("camera_photos/","")).getAbsolutePath();
         }else {
             path=uri.getPath();
         }
