diff --git a/modules/activiti-form-engine/src/main/java/org/activiti/form/engine/impl/cmd/GetRuntimeFormDefinitionCmd.java b/modules/activiti-form-engine/src/main/java/org/activiti/form/engine/impl/cmd/GetRuntimeFormDefinitionCmd.java
index 94817b5..a71cd4c 100644
--- a/modules/activiti-form-engine/src/main/java/org/activiti/form/engine/impl/cmd/GetRuntimeFormDefinitionCmd.java
+++ b/modules/activiti-form-engine/src/main/java/org/activiti/form/engine/impl/cmd/GetRuntimeFormDefinitionCmd.java
@@ -108,7 +108,7 @@
           try {
             field.setValue(formExpression.getValue(variables));
           } catch (Exception e) {
-            logger.error("Error getting value for expression " + expressionField.getExpression() + " " + e.getMessage());
+            logger.error("Error getting value for expression " + expressionField.getExpression() + " " + e.getMessage(), e);
           }
           
         } else {
