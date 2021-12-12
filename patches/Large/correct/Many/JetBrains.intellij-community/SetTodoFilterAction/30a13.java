diff --git a/platform/lang-impl/src/com/intellij/ide/todo/SetTodoFilterAction.java b/platform/lang-impl/src/com/intellij/ide/todo/SetTodoFilterAction.java
index 0a83b91..dc7c3b5 100644
--- a/platform/lang-impl/src/com/intellij/ide/todo/SetTodoFilterAction.java
+++ b/platform/lang-impl/src/com/intellij/ide/todo/SetTodoFilterAction.java
@@ -85,7 +85,7 @@
         @Override
         public void actionPerformed(AnActionEvent e) {
           final ShowSettingsUtil util = ShowSettingsUtil.getInstance();
-          util.editConfigurable(project, ConfigurableFactory.Companion.getInstance().getTodoConfigurable());
+          util.editConfigurable(project, ConfigurableFactory.Companion.getInstance().getTodoConfigurable(project));
         }
       }
     );
