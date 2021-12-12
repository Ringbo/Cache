diff --git a/plugins/xpath/xpath-view/src/org/intellij/plugins/xpathView/XPathExpressionGenerator.java b/plugins/xpath/xpath-view/src/org/intellij/plugins/xpathView/XPathExpressionGenerator.java
index 7d0dc12..d58f635 100644
--- a/plugins/xpath/xpath-view/src/org/intellij/plugins/xpathView/XPathExpressionGenerator.java
+++ b/plugins/xpath/xpath-view/src/org/intellij/plugins/xpathView/XPathExpressionGenerator.java
@@ -78,7 +78,7 @@
                         }
                     }
 
-                    int i = 0;
+                    int i = 1;
                     for (Object o1 : list) {
                         if (o1 == what) {
                             return uniquePath + "[" + i + "]";
