diff --git a/src/core/org/apache/jmeter/testbeans/gui/FileEditor.java b/src/core/org/apache/jmeter/testbeans/gui/FileEditor.java
index 7c4d721..3e2e3e0 100644
--- a/src/core/org/apache/jmeter/testbeans/gui/FileEditor.java
+++ b/src/core/org/apache/jmeter/testbeans/gui/FileEditor.java
@@ -91,12 +91,12 @@
         boolean notExpression = GenericTestBeanCustomizer.notExpression(descriptor);
         boolean notOther = GenericTestBeanCustomizer.notOther(descriptor);
         Object defaultValue = descriptor.getValue(GenericTestBeanCustomizer.DEFAULT);
-        ComboStringEditor cse = new ComboStringEditor(null, notExpression && notOther, notNull);
+        FieldStringEditor cse = new FieldStringEditor();
         editor = new WrapperEditor(this, new SimpleFileEditor(), cse,
                 !notNull, // acceptsNull
                 !notExpression, // acceptsExpressions
                 !notOther, // acceptsOther
-                defaultValue); // default
+                defaultValue == null ? "":defaultValue); // default // //$NON-NLS-1$
 
         // Create a panel containing the combo and the button:
         panel = new JPanel(new BorderLayout(5, 0));
