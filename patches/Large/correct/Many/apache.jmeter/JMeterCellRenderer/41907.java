diff --git a/src/core/org/apache/jmeter/gui/tree/JMeterCellRenderer.java b/src/core/org/apache/jmeter/gui/tree/JMeterCellRenderer.java
index e00037d..8f39f03 100644
--- a/src/core/org/apache/jmeter/gui/tree/JMeterCellRenderer.java
+++ b/src/core/org/apache/jmeter/gui/tree/JMeterCellRenderer.java
@@ -67,7 +67,7 @@
                 // icon
                 ic = node.getIcon();
                 if (ic != null) {
-                    setIcon(ic);
+                    setDisabledIcon(ic);
                 }
             }
         }
