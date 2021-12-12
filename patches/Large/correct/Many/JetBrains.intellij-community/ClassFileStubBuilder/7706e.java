diff --git a/java/java-psi-impl/src/com/intellij/psi/impl/compiled/ClassFileStubBuilder.java b/java/java-psi-impl/src/com/intellij/psi/impl/compiled/ClassFileStubBuilder.java
index 40295b25..89125f1 100644
--- a/java/java-psi-impl/src/com/intellij/psi/impl/compiled/ClassFileStubBuilder.java
+++ b/java/java-psi-impl/src/com/intellij/psi/impl/compiled/ClassFileStubBuilder.java
@@ -64,7 +64,7 @@
 
       try {
         PsiFileStub<?> stub = ClsFileImpl.buildFileStub(file, content);
-        if (stub == null && fileContent.getFileName().indexOf('$') >= 0) {
+        if (stub == null && fileContent.getFileName().indexOf('$') < 0) {
           LOG.info("No stub built for file " + fileContent);
         }
         return stub;
