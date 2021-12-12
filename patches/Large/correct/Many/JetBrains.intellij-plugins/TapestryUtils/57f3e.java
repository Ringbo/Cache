diff --git a/core/src/com/intellij/tapestry/intellij/util/TapestryUtils.java b/core/src/com/intellij/tapestry/intellij/util/TapestryUtils.java
index 51510c6..c285bc8 100644
--- a/core/src/com/intellij/tapestry/intellij/util/TapestryUtils.java
+++ b/core/src/com/intellij/tapestry/intellij/util/TapestryUtils.java
@@ -423,7 +423,7 @@
     }
 
     PsiFile pageTemplate = PsiFileFactory.getInstance(module.getProject())
-      .createFileFromText(fileName, TmlFileType.INSTANCE, FileTemplateManager.getInstance().getInternalTemplate(template).getText());
+      .createFileFromText(fileName, TmlFileType.INSTANCE, FileTemplateManager.getInstance(module.getProject()).getInternalTemplate(template).getText());
     templateDirectory.add(pageTemplate);
   }
 
