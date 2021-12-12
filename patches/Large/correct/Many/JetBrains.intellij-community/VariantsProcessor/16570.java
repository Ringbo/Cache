diff --git a/python/src/com/jetbrains/python/psi/resolve/VariantsProcessor.java b/python/src/com/jetbrains/python/psi/resolve/VariantsProcessor.java
index a7b494da..9045d0c 100644
--- a/python/src/com/jetbrains/python/psi/resolve/VariantsProcessor.java
+++ b/python/src/com/jetbrains/python/psi/resolve/VariantsProcessor.java
@@ -96,7 +96,7 @@
       PyReferenceExpression expr = (PyReferenceExpression)element;
       String referencedName = expr.getReferencedName();
       if (nameIsAcceptable(referencedName)) {
-        myVariants.put(referencedName, setupItem(LookupElementBuilder.create(referencedName)));
+        myVariants.put(referencedName, setupItem(LookupElementBuilder.create(expr, referencedName)));
       }
     }
     else if (element instanceof NameDefiner) {
@@ -123,7 +123,7 @@
             // things like PyTargetExpression cannot have a general icon, but here we only have variables
             if (icon == null) icon = Icons.VARIABLE_ICON;
             if (referencedName != null && nameIsAcceptable(referencedName)) {
-              LookupElementBuilder lookupItem = setupItem(LookupElementBuilder.create(referencedName).setIcon(icon));
+              LookupElementBuilder lookupItem = setupItem(LookupElementBuilder.create(expr, referencedName).setIcon(icon));
               if (definer instanceof PyImportElement) { // set notice to imported module name if needed
                 PsiElement maybeFromImport = definer.getParent();
                 if (maybeFromImport instanceof PyFromImportStatement) {
