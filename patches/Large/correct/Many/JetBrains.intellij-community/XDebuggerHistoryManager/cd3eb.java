diff --git a/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/XDebuggerHistoryManager.java b/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/XDebuggerHistoryManager.java
index 757610b..d6c9025 100644
--- a/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/XDebuggerHistoryManager.java
+++ b/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/XDebuggerHistoryManager.java
@@ -51,7 +51,7 @@
       list.removeLast();
     }
 
-    XExpression trimmedExpression = new XExpressionImpl(expression.getExpression().trim(), expression.getLanguage(), expression.getCustomInfo());
+    XExpression trimmedExpression = new XExpressionImpl(expression.getExpression().trim(), expression.getLanguage(), expression.getCustomInfo(), expression.getMode());
     list.remove(trimmedExpression);
     list.addFirst(trimmedExpression);
     return true;
