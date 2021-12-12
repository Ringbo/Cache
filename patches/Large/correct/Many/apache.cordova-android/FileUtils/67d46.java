diff --git a/framework/src/org/apache/cordova/FileUtils.java b/framework/src/org/apache/cordova/FileUtils.java
index 32b3c05..1dc6e05 100755
--- a/framework/src/org/apache/cordova/FileUtils.java
+++ b/framework/src/org/apache/cordova/FileUtils.java
@@ -225,7 +225,7 @@
         String newFilePath = stripFileProtocol(filePath);
         int result = this.cordova.getActivity().getContentResolver().delete(MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
             MediaStore.Images.Media.DATA + " = ?",
-            new String[] { filePath });
+            new String[] { newFilePath });
     }
 
     /**
