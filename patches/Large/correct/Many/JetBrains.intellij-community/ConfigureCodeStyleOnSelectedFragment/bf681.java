diff --git a/platform/lang-impl/src/com/intellij/formatting/contextConfiguration/ConfigureCodeStyleOnSelectedFragment.java b/platform/lang-impl/src/com/intellij/formatting/contextConfiguration/ConfigureCodeStyleOnSelectedFragment.java
index a56dab9..df4b8f2 100644
--- a/platform/lang-impl/src/com/intellij/formatting/contextConfiguration/ConfigureCodeStyleOnSelectedFragment.java
+++ b/platform/lang-impl/src/com/intellij/formatting/contextConfiguration/ConfigureCodeStyleOnSelectedFragment.java
@@ -57,7 +57,7 @@
   @NotNull
   @Override
   public String getFamilyName() {
-    return "CodeStyle";
+    return "ConfigureCodeStyleOnSelectedFragment";
   }
 
   @Override
@@ -73,7 +73,7 @@
     new FragmentCodeStyleSettingsDialog(project, editor, file, settings, settingsToShow).show();
   }
 
-  private CodeStyleSettingsToShow calculateAffectingSettings(@NotNull Editor editor, @NotNull PsiFile file) {
+  private static CodeStyleSettingsToShow calculateAffectingSettings(@NotNull Editor editor, @NotNull PsiFile file) {
     SelectionModel model = editor.getSelectionModel();
     int start = model.getSelectionStart();
     int end = model.getSelectionEnd();
