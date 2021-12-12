diff --git a/AngularJS/src/org/angularjs/index/AngularJSIndexingHandler.java b/AngularJS/src/org/angularjs/index/AngularJSIndexingHandler.java
index 87112b1..86659aa 100644
--- a/AngularJS/src/org/angularjs/index/AngularJSIndexingHandler.java
+++ b/AngularJS/src/org/angularjs/index/AngularJSIndexingHandler.java
@@ -627,7 +627,7 @@
         } else if (CONTROLLER.equals(property.getName())) {
           final int idx = unquotedValue != null ? unquotedValue.indexOf(AS_CONNECTOR_WITH_SPACES) : 0;
           if (idx > 0 && (idx + AS_CONNECTOR_WITH_SPACES.length()) < (unquotedValue.length() - 1)) {
-            return recordControllerAs(property, outData, value, unquotedValue.substring(idx + AS_CONNECTOR_WITH_SPACES.length(), unquotedValue.length()));
+            return recordControllerAs(property, outData, value, unquotedValue.substring(idx + AS_CONNECTOR_WITH_SPACES.length()));
           }
         } else if ("name".equals(property.getName())) {
           addImplicitElements(value, STATE, INDEXERS.get(STATE), unquotedValue, null, outData);
