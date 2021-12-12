diff --git a/components/camel-servicenow/src/main/java/org/apache/camel/component/servicenow/ServiceNowComponent.java b/components/camel-servicenow/src/main/java/org/apache/camel/component/servicenow/ServiceNowComponent.java
index 4690eee..29b528a 100644
--- a/components/camel-servicenow/src/main/java/org/apache/camel/component/servicenow/ServiceNowComponent.java
+++ b/components/camel-servicenow/src/main/java/org/apache/camel/component/servicenow/ServiceNowComponent.java
@@ -57,7 +57,7 @@
         }
 
         Map<String, Object> responseModels = IntrospectionSupport.extractProperties(parameters, "responseModel.");
-        for (Map.Entry<String, Object> entry : requestModels.entrySet()) {
+        for (Map.Entry<String, Object> entry : responseModels.entrySet()) {
             configuration.addResponseModel(
                 entry.getKey(),
                 EndpointHelper.resolveParameter(context, (String)entry.getValue(), Class.class));
