diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/control/gui/HttpTestSampleGui.java b/src/protocol/http/org/apache/jmeter/protocol/http/control/gui/HttpTestSampleGui.java
index a3e43ba..09516a7 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/control/gui/HttpTestSampleGui.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/control/gui/HttpTestSampleGui.java
@@ -168,7 +168,7 @@
         concurrentDwn = new JCheckBox(JMeterUtils.getResString("web_testing_concurrent_download")); // $NON-NLS-1$
         concurrentDwn.addItemListener(new ItemListener() {
             public void itemStateChanged(final ItemEvent e) {
-                if (e.getStateChange() == ItemEvent.SELECTED) { concurrentPool.setEnabled(true); }
+                if (getImages.isSelected() && e.getStateChange() == ItemEvent.SELECTED) { concurrentPool.setEnabled(true); }
                 else { concurrentPool.setEnabled(false); }
             }
         });
