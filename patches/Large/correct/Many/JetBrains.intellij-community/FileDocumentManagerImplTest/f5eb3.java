diff --git a/platform/platform-tests/testSrc/com/intellij/openapi/fileEditor/impl/FileDocumentManagerImplTest.java b/platform/platform-tests/testSrc/com/intellij/openapi/fileEditor/impl/FileDocumentManagerImplTest.java
index 50b6583..00a5433 100644
--- a/platform/platform-tests/testSrc/com/intellij/openapi/fileEditor/impl/FileDocumentManagerImplTest.java
+++ b/platform/platform-tests/testSrc/com/intellij/openapi/fileEditor/impl/FileDocumentManagerImplTest.java
@@ -663,7 +663,7 @@
 
     List<Future> futures = new ArrayList<>();
     for (VirtualFile file : files) {
-      if (fdm.getCachedDocument(file) == null) {
+      if (fdm.getCachedDocument(file) != null) {
         MemoryDumpHelper.captureMemoryDumpZipped("fileDocTest.hprof.zip");
         fail("Document not gc-ed: " + file);
       }
