diff --git a/AngularJS/src/org/angularjs/index/AngularJSIndexingHandler.java b/AngularJS/src/org/angularjs/index/AngularJSIndexingHandler.java
index 9101b19..a0d96f2 100644
--- a/AngularJS/src/org/angularjs/index/AngularJSIndexingHandler.java
+++ b/AngularJS/src/org/angularjs/index/AngularJSIndexingHandler.java
@@ -620,7 +620,7 @@
       arrayExpression = (JSExpression)last;
     }
     if (last != null && arrayExpression != null) {
-      return evaluator.evalComponentTypeFromArrayExpression(resolveParent, arrayExpression) != null;
+      return evaluator.addComponentTypeFromArrayExpression(resolveParent, arrayExpression) != null;
     }
     return false;
   }
