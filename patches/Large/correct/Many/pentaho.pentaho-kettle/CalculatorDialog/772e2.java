diff --git a/src/be/ibridge/kettle/trans/step/calculator/CalculatorDialog.java b/src/be/ibridge/kettle/trans/step/calculator/CalculatorDialog.java
index 0fe5b39..d510bf9 100644
--- a/src/be/ibridge/kettle/trans/step/calculator/CalculatorDialog.java
+++ b/src/be/ibridge/kettle/trans/step/calculator/CalculatorDialog.java
@@ -155,7 +155,7 @@
             {
                 public void widgetSelected(SelectionEvent e)
                 {
-                    EnterSelectionDialog esd = new EnterSelectionDialog(shell, props, CalculatorMetaFunction.calcLongDesc, Messages.getString("CalculatorDialog.SelectCalculationType.Title"), Messages.getString("CalculatorDialog.SelectCalculationType.Message"));
+                    EnterSelectionDialog esd = new EnterSelectionDialog(shell, CalculatorMetaFunction.calcLongDesc, Messages.getString("CalculatorDialog.SelectCalculationType.Title"), Messages.getString("CalculatorDialog.SelectCalculationType.Message"));
                     String string = esd.open();
                     if (string!=null)
                     {
