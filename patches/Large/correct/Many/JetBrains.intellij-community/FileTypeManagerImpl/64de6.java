diff --git a/source/com/intellij/openapi/fileTypes/impl/FileTypeManagerImpl.java b/source/com/intellij/openapi/fileTypes/impl/FileTypeManagerImpl.java
index a93edfe..4297785 100644
--- a/source/com/intellij/openapi/fileTypes/impl/FileTypeManagerImpl.java
+++ b/source/com/intellij/openapi/fileTypes/impl/FileTypeManagerImpl.java
@@ -595,7 +595,7 @@
         }
       }
 
-      if (table != null) {
+      if (table != null && type instanceof CustomFileType) {
         ((CustomFileType)type).setSyntaxTable(table);
       }
     }
