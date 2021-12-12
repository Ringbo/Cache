diff --git a/camel-core/src/main/java/org/apache/camel/model/HandledPredicate.java b/camel-core/src/main/java/org/apache/camel/model/HandledPredicate.java
index 6df5ac5..b3aff26 100644
--- a/camel-core/src/main/java/org/apache/camel/model/HandledPredicate.java
+++ b/camel-core/src/main/java/org/apache/camel/model/HandledPredicate.java
@@ -61,7 +61,7 @@
     }
 
     public Predicate createPredicate(RouteContext routeContext) {
-        ExpressionType predicateType = getCompletePredicate();
+        ExpressionType predicateType = getHandledPredicate();
         if (predicateType != null && predicate == null) {
             predicate = predicateType.createPredicate(routeContext);
         }
