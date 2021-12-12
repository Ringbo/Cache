diff --git a/ambari-server/src/main/java/org/apache/ambari/server/controller/internal/UpgradeResourceProvider.java b/ambari-server/src/main/java/org/apache/ambari/server/controller/internal/UpgradeResourceProvider.java
index 2f6ffc1..22858dd 100644
--- a/ambari-server/src/main/java/org/apache/ambari/server/controller/internal/UpgradeResourceProvider.java
+++ b/ambari-server/src/main/java/org/apache/ambari/server/controller/internal/UpgradeResourceProvider.java
@@ -176,7 +176,7 @@
 
   /**
    * The role that will be used when creating HRC's for the type
-   * {@link StageWrapper.Type#RU_TASKS}.
+   * {@link StageWrapper.Type#UPGRADE_TASKS}.
    */
   protected static final String EXECUTE_TASK_ROLE = "ru_execute_tasks";
 
@@ -828,7 +828,7 @@
         makeCommandStage(context, request, effectiveRepositoryVersion, entity, wrapper, skippable,
             supportsAutoSkipOnFailure, allowRetry);
         break;
-      case RU_TASKS:
+      case UPGRADE_TASKS:
         makeActionStage(context, request, effectiveRepositoryVersion, entity, wrapper, skippable,
             supportsAutoSkipOnFailure, allowRetry);
         break;
