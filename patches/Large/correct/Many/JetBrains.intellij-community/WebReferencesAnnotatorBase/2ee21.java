diff --git a/platform/lang-impl/src/com/intellij/openapi/paths/WebReferencesAnnotatorBase.java b/platform/lang-impl/src/com/intellij/openapi/paths/WebReferencesAnnotatorBase.java
index 9203932..1ceb9dc 100644
--- a/platform/lang-impl/src/com/intellij/openapi/paths/WebReferencesAnnotatorBase.java
+++ b/platform/lang-impl/src/com/intellij/openapi/paths/WebReferencesAnnotatorBase.java
@@ -117,7 +117,7 @@
 
   @Override
   public void apply(@NotNull PsiFile file, MyInfo[] infos, @NotNull AnnotationHolder holder) {
-    if (infos.length == 0) {
+    if (infos == null || infos.length == 0) {
       return;
     }
 
