diff --git a/src/core/org/apache/jmeter/control/gui/WhileControllerGui.java b/src/core/org/apache/jmeter/control/gui/WhileControllerGui.java
index 238bd35..8bee7bf 100644
--- a/src/core/org/apache/jmeter/control/gui/WhileControllerGui.java
+++ b/src/core/org/apache/jmeter/control/gui/WhileControllerGui.java
@@ -141,8 +141,7 @@
         conditionLabel.setLabelFor(theCondition);
         conditionPanel.add(JTextScrollPane.getInstance(theCondition), BorderLayout.CENTER);
         
-        conditionPanel.add(Box.createHorizontalStrut(conditionLabel.getPreferredSize().width
-                + theCondition.getPreferredSize().width), BorderLayout.NORTH);
+        conditionPanel.add(Box.createHorizontalGlue(), BorderLayout.NORTH);
 
         return conditionPanel;
     }
