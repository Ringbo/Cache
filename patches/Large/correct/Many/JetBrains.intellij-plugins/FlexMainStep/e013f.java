diff --git a/flex/src/com/intellij/lang/javascript/flex/actions/newfile/FlexMainStep.java b/flex/src/com/intellij/lang/javascript/flex/actions/newfile/FlexMainStep.java
index 0a5990b..664bdd4 100644
--- a/flex/src/com/intellij/lang/javascript/flex/actions/newfile/FlexMainStep.java
+++ b/flex/src/com/intellij/lang/javascript/flex/actions/newfile/FlexMainStep.java
@@ -80,7 +80,7 @@
                             new ThrowableComputable<FileTemplate, IOException>() {
                               @Override
                               public FileTemplate compute() throws IOException {
-                                return FileTemplateManager.getInstance().getInternalTemplate(myModel.getTemplateName());
+                                return FileTemplateManager.getDefaultInstance().getInternalTemplate(myModel.getTemplateName());
                               }
                             });
       String[] attributes = FileTemplateUtil.calculateAttributes(template.getText(), new Properties(), true);
