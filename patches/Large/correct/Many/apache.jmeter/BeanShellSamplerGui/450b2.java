diff --git a/src/protocol/java/org/apache/jmeter/protocol/java/control/gui/BeanShellSamplerGui.java b/src/protocol/java/org/apache/jmeter/protocol/java/control/gui/BeanShellSamplerGui.java
index 8b6c139..8eda8a6 100644
--- a/src/protocol/java/org/apache/jmeter/protocol/java/control/gui/BeanShellSamplerGui.java
+++ b/src/protocol/java/org/apache/jmeter/protocol/java/control/gui/BeanShellSamplerGui.java
@@ -53,7 +53,7 @@
 
     @Override
     public void configure(TestElement element) {
-        scriptField.setText(element.getPropertyAsString(BeanShellSampler.SCRIPT));
+        scriptField.setInitialText(element.getPropertyAsString(BeanShellSampler.SCRIPT));
         scriptField.setCaretPosition(0);
         filename.setText(element.getPropertyAsString(BeanShellSampler.FILENAME));
         parameters.setText(element.getPropertyAsString(BeanShellSampler.PARAMETERS));
@@ -92,7 +92,7 @@
 
         filename.setText(""); //$NON-NLS-1$
         parameters.setText(""); //$NON-NLS-1$
-        scriptField.setText(""); //$NON-NLS-1$
+        scriptField.setInitialText(""); //$NON-NLS-1$
         resetInterpreter.setSelected(false);
     }
 
