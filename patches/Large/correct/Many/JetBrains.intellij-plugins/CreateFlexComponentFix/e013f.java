diff --git a/flex/src/com/intellij/lang/javascript/flex/actions/newfile/CreateFlexComponentFix.java b/flex/src/com/intellij/lang/javascript/flex/actions/newfile/CreateFlexComponentFix.java
index 287a45a..b84f7a2 100644
--- a/flex/src/com/intellij/lang/javascript/flex/actions/newfile/CreateFlexComponentFix.java
+++ b/flex/src/com/intellij/lang/javascript/flex/actions/newfile/CreateFlexComponentFix.java
@@ -133,7 +133,7 @@
     Module module = ModuleUtilCore.findModuleForPsiElement(context);
     final String[] allowedBuiltin = getAllowedBuiltInTemplates(module);
     return ContainerUtil
-      .filter(CreateClassOrInterfaceFix.getApplicableTemplates(FLEX_TEMPLATES_EXTENSIONS), new Condition<FileTemplate>() {
+      .filter(CreateClassOrInterfaceFix.getApplicableTemplates(FLEX_TEMPLATES_EXTENSIONS, context.getProject()), new Condition<FileTemplate>() {
         @Override
         public boolean value(final FileTemplate fileTemplate) {
           String name = fileTemplate.getName();
