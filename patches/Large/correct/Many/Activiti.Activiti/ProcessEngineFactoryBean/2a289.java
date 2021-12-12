diff --git a/modules/activiti-spring/src/main/java/org/activiti/spring/ProcessEngineFactoryBean.java b/modules/activiti-spring/src/main/java/org/activiti/spring/ProcessEngineFactoryBean.java
index 752c3ec..1c8e302 100644
--- a/modules/activiti-spring/src/main/java/org/activiti/spring/ProcessEngineFactoryBean.java
+++ b/modules/activiti-spring/src/main/java/org/activiti/spring/ProcessEngineFactoryBean.java
@@ -59,7 +59,7 @@
   }
 
   protected void initializeExpressionManager() {
-    if (applicationContext != null) {
+    if (processEngineConfiguration.getExpressionManager() == null && applicationContext != null) {
       processEngineConfiguration.setExpressionManager(
         new SpringExpressionManager(applicationContext, processEngineConfiguration.getBeans()));
     }
