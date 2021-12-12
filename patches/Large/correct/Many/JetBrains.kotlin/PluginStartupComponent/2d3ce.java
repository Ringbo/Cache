diff --git a/idea/src/org/jetbrains/kotlin/idea/PluginStartupComponent.java b/idea/src/org/jetbrains/kotlin/idea/PluginStartupComponent.java
index 63b2a93..e8a3fad 100644
--- a/idea/src/org/jetbrains/kotlin/idea/PluginStartupComponent.java
+++ b/idea/src/org/jetbrains/kotlin/idea/PluginStartupComponent.java
@@ -80,7 +80,7 @@
             public void documentChanged(DocumentEvent e) {
                 VirtualFile virtualFile = FileDocumentManager.getInstance().getFile(e.getDocument());
                 if (virtualFile != null && virtualFile.getFileType() == KotlinFileType.INSTANCE) {
-                    KotlinPluginUpdater.Companion.getInstance().kotlinFileEdited();
+                    KotlinPluginUpdater.Companion.getInstance().kotlinFileEdited(virtualFile);
                 }
             }
         });
