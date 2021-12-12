diff --git a/sdk/src/org.graalvm.launcher/src/org/graalvm/launcher/MultiLanguageShell.java b/sdk/src/org.graalvm.launcher/src/org/graalvm/launcher/MultiLanguageShell.java
index 36063c9..bc8d600 100644
--- a/sdk/src/org.graalvm.launcher/src/org/graalvm/launcher/MultiLanguageShell.java
+++ b/sdk/src/org.graalvm.launcher/src/org/graalvm/launcher/MultiLanguageShell.java
@@ -173,7 +173,7 @@
                     source = Source.newBuilder(currentLanguage.getId(), input, "<shell>").interactive(true).build();
                     context.eval(source);
                     bufferSource = null;
-                    console.getHistory().replace(source.getCode());
+                    console.getHistory().replace(source.getCharacters());
                 }
 
                 if (switchedLanguage != null) {
