diff --git a/idea/src/org/jetbrains/jet/plugin/formatter/JetFormattingModelBuilder.java b/idea/src/org/jetbrains/jet/plugin/formatter/JetFormattingModelBuilder.java
index fb4b1f2..6db9356 100644
--- a/idea/src/org/jetbrains/jet/plugin/formatter/JetFormattingModelBuilder.java
+++ b/idea/src/org/jetbrains/jet/plugin/formatter/JetFormattingModelBuilder.java
@@ -47,7 +47,7 @@
         JetCodeStyleSettings jetSettings = settings.getCustomSettings(JetCodeStyleSettings.class);
         CommonCodeStyleSettings jetCommonSettings = settings.getCommonSettings(JetLanguage.INSTANCE);
 
-        return new SpacingBuilder(settings)
+        return new SpacingBuilder(settings, JetLanguage.INSTANCE)
                 // ============ Line breaks ==============
                 .after(NAMESPACE_HEADER).blankLines(1)
 
