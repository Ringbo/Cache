diff --git a/plugins/xpath/xpath-lang/src/org/intellij/lang/xpath/XPathLanguage.java b/plugins/xpath/xpath-lang/src/org/intellij/lang/xpath/XPathLanguage.java
index 654f2b8..bf82c24 100644
--- a/plugins/xpath/xpath-lang/src/org/intellij/lang/xpath/XPathLanguage.java
+++ b/plugins/xpath/xpath-lang/src/org/intellij/lang/xpath/XPathLanguage.java
@@ -62,11 +62,11 @@
         }
 
         public int getCodeConstructStart(PsiFile file, int openingBraceOffset) {
-            return openingBraceOffset + 1; // TODO: verify
+            return openingBraceOffset;
         }
 
         public boolean isPairedBracesAllowedBeforeType(@NotNull IElementType lbraceType, @Nullable IElementType contextType) {
-            return false;
+            return true;
         }
     }
 
