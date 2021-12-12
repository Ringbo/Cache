diff --git a/codeInsight/impl/com/intellij/codeInsight/CodeInsightUtil.java b/codeInsight/impl/com/intellij/codeInsight/CodeInsightUtil.java
index 429bb6a..75b866e 100644
--- a/codeInsight/impl/com/intellij/codeInsight/CodeInsightUtil.java
+++ b/codeInsight/impl/com/intellij/codeInsight/CodeInsightUtil.java
@@ -183,7 +183,7 @@
 
     if (includeAllParents) {
       PsiElement parent = commonParent;
-      while (parent != root) {
+      while (parent != null && parent != root) {
         parent = parent.getParent();
         list.add(parent);
       }
