diff --git a/xml/impl/src/com/intellij/xml/util/AnchorPathReferenceProvider.java b/xml/impl/src/com/intellij/xml/util/AnchorPathReferenceProvider.java
index 671b16a..d31b75d 100644
--- a/xml/impl/src/com/intellij/xml/util/AnchorPathReferenceProvider.java
+++ b/xml/impl/src/com/intellij/xml/util/AnchorPathReferenceProvider.java
@@ -40,7 +40,7 @@
       final int i = elementText.indexOf('#', offset);
       if (i >= 0) {
         final int pos = elementText.indexOf('?', i);
-        final String anchor = pos == -1 ? elementText.substring(i + 1) : elementText.substring(i + 1, pos);
+        final String anchor = pos == -1 ? elementText.substring(i + 1, range.getEndOffset()) : elementText.substring(i + 1, pos);
         references.add(new AnchorReference(anchor, fileReference, psiElement, range.getStartOffset() + i, soft));
       }
     }
