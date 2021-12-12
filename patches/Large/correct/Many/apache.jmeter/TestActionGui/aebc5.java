diff --git a/src/components/org/apache/jmeter/sampler/gui/TestActionGui.java b/src/components/org/apache/jmeter/sampler/gui/TestActionGui.java
index 468e424..1b117e9 100644
--- a/src/components/org/apache/jmeter/sampler/gui/TestActionGui.java
+++ b/src/components/org/apache/jmeter/sampler/gui/TestActionGui.java
@@ -179,7 +179,7 @@
             if (pauseButton.isSelected()) {
                 action = TestAction.PAUSE;
                 durationField.setEnabled(true);
-                targetBox.setEnabled(true);
+                targetBox.setEnabled(false);
             }
         });
         stopButton = new JRadioButton(stopAction, false);
