diff --git a/python/src/com/jetbrains/python/psi/resolve/ResolveImportUtil.java b/python/src/com/jetbrains/python/psi/resolve/ResolveImportUtil.java
index 930f269..c0d2e6a 100644
--- a/python/src/com/jetbrains/python/psi/resolve/ResolveImportUtil.java
+++ b/python/src/com/jetbrains/python/psi/resolve/ResolveImportUtil.java
@@ -466,7 +466,7 @@
 
   @Nullable
   public static PsiElement resolveInRoots(@NotNull final PsiElement context, final String name) {
-    return resolveInRoots(context, PyQualifiedName.fromComponents(name));
+    return resolveInRoots(context, PyQualifiedName.fromDottedString(name));
   }
 
   /**
