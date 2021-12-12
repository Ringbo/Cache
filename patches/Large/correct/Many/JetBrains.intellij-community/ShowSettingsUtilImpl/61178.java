diff --git a/platform-impl/src/com/intellij/ide/actions/ShowSettingsUtilImpl.java b/platform-impl/src/com/intellij/ide/actions/ShowSettingsUtilImpl.java
index 704141e..e280278 100644
--- a/platform-impl/src/com/intellij/ide/actions/ShowSettingsUtilImpl.java
+++ b/platform-impl/src/com/intellij/ide/actions/ShowSettingsUtilImpl.java
@@ -48,7 +48,7 @@
 
     Project actualProject = project != null ? project  : ProjectManager.getInstance().getDefaultProject();
     Configurable config = (Configurable)actualProject.getComponent(configurableClass);
-    if (config != null) {
+    if (config == null) {
       config = (Configurable)ApplicationManager.getApplication().getComponent(configurableClass);
     }
 
