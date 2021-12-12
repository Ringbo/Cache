diff --git a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/persistence/entity/JobEntityManagerImpl.java b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/persistence/entity/JobEntityManagerImpl.java
index 8306654..51565ec 100644
--- a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/persistence/entity/JobEntityManagerImpl.java
+++ b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/persistence/entity/JobEntityManagerImpl.java
@@ -290,7 +290,7 @@
   protected void removeExecutionLink(JobEntity jobEntity) {
     if (jobEntity.getExecutionId() != null) {
       ExecutionEntity execution = getExecutionEntityManager().findById(jobEntity.getExecutionId());
-      execution.getJobs().remove(this);
+      execution.getJobs().remove(jobEntity);
     }
   }
 
