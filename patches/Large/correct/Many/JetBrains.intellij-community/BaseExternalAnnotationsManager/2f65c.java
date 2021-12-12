diff --git a/java/java-psi-impl/src/com/intellij/codeInsight/BaseExternalAnnotationsManager.java b/java/java-psi-impl/src/com/intellij/codeInsight/BaseExternalAnnotationsManager.java
index 7a062f5..4b24436 100644
--- a/java/java-psi-impl/src/com/intellij/codeInsight/BaseExternalAnnotationsManager.java
+++ b/java/java-psi-impl/src/com/intellij/codeInsight/BaseExternalAnnotationsManager.java
@@ -300,7 +300,7 @@
 
       addAnnotations(result, externalName, file, fileData);
       if (oldExternalName != null && !externalName.equals(oldExternalName)) {
-        addAnnotations(result, externalName, file, fileData);
+        addAnnotations(result, oldExternalName, file, fileData);
       }
     }
     if (result.isEmpty()) {
@@ -319,7 +319,7 @@
       if (result.contains(ad)) {
         // there can be compatible annotations in different files
         if (Comparing.equal(ad.virtualFile, file.getVirtualFile())) {
-          LOG.error("Duplicate signature:\n" + externalName + "; in  " + file);
+          LOG.error("Duplicate signature: '" + externalName + "'; in  " + file.getVirtualFile());
         }
       }
       else {
