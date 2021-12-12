diff --git a/source/com/intellij/psi/impl/PsiToDocumentSynchronizer.java b/source/com/intellij/psi/impl/PsiToDocumentSynchronizer.java
index 7f8da4b..621d000 100644
--- a/source/com/intellij/psi/impl/PsiToDocumentSynchronizer.java
+++ b/source/com/intellij/psi/impl/PsiToDocumentSynchronizer.java
@@ -415,7 +415,7 @@
                                     effectiveStart - effectiveOffset + documentOffset,
                                     Math.min(range.getStartOffset(), end) - effectiveStart);
             }
-            if(end > range.getStartOffset()){
+            if(end >= range.getStartOffset()){
               fragmentBuffer.append(buffer);
               end = end > effectiveFragmentEnd ? end - (buffer.length() - range.getLength()) : range.getEndOffset();
               effectiveFragmentEnd = range.getEndOffset();
