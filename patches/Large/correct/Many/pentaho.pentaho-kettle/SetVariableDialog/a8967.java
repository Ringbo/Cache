diff --git a/src/be/ibridge/kettle/trans/step/setvariable/SetVariableDialog.java b/src/be/ibridge/kettle/trans/step/setvariable/SetVariableDialog.java
index 5c7e43a..cd0bc7e 100644
--- a/src/be/ibridge/kettle/trans/step/setvariable/SetVariableDialog.java
+++ b/src/be/ibridge/kettle/trans/step/setvariable/SetVariableDialog.java
@@ -132,7 +132,7 @@
             {
 		        new ColumnInfo(Messages.getString("SetVariableDialog.Fields.Column.FieldName"), ColumnInfo.COLUMN_TYPE_TEXT, false), //$NON-NLS-1$
 		        new ColumnInfo(Messages.getString("SetVariableDialog.Fields.Column.VariableName"), ColumnInfo.COLUMN_TYPE_TEXT, false), //$NON-NLS-1$
-                new ColumnInfo(Messages.getString("SetVariableDialog.Fields.Column.VariableType"), ColumnInfo.COLUMN_TYPE_CCOMBO, SetVariableMeta.getVariableTypeDescriptions(), true), //$NON-NLS-1$
+                new ColumnInfo(Messages.getString("SetVariableDialog.Fields.Column.VariableType"), ColumnInfo.COLUMN_TYPE_CCOMBO, SetVariableMeta.getVariableTypeDescriptions(), false), //$NON-NLS-1$
             };
 
 		wFields=new TableView(shell, 
