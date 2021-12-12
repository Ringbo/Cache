diff --git a/lang-impl/src/com/intellij/refactoring/BaseRefactoringProcessor.java b/lang-impl/src/com/intellij/refactoring/BaseRefactoringProcessor.java
index c548831..344702c 100644
--- a/lang-impl/src/com/intellij/refactoring/BaseRefactoringProcessor.java
+++ b/lang-impl/src/com/intellij/refactoring/BaseRefactoringProcessor.java
@@ -88,7 +88,7 @@
     return myIsPreviewUsages;
   }
 
-  boolean isPreviewUsages() {
+  protected boolean isPreviewUsages() {
     return myIsPreviewUsages;
   }
 
