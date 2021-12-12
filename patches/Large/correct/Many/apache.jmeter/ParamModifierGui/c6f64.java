diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/modifier/gui/ParamModifierGui.java b/src/protocol/http/org/apache/jmeter/protocol/http/modifier/gui/ParamModifierGui.java
index cba2c67..c0244b2 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/modifier/gui/ParamModifierGui.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/modifier/gui/ParamModifierGui.java
@@ -236,7 +236,7 @@
             JOptionPane.showMessageDialog(this, "This field must have a long value!", "Value Required",
                     JOptionPane.ERROR_MESSAGE);
             temp.setText(defaultValue);
-            temp.requestFocus();
+            temp.requestFocusInWindow();
         }
         return longVal;
     }
