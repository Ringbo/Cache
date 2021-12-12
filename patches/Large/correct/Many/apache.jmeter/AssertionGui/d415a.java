diff --git a/src/components/org/apache/jmeter/assertions/gui/AssertionGui.java b/src/components/org/apache/jmeter/assertions/gui/AssertionGui.java
index 017fb7c..56865dc 100644
--- a/src/components/org/apache/jmeter/assertions/gui/AssertionGui.java
+++ b/src/components/org/apache/jmeter/assertions/gui/AssertionGui.java
@@ -200,7 +200,7 @@
         responseHeadersButton.setSelected(false);
         assumeSuccess.setSelected(false);
 
-        containsBox.setSelected(true);
+        substringBox.setSelected(true);
         notBox.setSelected(false);
     }
 
