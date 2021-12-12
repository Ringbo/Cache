diff --git a/platform/lang-impl/src/com/intellij/psi/impl/SharedPsiElementImplUtil.java b/platform/lang-impl/src/com/intellij/psi/impl/SharedPsiElementImplUtil.java
index d85feec..2fc191a 100644
--- a/platform/lang-impl/src/com/intellij/psi/impl/SharedPsiElementImplUtil.java
+++ b/platform/lang-impl/src/com/intellij/psi/impl/SharedPsiElementImplUtil.java
@@ -67,7 +67,7 @@
         LOG.error(element);
       }
       for (TextRange range : ReferenceRange.getRanges(reference)) {
-        if (range.getStartOffset() <= offset && offset <= range.getEndOffset()) {
+        if (range.getStartOffset() <= offset && offset < range.getEndOffset()) {
           outReferences.add(reference);
         }
       }
