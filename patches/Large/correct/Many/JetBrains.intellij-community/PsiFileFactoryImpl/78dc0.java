diff --git a/lang-impl/src/com/intellij/psi/impl/PsiFileFactoryImpl.java b/lang-impl/src/com/intellij/psi/impl/PsiFileFactoryImpl.java
index 17603ce..fe13e4f 100644
--- a/lang-impl/src/com/intellij/psi/impl/PsiFileFactoryImpl.java
+++ b/lang-impl/src/com/intellij/psi/impl/PsiFileFactoryImpl.java
@@ -35,7 +35,7 @@
   }
 
   public PsiFile createFileFromText(@NotNull String name, @NotNull Language language, @NotNull String text) {
-    return createFileFromText(name, language, text, true, false);
+    return createFileFromText(name, language, text, true, true);
   }
 
   public PsiFile createFileFromText(@NotNull String name, @NotNull Language language, @NotNull String text, boolean physical,
