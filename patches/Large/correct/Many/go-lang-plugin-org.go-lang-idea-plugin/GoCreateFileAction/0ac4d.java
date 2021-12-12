diff --git a/src/com/goide/actions/GoCreateFileAction.java b/src/com/goide/actions/GoCreateFileAction.java
index a4e69ae..bf99c44 100644
--- a/src/com/goide/actions/GoCreateFileAction.java
+++ b/src/com/goide/actions/GoCreateFileAction.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2013-2014 Sergey Ignatov, Alexander Zolotov
+ * Copyright 2013-2015 Sergey Ignatov, Alexander Zolotov, Mihai Toader, Florin Patan
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -39,7 +39,7 @@
 
   @Override
   protected PsiFile createFile(String name, @NotNull String templateName, @NotNull PsiDirectory dir) {
-    FileTemplate template = FileTemplateManager.getInstance().getInternalTemplate(templateName);
+    FileTemplate template = FileTemplateManager.getInstance(dir.getProject()).getInternalTemplate(templateName);
     Properties properties = new Properties();
     properties.setProperty(PACKAGE, ContainerUtil.getLastItem(StringUtil.split(dir.getName(), "-")));
     try {
