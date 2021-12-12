diff --git a/src/com/goide/psi/impl/GoReferenceBase.java b/src/com/goide/psi/impl/GoReferenceBase.java
index 1013ed0..50450ee 100644
--- a/src/com/goide/psi/impl/GoReferenceBase.java
+++ b/src/com/goide/psi/impl/GoReferenceBase.java
@@ -54,7 +54,7 @@
 
   @Nullable
   protected PsiDirectory resolvePackage(@NotNull String str) {
-    if (str.startsWith("/")) return null;
+    if (str.startsWith("/") || str.isEmpty()) return null;
     for (VirtualFile file : getPathsToLookup()) {
       VirtualFile child = file != null ? file.findFileByRelativePath(str) : null;
       if (child != null) return PsiManager.getInstance(myElement.getProject()).findDirectory(child);
