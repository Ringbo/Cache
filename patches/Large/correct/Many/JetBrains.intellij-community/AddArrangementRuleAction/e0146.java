diff --git a/platform/lang-impl/src/com/intellij/application/options/codeStyle/arrangement/action/AddArrangementRuleAction.java b/platform/lang-impl/src/com/intellij/application/options/codeStyle/arrangement/action/AddArrangementRuleAction.java
index af7ba03..5ce0672 100644
--- a/platform/lang-impl/src/com/intellij/application/options/codeStyle/arrangement/action/AddArrangementRuleAction.java
+++ b/platform/lang-impl/src/com/intellij/application/options/codeStyle/arrangement/action/AddArrangementRuleAction.java
@@ -53,7 +53,7 @@
     }
     else {
       rowToEdit = model.getSize();
-      model.add(new EmptyArrangementRuleComponent(control.getRowHeight(rowToEdit)));
+      model.add(new EmptyArrangementRuleComponent(control.getEmptyRowHeight()));
     }
     control.showEditor(rowToEdit);
     control.getSelectionModel().setSelectionInterval(rowToEdit, rowToEdit);
