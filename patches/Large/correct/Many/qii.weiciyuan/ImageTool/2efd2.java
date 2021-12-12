diff --git a/src/org/qii/weiciyuan/support/imagetool/ImageTool.java b/src/org/qii/weiciyuan/support/imagetool/ImageTool.java
index c62ada6..fc8f0b2 100644
--- a/src/org/qii/weiciyuan/support/imagetool/ImageTool.java
+++ b/src/org/qii/weiciyuan/support/imagetool/ImageTool.java
@@ -234,7 +234,7 @@
             }
 
             String filePath = FileManager.getFilePathFromUrl(url, method);
-            if (!filePath.endsWith(".jpg") || !filePath.endsWith(".gif"))
+            if (!filePath.endsWith(".jpg") && !filePath.endsWith(".gif"))
                 filePath = filePath + ".jpg";
 
             boolean fileExist = new File(filePath).exists();
