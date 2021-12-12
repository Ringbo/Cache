diff --git a/platform/core-impl/src/com/intellij/psi/impl/source/PsiFileImpl.java b/platform/core-impl/src/com/intellij/psi/impl/source/PsiFileImpl.java
index bd27856..7467352 100644
--- a/platform/core-impl/src/com/intellij/psi/impl/source/PsiFileImpl.java
+++ b/platform/core-impl/src/com/intellij/psi/impl/source/PsiFileImpl.java
@@ -482,7 +482,7 @@
   @Override
   public IFileElementType getFileElementType() {
     return myElementType instanceof IFileElementType ? (IFileElementType)myElementType
-                                                     : ObjectUtils.tryCast(myElementType, IFileElementType.class);
+                                                     : ObjectUtils.tryCast(myContentElementType, IFileElementType.class);
   }
 
   @Override
