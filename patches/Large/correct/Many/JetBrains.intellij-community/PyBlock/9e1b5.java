diff --git a/python/src/com/jetbrains/python/formatter/PyBlock.java b/python/src/com/jetbrains/python/formatter/PyBlock.java
index df85310..899586c 100644
--- a/python/src/com/jetbrains/python/formatter/PyBlock.java
+++ b/python/src/com/jetbrains/python/formatter/PyBlock.java
@@ -539,7 +539,7 @@
     if (afterNode != null && afterNode.getElementType() == PyElementTypes.KEY_VALUE_EXPRESSION) {
       PyKeyValueExpression keyValue = (PyKeyValueExpression) afterNode.getPsi();
       if (keyValue != null && keyValue.getValue() == null) {  // incomplete
-        return Indent.getContinuationIndent(true);
+        return Indent.getContinuationIndent();
       }
     }
 
