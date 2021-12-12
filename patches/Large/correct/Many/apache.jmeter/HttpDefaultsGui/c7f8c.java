diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/config/gui/HttpDefaultsGui.java b/src/protocol/http/org/apache/jmeter/protocol/http/config/gui/HttpDefaultsGui.java
index 883c0ce..5b5c33b 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/config/gui/HttpDefaultsGui.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/config/gui/HttpDefaultsGui.java
@@ -151,7 +151,7 @@
         concurrentDwn = new JCheckBox(JMeterUtils.getResString("web_testing_concurrent_download")); // $NON-NLS-1$
         concurrentDwn.addItemListener(new ItemListener() {
             public void itemStateChanged(final ItemEvent e) {
-                if (e.getStateChange() == ItemEvent.SELECTED) { concurrentPool.setEnabled(true); }
+                if (imageParser.isSelected() && e.getStateChange() == ItemEvent.SELECTED) { concurrentPool.setEnabled(true); }
                 else { concurrentPool.setEnabled(false); }
             }
         });
