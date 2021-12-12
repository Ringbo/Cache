diff --git a/modules/activiti-engine/src/main/java/org/activiti/engine/delegate/event/impl/ActivitiEventDispatcherImpl.java b/modules/activiti-engine/src/main/java/org/activiti/engine/delegate/event/impl/ActivitiEventDispatcherImpl.java
index a215ea2..a3b31d8 100644
--- a/modules/activiti-engine/src/main/java/org/activiti/engine/delegate/event/impl/ActivitiEventDispatcherImpl.java
+++ b/modules/activiti-engine/src/main/java/org/activiti/engine/delegate/event/impl/ActivitiEventDispatcherImpl.java
@@ -102,7 +102,7 @@
 
     if (event instanceof ActivitiEntityEvent) {
       Object entity = ((ActivitiEntityEvent) event).getEntity();
-      if (entity instanceof ProcessDefinition) {
+      if (entity instanceof ProcessDefinitionEntity) {
         result = (ProcessDefinitionEntity) entity;
       }
     }
