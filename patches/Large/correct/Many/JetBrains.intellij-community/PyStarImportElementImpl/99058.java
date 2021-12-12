diff --git a/python/src/com/jetbrains/python/psi/impl/PyStarImportElementImpl.java b/python/src/com/jetbrains/python/psi/impl/PyStarImportElementImpl.java
index 3c30724..4011c23 100644
--- a/python/src/com/jetbrains/python/psi/impl/PyStarImportElementImpl.java
+++ b/python/src/com/jetbrains/python/psi/impl/PyStarImportElementImpl.java
@@ -52,9 +52,7 @@
       for (PsiElement importedFile : new HashSet<PsiElement>(importedFiles)) { // resolver gives lots of duplicates
         final PsiElement source = PyUtil.turnDirIntoInit(importedFile);
         if (source instanceof PyFile) {
-          // PY-13140
           Iterable<PyElement> declaredNames = ((PyFile)source).iterateNames();
-          // Filter out names starting with underscore only if __all__ attribute is not defined in the module
           if (((PyFile)source).getDunderAll() == null) {
             declaredNames = excludeUnderscoredNames(declaredNames);
           }
@@ -70,7 +68,7 @@
     return Iterables.filter(declaredNames, new Predicate<PyElement>() {
       @Override
       public boolean apply(@Nullable PyElement input) {
-        String name = input != null ? input.getName() : null;
+        final String name = input != null ? input.getName() : null;
         if (name != null && name.startsWith("_")) {
           return false;
         }
@@ -97,7 +95,6 @@
           final PsiElement result = results != null && !results.isEmpty() ? results.get(0).getElement() : null;
           if (result != null) {
             final List<String> all = sourceFile.getDunderAll();
-            // PY-13140
             if (all != null ? !all.contains(name) : name.startsWith("_")) {
               continue;
             }
