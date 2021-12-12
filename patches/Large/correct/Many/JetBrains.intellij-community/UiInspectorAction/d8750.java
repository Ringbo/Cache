diff --git a/platform/platform-impl/src/com/intellij/internal/inspector/UiInspectorAction.java b/platform/platform-impl/src/com/intellij/internal/inspector/UiInspectorAction.java
index c969376..d44e6fe 100644
--- a/platform/platform-impl/src/com/intellij/internal/inspector/UiInspectorAction.java
+++ b/platform/platform-impl/src/com/intellij/internal/inspector/UiInspectorAction.java
@@ -473,7 +473,7 @@
       setCellRenderer(new ComponentTreeCellRenderer(c));
       getSelectionModel().addTreeSelectionListener(this);
       new TreeSpeedSearch(this);
-      if (((JComponent)c).getClientProperty(CLICK_INFO) != null) {
+      if (c instanceof JComponent && ((JComponent)c).getClientProperty(CLICK_INFO) != null) {
         SwingUtilities.invokeLater(() -> getSelectionModel().setSelectionPath(getPathForRow(getLeadSelectionRow() + 1)));
       }
     }
