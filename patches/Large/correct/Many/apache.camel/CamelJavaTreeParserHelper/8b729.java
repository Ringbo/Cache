diff --git a/tooling/camel-route-parser/src/main/java/org/apache/camel/parser/helper/CamelJavaTreeParserHelper.java b/tooling/camel-route-parser/src/main/java/org/apache/camel/parser/helper/CamelJavaTreeParserHelper.java
index bce6f44..3d2ff1b 100644
--- a/tooling/camel-route-parser/src/main/java/org/apache/camel/parser/helper/CamelJavaTreeParserHelper.java
+++ b/tooling/camel-route-parser/src/main/java/org/apache/camel/parser/helper/CamelJavaTreeParserHelper.java
@@ -95,7 +95,7 @@
 
         List<CamelNodeDetails> answer = new ArrayList<>();
 
-        if (route.getOutputs().isEmpty()) {
+        if (route.getOutputs() == null || route.getOutputs().isEmpty()) {
             // okay no routes found
             return answer;
         }
