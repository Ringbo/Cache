diff --git a/python/src/com/jetbrains/python/psi/impl/PyBaseElementImpl.java b/python/src/com/jetbrains/python/psi/impl/PyBaseElementImpl.java
index 8b6efcf..bf9e143 100644
--- a/python/src/com/jetbrains/python/psi/impl/PyBaseElementImpl.java
+++ b/python/src/com/jetbrains/python/psi/impl/PyBaseElementImpl.java
@@ -166,7 +166,7 @@
     if (element instanceof PyReferenceOwner) {
       final PsiFile file = element.getContainingFile();
       final PyResolveContext context = file != null ?
-                                       PyResolveContext.defaultContext().withTypeEvalContext(TypeEvalContext.fast(file)) :
+                                       PyResolveContext.defaultContext().withTypeEvalContext(TypeEvalContext.fastStubOnly(file)) :
                                        PyResolveContext.defaultContext();
       final PsiPolyVariantReference reference = ((PyReferenceOwner)element).getReference(context);
       references = reference == null ? PsiReference.EMPTY_ARRAY : new PsiReference[] {reference};
