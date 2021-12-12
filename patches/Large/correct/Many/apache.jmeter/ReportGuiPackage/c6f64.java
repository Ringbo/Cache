diff --git a/src/reports/org/apache/jmeter/gui/ReportGuiPackage.java b/src/reports/org/apache/jmeter/gui/ReportGuiPackage.java
index 4c21cbb..cecb195 100644
--- a/src/reports/org/apache/jmeter/gui/ReportGuiPackage.java
+++ b/src/reports/org/apache/jmeter/gui/ReportGuiPackage.java
@@ -555,7 +555,7 @@
             popup.pack();
             popup.show(invoker, e.getX(), e.getY());
             popup.setVisible(true);
-            popup.requestFocus();
+            popup.requestFocusInWindow();
         }
     }
 
