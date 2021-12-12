diff --git a/src/reports/org/apache/jmeter/report/gui/tree/ReportTreeListener.java b/src/reports/org/apache/jmeter/report/gui/tree/ReportTreeListener.java
index d52b4d1..6bcc79e 100644
--- a/src/reports/org/apache/jmeter/report/gui/tree/ReportTreeListener.java
+++ b/src/reports/org/apache/jmeter/report/gui/tree/ReportTreeListener.java
@@ -321,7 +321,7 @@
             popup.pack();
             popup.show(tree, e.getX(), e.getY());
             popup.setVisible(true);
-            popup.requestFocus();
+            popup.requestFocusInWindow();
         }
     }
 }
