diff --git a/platform/lang-impl/src/com/intellij/execution/console/LanguageConsoleImpl.java b/platform/lang-impl/src/com/intellij/execution/console/LanguageConsoleImpl.java
index 19189c8..6272b52 100644
--- a/platform/lang-impl/src/com/intellij/execution/console/LanguageConsoleImpl.java
+++ b/platform/lang-impl/src/com/intellij/execution/console/LanguageConsoleImpl.java
@@ -530,7 +530,7 @@
   }
 
    public static void printToConsole(final LanguageConsoleImpl console, final String string, final TextAttributes textAttributes) {
-     final TextAttributes attributes = TextAttributes.merge(textAttributes, ConsoleHighlighter.OUT.getDefaultAttributes());
+     final TextAttributes attributes = TextAttributes.merge(ConsoleHighlighter.OUT.getDefaultAttributes(), textAttributes);
      ApplicationManager.getApplication().invokeLater(new Runnable() {
        public void run() {
          console.printToHistory(string, attributes);
