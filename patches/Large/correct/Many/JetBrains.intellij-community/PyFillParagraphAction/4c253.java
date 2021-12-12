diff --git a/python/src/com/jetbrains/python/actions/PyFillParagraphAction.java b/python/src/com/jetbrains/python/actions/PyFillParagraphAction.java
index c9e1b14..ff7eb84 100644
--- a/python/src/com/jetbrains/python/actions/PyFillParagraphAction.java
+++ b/python/src/com/jetbrains/python/actions/PyFillParagraphAction.java
@@ -76,7 +76,7 @@
 
   }
 
-  protected String getPrefix(PsiElement element) {
+  protected static String getPrefix(PsiElement element) {
     return element instanceof PsiComment? "#" : "";
   }
 
@@ -140,9 +140,11 @@
   private static PsiElement getFirstElement(final PsiElement element) {
     PsiElement e = element.getPrevSibling();
     PsiElement result = element;
-    while (e instanceof PsiComment || e instanceof PsiWhiteSpace) {
+    while (e instanceof PsiComment || (e instanceof PsiWhiteSpace &&
+                                       StringUtil.countChars(e.getText(), '\n') <= 1)) {
       final String text = e.getText();
-      if (StringUtil.countChars(text, '\n') > 1)
+      if (e instanceof PsiComment && StringUtil.isEmptyOrSpaces(
+        StringUtil.trimStart(text.trim(), getPrefix(element))))
         break;
       if (e instanceof PsiComment)
         result = e;
@@ -154,9 +156,11 @@
   private static PsiElement getLastElement(final PsiElement element) {
     PsiElement e = element.getNextSibling();
     PsiElement result = element;
-    while (e instanceof PsiComment || e instanceof PsiWhiteSpace) {
+    while (e instanceof PsiComment || (e instanceof PsiWhiteSpace &&
+                                       StringUtil.countChars(e.getText(), '\n') <= 1)) {
       final String text = e.getText();
-      if (StringUtil.countChars(text, '\n') > 1)
+      if (e instanceof PsiComment && StringUtil.isEmptyOrSpaces(
+        StringUtil.trimStart(text.trim(), getPrefix(element))))
         break;
       if (e instanceof PsiComment)
         result = e;
