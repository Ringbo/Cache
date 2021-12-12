diff --git a/platform/lang-impl/src/com/intellij/execution/impl/ConsoleViewImpl.java b/platform/lang-impl/src/com/intellij/execution/impl/ConsoleViewImpl.java
index dc39204..f54aa15 100644
--- a/platform/lang-impl/src/com/intellij/execution/impl/ConsoleViewImpl.java
+++ b/platform/lang-impl/src/com/intellij/execution/impl/ConsoleViewImpl.java
@@ -268,7 +268,7 @@
         });
       }
     });
-    ApplicationManager.getApplication().getMessageBus().connect().subscribe(EditorColorsManager.TOPIC, new EditorColorsListener() {
+    ApplicationManager.getApplication().getMessageBus().connect(this).subscribe(EditorColorsManager.TOPIC, new EditorColorsListener() {
       @Override
       public void globalSchemeChange(EditorColorsScheme scheme) {
         ApplicationManager.getApplication().assertIsDispatchThread();
