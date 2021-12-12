diff --git a/platform/lang-impl/src/com/intellij/codeInsight/template/TemplateBuilderImpl.java b/platform/lang-impl/src/com/intellij/codeInsight/template/TemplateBuilderImpl.java
index 9d6426fa..5b29b04 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/template/TemplateBuilderImpl.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/template/TemplateBuilderImpl.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2000-2009 JetBrains s.r.o.
+ * Copyright 2000-2014 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -279,7 +279,7 @@
   public void run() {
     final Project project = myFile.getProject();
     VirtualFile file = myFile.getVirtualFile();
-    assert file != null: "Virtual file is null for " + file;
+    assert file != null: "Virtual file is null for " + myFile;
     OpenFileDescriptor descriptor = new OpenFileDescriptor(project, file);
     final Editor editor = FileEditorManager.getInstance(project).openTextEditor(descriptor, true);
 
