diff --git a/ui-designer/impl/com/intellij/uiDesigner/palette/ComponentItem.java b/ui-designer/impl/com/intellij/uiDesigner/palette/ComponentItem.java
index 7ea994d..5d5b8c9 100644
--- a/ui-designer/impl/com/intellij/uiDesigner/palette/ComponentItem.java
+++ b/ui-designer/impl/com/intellij/uiDesigner/palette/ComponentItem.java
@@ -356,7 +356,7 @@
   }
 
   @Nullable public PsiFile getBoundForm() {
-    if (myClassName.startsWith("javax.swing")) {
+    if (myClassName.length() == 0 || myClassName.startsWith("javax.swing")) {
       return null;
     }
     PsiManager psiManager = PsiManager.getInstance(myProject);
