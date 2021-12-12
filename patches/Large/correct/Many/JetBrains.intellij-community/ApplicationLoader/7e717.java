diff --git a/plugins/relaxng/src/org/intellij/plugins/relaxNG/ApplicationLoader.java b/plugins/relaxng/src/org/intellij/plugins/relaxNG/ApplicationLoader.java
index f9d826e..68a01a9 100644
--- a/plugins/relaxng/src/org/intellij/plugins/relaxNG/ApplicationLoader.java
+++ b/plugins/relaxng/src/org/intellij/plugins/relaxNG/ApplicationLoader.java
@@ -64,7 +64,7 @@
     registerMetaData();
 
     final FileTypeManager ftm = FileTypeManager.getInstance();
-    ftm.registerFileType(StdFileTypes.XML, RNG_EXT);
+    ftm.associateExtension(StdFileTypes.XML, RNG_EXT);
 
     installValidateXmlAction();
   }
