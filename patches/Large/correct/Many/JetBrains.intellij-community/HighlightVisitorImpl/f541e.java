diff --git a/java/java-analysis-impl/src/com/intellij/codeInsight/daemon/impl/analysis/HighlightVisitorImpl.java b/java/java-analysis-impl/src/com/intellij/codeInsight/daemon/impl/analysis/HighlightVisitorImpl.java
index dfa0a3b..7c9c1d9 100644
--- a/java/java-analysis-impl/src/com/intellij/codeInsight/daemon/impl/analysis/HighlightVisitorImpl.java
+++ b/java/java-analysis-impl/src/com/intellij/codeInsight/daemon/impl/analysis/HighlightVisitorImpl.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2000-2014 JetBrains s.r.o.
+ * Copyright 2000-2015 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -124,7 +124,8 @@
 
   @Override
   public boolean suitableForFile(@NotNull PsiFile file) {
-    return file instanceof PsiJavaFile && !InjectedLanguageManager.getInstance(file.getProject()).isInjectedFragment(file);
+    // both PsiJavaFile and PsiCodeFragment
+    return file instanceof PsiImportHolder && !InjectedLanguageManager.getInstance(file.getProject()).isInjectedFragment(file);
   }
 
   @Override
