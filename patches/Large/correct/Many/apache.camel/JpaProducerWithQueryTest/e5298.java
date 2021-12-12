diff --git a/components/camel-jpa/src/test/java/org/apache/camel/processor/jpa/JpaProducerWithQueryTest.java b/components/camel-jpa/src/test/java/org/apache/camel/processor/jpa/JpaProducerWithQueryTest.java
index 619ce02..7feecce 100644
--- a/components/camel-jpa/src/test/java/org/apache/camel/processor/jpa/JpaProducerWithQueryTest.java
+++ b/components/camel-jpa/src/test/java/org/apache/camel/processor/jpa/JpaProducerWithQueryTest.java
@@ -125,7 +125,7 @@
         Map<String, Object> params = new HashMap<>();
         params.put("custName", "${body}");
         // bind the params
-        registry.put("params", params);
+        registry.bind("params", params);
         camelContext.setRegistry(registry);
 
         camelContext.addRoutes(new RouteBuilder() {
