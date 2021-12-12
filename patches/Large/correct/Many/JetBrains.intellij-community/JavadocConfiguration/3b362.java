diff --git a/source/com/intellij/javadoc/JavadocConfiguration.java b/source/com/intellij/javadoc/JavadocConfiguration.java
index 68a1ea4..a94f8c2 100644
--- a/source/com/intellij/javadoc/JavadocConfiguration.java
+++ b/source/com/intellij/javadoc/JavadocConfiguration.java
@@ -248,7 +248,7 @@
       ProcessTerminatedListener.attach(handler, myProject, JavadocBundle.message("javadoc.generate.exited"));
       handler.addProcessListener(new ProcessAdapter() {
         public void processTerminated(ProcessEvent event) {
-          if (!handler.isProcessTerminating() && OPEN_IN_BROWSER) {
+          if (handler.isProcessTerminating() && OPEN_IN_BROWSER) {
             String url = OUTPUT_DIRECTORY + File.separator + INDEX_HTML;
             if (new File(url).exists() && event.getExitCode() == 0) {
               BrowserUtil.launchBrowser(url);
