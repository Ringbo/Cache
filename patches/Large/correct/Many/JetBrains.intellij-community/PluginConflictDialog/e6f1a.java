diff --git a/platform/platform-impl/src/com/intellij/diagnostic/errordialog/PluginConflictDialog.java b/platform/platform-impl/src/com/intellij/diagnostic/errordialog/PluginConflictDialog.java
index cb1f82b..9ddd2cf 100644
--- a/platform/platform-impl/src/com/intellij/diagnostic/errordialog/PluginConflictDialog.java
+++ b/platform/platform-impl/src/com/intellij/diagnostic/errordialog/PluginConflictDialog.java
@@ -39,7 +39,7 @@
 import java.util.stream.Collectors;
 
 public class PluginConflictDialog extends DialogWrapper {
-  public static final int WIDTH = 510;
+  public static final int WIDTH = 450;
 
   @NotNull
   private final List<PluginId> myConflictingPlugins;
@@ -230,7 +230,7 @@
 
   private class DisableAction extends DialogWrapperAction {
     protected DisableAction() {
-      super(DiagnosticBundle.message("error.dialog.disable.plugin.action.disable"));
+      super(DiagnosticBundle.message("error.dialog.disable.plugin.action.disableAndRestart"));
       putValue(DEFAULT_ACTION, Boolean.TRUE);
     }
 
