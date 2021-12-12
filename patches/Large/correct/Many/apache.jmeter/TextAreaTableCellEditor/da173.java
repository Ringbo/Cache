diff --git a/src/core/org/apache/jmeter/gui/util/TextAreaTableCellEditor.java b/src/core/org/apache/jmeter/gui/util/TextAreaTableCellEditor.java
index e14188a..bf17f8a 100644
--- a/src/core/org/apache/jmeter/gui/util/TextAreaTableCellEditor.java
+++ b/src/core/org/apache/jmeter/gui/util/TextAreaTableCellEditor.java
@@ -44,7 +44,7 @@
     			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
     	pane.validate();
     	this.row = row;
-    	this.col = col;
+    	this.col = column;
     	return pane;
     }
     
