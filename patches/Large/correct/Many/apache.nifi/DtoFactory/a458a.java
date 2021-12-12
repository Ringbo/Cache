diff --git a/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-web/nifi-web-api/src/main/java/org/apache/nifi/web/api/dto/DtoFactory.java b/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-web/nifi-web-api/src/main/java/org/apache/nifi/web/api/dto/DtoFactory.java
index b0f2296..58abdea 100644
--- a/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-web/nifi-web-api/src/main/java/org/apache/nifi/web/api/dto/DtoFactory.java
+++ b/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-web/nifi-web-api/src/main/java/org/apache/nifi/web/api/dto/DtoFactory.java
@@ -2050,7 +2050,7 @@
 
         final Map<String, String> variables = group.getVariableRegistry().getVariableMap().entrySet().stream()
             .collect(Collectors.toMap(entry -> entry.getKey().getName(), entry -> entry.getValue()));
-        group.setVariables(variables);
+        dto.setVariables(variables);
 
         final ProcessGroup parentGroup = group.getParent();
         if (parentGroup != null) {
