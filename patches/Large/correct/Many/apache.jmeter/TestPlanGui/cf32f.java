diff --git a/src/core/org/apache/jmeter/control/gui/TestPlanGui.java b/src/core/org/apache/jmeter/control/gui/TestPlanGui.java
index a1de929..af01028 100644
--- a/src/core/org/apache/jmeter/control/gui/TestPlanGui.java
+++ b/src/core/org/apache/jmeter/control/gui/TestPlanGui.java
@@ -70,7 +70,7 @@
         argsPanel = new ArgumentsPanel(JMeterUtils.getResString("user_defined_variables")); // $NON-NLS-1$
         serializedMode = new JCheckBox(JMeterUtils.getResString("testplan.serialized")); // $NON-NLS-1$
         functionalMode = new JCheckBox(JMeterUtils.getResString("functional_mode")); // $NON-NLS-1$
-        tearDownOnShutdown = new JCheckBox(JMeterUtils.getResString("teardown_on_shutdown")); // $NON-NLS-1$
+        tearDownOnShutdown = new JCheckBox(JMeterUtils.getResString("teardown_on_shutdown"), true); // $NON-NLS-1$
         init();
     }
 
@@ -198,7 +198,7 @@
         super.clearGui();
         functionalMode.setSelected(false);
         serializedMode.setSelected(false);
-        tearDownOnShutdown.setSelected(false);
+        tearDownOnShutdown.setSelected(true);
         argsPanel.clear();
         browseJar.clearFiles();
     }
