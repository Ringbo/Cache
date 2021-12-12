diff --git a/platform/lang-impl/src/com/intellij/psi/templateLanguages/TemplateDataElementType.java b/platform/lang-impl/src/com/intellij/psi/templateLanguages/TemplateDataElementType.java
index 7fa9c5c..0693349 100644
--- a/platform/lang-impl/src/com/intellij/psi/templateLanguages/TemplateDataElementType.java
+++ b/platform/lang-impl/src/com/intellij/psi/templateLanguages/TemplateDataElementType.java
@@ -321,7 +321,7 @@
 
       if (parent.getTextLength() == length) {
         parent.rawRemove();
-        assert nextLeaf == null || nextOffsetStart > rangeToRemove.getEndOffset();
+        assert nextLeaf == null || nextOffsetStart >= rangeToRemove.getEndOffset();
         return nextLeaf;
       }
     }
