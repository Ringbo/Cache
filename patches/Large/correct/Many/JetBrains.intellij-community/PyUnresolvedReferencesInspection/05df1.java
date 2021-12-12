diff --git a/python/src/com/jetbrains/python/inspections/PyUnresolvedReferencesInspection.java b/python/src/com/jetbrains/python/inspections/PyUnresolvedReferencesInspection.java
index 6fe9887..7b4237a 100644
--- a/python/src/com/jetbrains/python/inspections/PyUnresolvedReferencesInspection.java
+++ b/python/src/com/jetbrains/python/inspections/PyUnresolvedReferencesInspection.java
@@ -107,7 +107,7 @@
 
     @Override
     public void visitPyTargetExpression(PyTargetExpression node) {
-      if (CythonLanguageDialect._isDisabledFor(node)) {
+      if (CythonLanguageDialect._isDisabledFor(node) || MakoLanguage._isDisabledFor(node)) {
         return;
       }
       checkSlots(node);
@@ -132,7 +132,7 @@
     @Override
     public void visitPyImportElement(PyImportElement node) {
       super.visitPyImportElement(node);
-      if (CythonLanguageDialect._isDisabledFor(node)) {
+      if (CythonLanguageDialect._isDisabledFor(node) || MakoLanguage._isDisabledFor(node)) {
         return;
       }
       final PyFromImportStatement fromImport = PsiTreeUtil.getParentOfType(node, PyFromImportStatement.class);
@@ -144,7 +144,7 @@
     @Override
     public void visitPyStarImportElement(PyStarImportElement node) {
       super.visitPyStarImportElement(node);
-      if (CythonLanguageDialect._isDisabledFor(node)) {
+      if (CythonLanguageDialect._isDisabledFor(node) || MakoLanguage._isDisabledFor(node)) {
         return;
       }
       myAllImports.add(node);
