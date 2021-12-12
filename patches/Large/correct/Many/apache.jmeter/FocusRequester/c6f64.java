diff --git a/src/core/org/apache/jmeter/gui/util/FocusRequester.java b/src/core/org/apache/jmeter/gui/util/FocusRequester.java
index f1b79f1..adcd777 100644
--- a/src/core/org/apache/jmeter/gui/util/FocusRequester.java
+++ b/src/core/org/apache/jmeter/gui/util/FocusRequester.java
@@ -33,7 +33,7 @@
         SwingUtilities.invokeLater(new Runnable(){
             @Override
             public void run() {
-                comp.requestFocus();
+                comp.requestFocusInWindow();
             }            
         });
     }
