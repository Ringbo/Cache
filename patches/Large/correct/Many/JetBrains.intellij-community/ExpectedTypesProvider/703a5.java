diff --git a/codeInsight/impl/com/intellij/codeInsight/ExpectedTypesProvider.java b/codeInsight/impl/com/intellij/codeInsight/ExpectedTypesProvider.java
index 340d75a..5930f70 100644
--- a/codeInsight/impl/com/intellij/codeInsight/ExpectedTypesProvider.java
+++ b/codeInsight/impl/com/intellij/codeInsight/ExpectedTypesProvider.java
@@ -924,7 +924,7 @@
               }
               final PsiClass aClass = PsiTreeUtil.getContextOfType(parent, PsiClass.class, true);
               if (aClass != null) {
-                return aClass.getManager().getElementFactory().createType(psiClass);
+                return aClass.getManager().getElementFactory().createType(aClass);
               }
             }
             return null;
