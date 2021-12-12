diff --git a/components/camel-jpa/src/test/java/org/apache/camel/component/jpa/JpaWithNamedQueryAndParametersTest.java b/components/camel-jpa/src/test/java/org/apache/camel/component/jpa/JpaWithNamedQueryAndParametersTest.java
index f715726..e7a8a66 100644
--- a/components/camel-jpa/src/test/java/org/apache/camel/component/jpa/JpaWithNamedQueryAndParametersTest.java
+++ b/components/camel-jpa/src/test/java/org/apache/camel/component/jpa/JpaWithNamedQueryAndParametersTest.java
@@ -126,7 +126,7 @@
         Map<String, Object> params = new HashMap<>();
         params.put("custName", "Willem");
         // bind the params
-        registry.put("params", params);
+        registry.bind("params", params);
         camelContext.setRegistry(registry);
         
         template = camelContext.createProducerTemplate();
