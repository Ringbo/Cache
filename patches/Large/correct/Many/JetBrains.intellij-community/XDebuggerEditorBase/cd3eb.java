diff --git a/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/ui/XDebuggerEditorBase.java b/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/ui/XDebuggerEditorBase.java
index 5928d8b..05d5616 100644
--- a/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/ui/XDebuggerEditorBase.java
+++ b/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/ui/XDebuggerEditorBase.java
@@ -240,7 +240,7 @@
     final List<XExpression> expressions = getRecentExpressions();
     if (myHistoryIndex < expressions.size() - 1) {
       myHistoryIndex++;
-      setEditorText(expressions.get(myHistoryIndex));
+      setExpression(expressions.get(myHistoryIndex));
     }
   }
 
@@ -248,7 +248,7 @@
     final List<XExpression> expressions = getRecentExpressions();
     if (myHistoryIndex > 0) {
       myHistoryIndex--;
-      setEditorText(expressions.get(myHistoryIndex));
+      setExpression(expressions.get(myHistoryIndex));
     }
   }
 }
