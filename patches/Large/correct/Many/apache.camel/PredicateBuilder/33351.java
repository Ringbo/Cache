diff --git a/camel-core/src/main/java/org/apache/camel/builder/PredicateBuilder.java b/camel-core/src/main/java/org/apache/camel/builder/PredicateBuilder.java
index dbc7631..86b9f97 100644
--- a/camel-core/src/main/java/org/apache/camel/builder/PredicateBuilder.java
+++ b/camel-core/src/main/java/org/apache/camel/builder/PredicateBuilder.java
@@ -199,7 +199,7 @@
         return new BinaryPredicateSupport<E>(left, right) {
 
             protected boolean matches(E exchange, Object leftValue, Object rightValue) {
-                return compare(leftValue, rightValue) < 0;
+                return compare(leftValue, rightValue) >= 0;
             }
 
             protected String getOperationText() {
