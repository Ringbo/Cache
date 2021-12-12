diff --git a/platform/lang-impl/src/com/intellij/codeInsight/template/impl/TemplateManagerImpl.java b/platform/lang-impl/src/com/intellij/codeInsight/template/impl/TemplateManagerImpl.java
index 302e249..252d949 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/template/impl/TemplateManagerImpl.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/template/impl/TemplateManagerImpl.java
@@ -187,7 +187,7 @@
   }
 
   public void startTemplate(@NotNull final Editor editor, @NotNull final Template template, TemplateEditingListener listener) {
-    startTemplate(editor, null, template, listener, null, false);
+    startTemplate(editor, null, template, listener, null, true);
   }
 
   public void startTemplate(@NotNull final Editor editor,
