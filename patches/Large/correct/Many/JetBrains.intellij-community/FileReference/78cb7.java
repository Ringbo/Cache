diff --git a/platform/lang-impl/src/com/intellij/psi/impl/source/resolve/reference/impl/providers/FileReference.java b/platform/lang-impl/src/com/intellij/psi/impl/source/resolve/reference/impl/providers/FileReference.java
index 978638d..0778acf 100644
--- a/platform/lang-impl/src/com/intellij/psi/impl/source/resolve/reference/impl/providers/FileReference.java
+++ b/platform/lang-impl/src/com/intellij/psi/impl/source/resolve/reference/impl/providers/FileReference.java
@@ -202,7 +202,7 @@
 
             public boolean execute(PsiFileSystemItem element) {
               result.add(new PsiElementResolveResult(getOriginalFile(element)));
-              return false;
+              return true;
             }
           });
         }
