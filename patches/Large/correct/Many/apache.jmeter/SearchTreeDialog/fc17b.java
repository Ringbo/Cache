diff --git a/src/core/org/apache/jmeter/gui/action/SearchTreeDialog.java b/src/core/org/apache/jmeter/gui/action/SearchTreeDialog.java
index 693e1f5..ac1c2a2 100644
--- a/src/core/org/apache/jmeter/gui/action/SearchTreeDialog.java
+++ b/src/core/org/apache/jmeter/gui/action/SearchTreeDialog.java
@@ -98,7 +98,7 @@
     private JButton replaceButton;
 
     public SearchTreeDialog() {
-        super((JFrame) null, JMeterUtils.getResString("search_tree_title"), true); //$NON-NLS-1$
+        super((JFrame) null, JMeterUtils.getResString("search_tree_title"), false); //$NON-NLS-1$
         init();
     }
 
