diff --git a/platform/platform-impl/src/com/intellij/openapi/fileTypes/impl/FileTypeManagerImpl.java b/platform/platform-impl/src/com/intellij/openapi/fileTypes/impl/FileTypeManagerImpl.java
index 051fdbf..7e9e2d2 100644
--- a/platform/platform-impl/src/com/intellij/openapi/fileTypes/impl/FileTypeManagerImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/fileTypes/impl/FileTypeManagerImpl.java
@@ -359,7 +359,7 @@
     // currently there are 6 of them and restoration does not happen very often so just iteration is enough
     if (type == PlainTextFileType.INSTANCE && !fileTypeName.equals(type.getName())) {
       for (FileType fileType: getRegisteredFileTypes()) {
-        if (fileType.equals(fileType.getName())) {
+        if (fileTypeName.equals(fileType.getName())) {
           return fileType;
         }
       }
