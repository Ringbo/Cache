diff --git a/src/core/org/apache/jmeter/gui/GuiPackage.java b/src/core/org/apache/jmeter/gui/GuiPackage.java
index cb37765..e24f259 100644
--- a/src/core/org/apache/jmeter/gui/GuiPackage.java
+++ b/src/core/org/apache/jmeter/gui/GuiPackage.java
@@ -597,7 +597,7 @@
             popup.pack();
             popup.show(invoker, e.getX(), e.getY());
             popup.setVisible(true);
-            popup.requestFocus();
+            popup.requestFocusInWindow();
         }
     }
 
