diff --git a/AngularJS/src/org/angularjs/index/AngularJS2IndexingHandler.java b/AngularJS/src/org/angularjs/index/AngularJS2IndexingHandler.java
index 118ac2b..67d4a7e 100644
--- a/AngularJS/src/org/angularjs/index/AngularJS2IndexingHandler.java
+++ b/AngularJS/src/org/angularjs/index/AngularJS2IndexingHandler.java
@@ -207,7 +207,7 @@
     final JSProperty selector = getProperty(decorator, name);
     final JSExpression value = selector != null ? selector.getValue() : null;
     if (value instanceof JSBinaryExpression) {
-      return JSInjectionController.getInjectionText(value);
+      return JSInjectionController.getConcatenationText(value);
     }
     if (value instanceof JSLiteralExpression && ((JSLiteralExpression)value).isQuotedLiteral()) {
       return AngularJSIndexingHandler.unquote(value);
