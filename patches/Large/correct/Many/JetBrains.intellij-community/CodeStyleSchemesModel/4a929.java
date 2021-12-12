diff --git a/platform/lang-impl/src/com/intellij/application/options/codeStyle/CodeStyleSchemesModel.java b/platform/lang-impl/src/com/intellij/application/options/codeStyle/CodeStyleSchemesModel.java
index 929f382..07a97e9 100644
--- a/platform/lang-impl/src/com/intellij/application/options/codeStyle/CodeStyleSchemesModel.java
+++ b/platform/lang-impl/src/com/intellij/application/options/codeStyle/CodeStyleSchemesModel.java
@@ -227,7 +227,7 @@
 
   public CodeStyleScheme exportProjectScheme(final String name) {
     CodeStyleScheme newScheme = createNewScheme(name, myProjectScheme);
-    ((CodeStyleSchemeImpl)newScheme).setCodeStyleSettings(getEditedSchemeSettings(myProjectScheme));
+    ((CodeStyleSchemeImpl)newScheme).setCodeStyleSettings(getCloneSettings(myProjectScheme));
     addScheme(newScheme, false);
 
     return newScheme;
