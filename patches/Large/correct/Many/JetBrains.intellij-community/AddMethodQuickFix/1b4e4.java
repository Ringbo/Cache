diff --git a/python/src/com/jetbrains/python/actions/AddMethodQuickFix.java b/python/src/com/jetbrains/python/actions/AddMethodQuickFix.java
index 729cf1c..fc1e241 100644
--- a/python/src/com/jetbrains/python/actions/AddMethodQuickFix.java
+++ b/python/src/com/jetbrains/python/actions/AddMethodQuickFix.java
@@ -49,7 +49,7 @@
     String item_name = myIdentifier;
     if (cls != null && item_name != null) {
       PyStatementList cls_stmt_list = cls.getStatementList();
-      if (!CodeInsightUtilBase.preparePsiElementForWrite(problem_elt)) {
+      if (!CodeInsightUtilBase.preparePsiElementForWrite(cls_stmt_list)) {
         return;
       }
       Language language = cls.getLanguage();
