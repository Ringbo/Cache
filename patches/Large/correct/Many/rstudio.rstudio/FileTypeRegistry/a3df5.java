diff --git a/src/gwt/src/org/rstudio/studio/client/common/filetypes/FileTypeRegistry.java b/src/gwt/src/org/rstudio/studio/client/common/filetypes/FileTypeRegistry.java
index f411cfa..3177519 100644
--- a/src/gwt/src/org/rstudio/studio/client/common/filetypes/FileTypeRegistry.java
+++ b/src/gwt/src/org/rstudio/studio/client/common/filetypes/FileTypeRegistry.java
@@ -475,7 +475,7 @@
          assert filespec.indexOf("*") < 0 : "Unexpected filespec format";
          fileTypesByFilename_.put(filespec.toLowerCase(), fileType);
          if (icon != null)
-            iconsByFileExtension_.put(filespec.toLowerCase(), icon);
+            iconsByFilename_.put(filespec.toLowerCase(), icon);
       }
    }
 
