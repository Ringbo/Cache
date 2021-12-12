diff --git a/modules/activiti-ui/activiti-app-logic/src/main/java/com/activiti/service/runtime/DeploymentServiceImpl.java b/modules/activiti-ui/activiti-app-logic/src/main/java/com/activiti/service/runtime/DeploymentServiceImpl.java
index aaf3d79..676d159 100644
--- a/modules/activiti-ui/activiti-app-logic/src/main/java/com/activiti/service/runtime/DeploymentServiceImpl.java
+++ b/modules/activiti-ui/activiti-app-logic/src/main/java/com/activiti/service/runtime/DeploymentServiceImpl.java
@@ -333,7 +333,7 @@
             }
         }
         
-        if (StringUtils.isEmpty(formKey)) {
+        if (StringUtils.isEmpty(finalFormKey)) {
             finalFormKey = formKey;
         }
         
