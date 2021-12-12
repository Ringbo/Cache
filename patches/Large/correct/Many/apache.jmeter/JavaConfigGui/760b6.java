diff --git a/src/protocol/java/org/apache/jmeter/protocol/java/config/gui/JavaConfigGui.java b/src/protocol/java/org/apache/jmeter/protocol/java/config/gui/JavaConfigGui.java
index d2372da..ac42864 100644
--- a/src/protocol/java/org/apache/jmeter/protocol/java/config/gui/JavaConfigGui.java
+++ b/src/protocol/java/org/apache/jmeter/protocol/java/config/gui/JavaConfigGui.java
@@ -238,7 +238,7 @@
      * @return a panel containing the relevant components
      */
     private JPanel createParameterPanel() {
-        argsPanel = new ArgumentsPanel(JMeterUtils.getResString("paramtable")); // $NON-NLS-1$
+        argsPanel = new ArgumentsPanel(true,JMeterUtils.getResString("paramtable")); // $NON-NLS-1$
         return argsPanel;
     }
 
