diff --git a/xml/impl/src/com/intellij/codeInsight/template/HtmlTextContextType.java b/xml/impl/src/com/intellij/codeInsight/template/HtmlTextContextType.java
index 35bb8de..c16509e 100644
--- a/xml/impl/src/com/intellij/codeInsight/template/HtmlTextContextType.java
+++ b/xml/impl/src/com/intellij/codeInsight/template/HtmlTextContextType.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2000-2010 JetBrains s.r.o.
+ * Copyright 2000-2016 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -44,7 +44,8 @@
   }
 
   public static boolean isInContext(@NotNull PsiElement element) {
-    if (PsiTreeUtil.getParentOfType(element, XmlComment.class) != null) {
+    if (PsiTreeUtil.getParentOfType(element, XmlComment.class) != null 
+        && element.getNode().getElementType() != XmlTokenType.XML_COMMENT_START) {
       return false;
     }
     if (PsiTreeUtil.getParentOfType(element, XmlText.class) != null) {
