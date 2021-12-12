diff --git a/plugins/structuralsearch/source/com/intellij/structuralsearch/plugin/replace/impl/ReplacerImpl.java b/plugins/structuralsearch/source/com/intellij/structuralsearch/plugin/replace/impl/ReplacerImpl.java
index efe73b9..3ca52f6 100644
--- a/plugins/structuralsearch/source/com/intellij/structuralsearch/plugin/replace/impl/ReplacerImpl.java
+++ b/plugins/structuralsearch/source/com/intellij/structuralsearch/plugin/replace/impl/ReplacerImpl.java
@@ -329,7 +329,8 @@
                       codeStyleManager.reformatRange(
                         elementParent.getContainingFile(),
                         elementParent.getTextOffset(),
-                        elementParent.getTextOffset() + elementParent.getTextLength()
+                        elementParent.getTextOffset() + elementParent.getTextLength(),
+                        true
                       );
                     }
                   }
