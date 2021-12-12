diff --git a/platform/platform-impl/src/com/intellij/openapi/fileEditor/impl/FileDocumentManagerImpl.java b/platform/platform-impl/src/com/intellij/openapi/fileEditor/impl/FileDocumentManagerImpl.java
index 2700e83..b5ab730 100644
--- a/platform/platform-impl/src/com/intellij/openapi/fileEditor/impl/FileDocumentManagerImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/fileEditor/impl/FileDocumentManagerImpl.java
@@ -574,7 +574,7 @@
       myMultiCaster.fileWithNoDocumentChanged(file); // This will generate PSI event at FileManagerImpl
     }
 
-    if (!isDocumentUnsaved(document)) {
+    if (document.getModificationStamp() == event.getOldModificationStamp() || !isDocumentUnsaved(document)) {
       reloadFromDisk(document);
     }
   }
