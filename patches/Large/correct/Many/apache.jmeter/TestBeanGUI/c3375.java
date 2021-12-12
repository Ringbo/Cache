diff --git a/src/core/org/apache/jmeter/testbeans/gui/TestBeanGUI.java b/src/core/org/apache/jmeter/testbeans/gui/TestBeanGUI.java
index f5961ae..725b3b9 100644
--- a/src/core/org/apache/jmeter/testbeans/gui/TestBeanGUI.java
+++ b/src/core/org/apache/jmeter/testbeans/gui/TestBeanGUI.java
@@ -436,7 +436,7 @@
 			if (notOther) v="${}";
 			else if (notNull) v= "";
 			else if (defaultValue != null) v= wrapper.getAsText();
-			else if (tags != null && tags.length>0) v= tags[1];
+			else if (tags != null && tags.length>0) v= tags[0];
 			else if (notExpression) v= "";
 			else v="${}";
 
