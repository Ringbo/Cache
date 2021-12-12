diff --git a/plugins/tasks/tasks-core/src/com/intellij/tasks/actions/OpenTaskDialog.java b/plugins/tasks/tasks-core/src/com/intellij/tasks/actions/OpenTaskDialog.java
index 7e2335c..9cbf99b 100644
--- a/plugins/tasks/tasks-core/src/com/intellij/tasks/actions/OpenTaskDialog.java
+++ b/plugins/tasks/tasks-core/src/com/intellij/tasks/actions/OpenTaskDialog.java
@@ -77,7 +77,7 @@
       myUpdateState.setVisible(false);
       myTaskStateCombo.setVisible(false);
     }
-    final boolean stateUpdatesEnabled = PropertiesComponent.getInstance(project).getBoolean(UPDATE_STATE_ENABLED, true);
+    final boolean stateUpdatesEnabled = PropertiesComponent.getInstance(project).getBoolean(UPDATE_STATE_ENABLED, false);
     myUpdateState.setSelected(stateUpdatesEnabled);
     myUpdateState.addActionListener(new ActionListener() {
       @Override
