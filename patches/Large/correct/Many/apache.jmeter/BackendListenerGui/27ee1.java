diff --git a/src/components/org/apache/jmeter/visualizers/backend/BackendListenerGui.java b/src/components/org/apache/jmeter/visualizers/backend/BackendListenerGui.java
index 8b1db25..8032bfe 100644
--- a/src/components/org/apache/jmeter/visualizers/backend/BackendListenerGui.java
+++ b/src/components/org/apache/jmeter/visualizers/backend/BackendListenerGui.java
@@ -214,7 +214,7 @@
      * @return a panel containing the relevant components
      */
     private JPanel createParameterPanel() {
-        argsPanel = new ArgumentsPanel(JMeterUtils.getResString("backend_listener_paramtable")); // $NON-NLS-1$
+        argsPanel = new ArgumentsPanel(true,JMeterUtils.getResString("backend_listener_paramtable")); // $NON-NLS-1$
         return argsPanel;
     }
 
