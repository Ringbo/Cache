diff --git a/activiti-api-impl/activiti-api-process-runtime-impl/src/main/java/org/activiti/runtime/api/connector/DefaultServiceTaskBehavior.java b/activiti-api-impl/activiti-api-process-runtime-impl/src/main/java/org/activiti/runtime/api/connector/DefaultServiceTaskBehavior.java
index 1bdf4fc..9930e7b 100644
--- a/activiti-api-impl/activiti-api-process-runtime-impl/src/main/java/org/activiti/runtime/api/connector/DefaultServiceTaskBehavior.java
+++ b/activiti-api-impl/activiti-api-process-runtime-impl/src/main/java/org/activiti/runtime/api/connector/DefaultServiceTaskBehavior.java
@@ -81,7 +81,7 @@
                             Connector.class);
         }
 
-        IntegrationContext results = connector.execute(context);
+        IntegrationContext results = connector.apply(context);
 
         if(variablesMatchHelper != null) {
             execution.setVariables(variablesMatchHelper.match(results.getOutBoundVariables(),
