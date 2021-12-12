diff --git a/src/be/ibridge/kettle/core/widget/ConditionEditor.java b/src/be/ibridge/kettle/core/widget/ConditionEditor.java
index b1e59f0..6921f20 100644
--- a/src/be/ibridge/kettle/core/widget/ConditionEditor.java
+++ b/src/be/ibridge/kettle/core/widget/ConditionEditor.java
@@ -304,7 +304,7 @@
 					case AREA_OPERATOR:
 						{
 							int operator = getNrOperator(screen);
-							EnterSelectionDialog esd = new EnterSelectionDialog(shell, props, Condition.getRealOperators(), "Operator", "Select the operator:");
+							EnterSelectionDialog esd = new EnterSelectionDialog(shell, Condition.getRealOperators(), "Operator", "Select the operator:");
 							Condition selcond = active_condition.getCondition(operator);
 							String def = selcond.getOperatorDesc();
 							int defnr = esd.getSelectionNr(Const.trim(def));
@@ -330,7 +330,7 @@
 					case AREA_FUNCTION:
 						if (active_condition.isAtomic())
 						{
-							EnterSelectionDialog esd = new EnterSelectionDialog(shell, props, Condition.functions, "Functions", "Select the function:");
+							EnterSelectionDialog esd = new EnterSelectionDialog(shell, Condition.functions, "Functions", "Select the function:");
 							String def = active_condition.getFunctionDesc();
 							int defnr = esd.getSelectionNr(def);
 							String selection = esd.open(defnr);
@@ -345,7 +345,7 @@
 					case AREA_LEFT:
 						if (active_condition.isAtomic() && fields!=null)
 						{
-							EnterSelectionDialog esd = new EnterSelectionDialog(shell, props, fields.getFieldNamesAndTypes(max_field_length), "Fields", "Select a field:");
+							EnterSelectionDialog esd = new EnterSelectionDialog(shell, fields.getFieldNamesAndTypes(max_field_length), "Fields", "Select a field:");
 							String def = active_condition.getLeftValuename();
 							int defnr = esd.getSelectionNr(def);
 							String selection = esd.open(defnr);
@@ -360,7 +360,7 @@
 					case AREA_RIGHT_VALUE:
 						if (active_condition.isAtomic() && fields!=null)
 						{
-							EnterSelectionDialog esd = new EnterSelectionDialog(shell, props, fields.getFieldNamesAndTypes(max_field_length), "Fields", "Select a field:");
+							EnterSelectionDialog esd = new EnterSelectionDialog(shell, fields.getFieldNamesAndTypes(max_field_length), "Fields", "Select a field:");
 							String def = active_condition.getLeftValuename();
 							int defnr = esd.getSelectionNr(def);
 							String selection = esd.open(defnr);
