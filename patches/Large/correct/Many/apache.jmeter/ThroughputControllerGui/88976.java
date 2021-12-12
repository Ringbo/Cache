diff --git a/src/components/org/apache/jmeter/control/gui/ThroughputControllerGui.java b/src/components/org/apache/jmeter/control/gui/ThroughputControllerGui.java
index 0ba7ec6..fa66a71 100644
--- a/src/components/org/apache/jmeter/control/gui/ThroughputControllerGui.java
+++ b/src/components/org/apache/jmeter/control/gui/ThroughputControllerGui.java
@@ -101,9 +101,9 @@
     @Override
     public void clearGui() {
         super.clearGui();
-        styleBox.setSelectedIndex(0);
+        styleBox.setSelectedIndex(1);
         throughput.setText("1"); // $NON-NLS-1$
-        perthread.setSelected(true);
+        perthread.setSelected(false);
     }
 
     @Override
