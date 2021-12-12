diff --git a/src/com/goide/actions/GoCreateFileAction.java b/src/com/goide/actions/GoCreateFileAction.java
index de4245f..45955b7 100644
--- a/src/com/goide/actions/GoCreateFileAction.java
+++ b/src/com/goide/actions/GoCreateFileAction.java
@@ -42,7 +42,7 @@
 
   @Override
   protected PsiFile createFile(String name, @NotNull String templateName, @NotNull PsiDirectory dir) {
-    FileTemplate template = FileTemplateManager.getDefaultInstance().getInternalTemplate(templateName);
+    FileTemplate template = FileTemplateManager.getInstance().getInternalTemplate(templateName);
     Properties properties = new Properties();
     properties.setProperty(PACKAGE, ContainerUtil.getLastItem(StringUtil.split(dir.getName(), "-")));
     try {
