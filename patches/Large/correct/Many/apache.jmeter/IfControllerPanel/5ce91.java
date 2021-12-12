diff --git a/src/core/org/apache/jmeter/control/gui/IfControllerPanel.java b/src/core/org/apache/jmeter/control/gui/IfControllerPanel.java
index cf40f2a..9765281 100644
--- a/src/core/org/apache/jmeter/control/gui/IfControllerPanel.java
+++ b/src/core/org/apache/jmeter/control/gui/IfControllerPanel.java
@@ -180,8 +180,7 @@
         conditionLabel.setLabelFor(theCondition);
         conditionPanel.add(JTextScrollPane.getInstance(theCondition), BorderLayout.CENTER);
        
-        conditionPanel.add(Box.createHorizontalStrut(conditionLabel.getPreferredSize().width
-                + theCondition.getPreferredSize().width), BorderLayout.NORTH);
+        conditionPanel.add(Box.createHorizontalGlue(), BorderLayout.NORTH);
 
         JPanel optionPanel = new JPanel();
 
