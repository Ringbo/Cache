diff --git a/platform/lang-impl/src/com/intellij/execution/impl/ExecutionManagerImpl.java b/platform/lang-impl/src/com/intellij/execution/impl/ExecutionManagerImpl.java
index 6b7595e..182b8fb 100644
--- a/platform/lang-impl/src/com/intellij/execution/impl/ExecutionManagerImpl.java
+++ b/platform/lang-impl/src/com/intellij/execution/impl/ExecutionManagerImpl.java
@@ -137,7 +137,12 @@
                 LOG.warn("Cannot find BeforeRunTaskProvider for id='" + task.getProviderId()+"'");
                 continue;
               }
-              ExecutionEnvironment taskEnvironment = new ExecutionEnvironment(env.getRunProfile(), env.getProject(), null, null, null, null);
+              ExecutionEnvironment taskEnvironment = new ExecutionEnvironment(env.getRunProfile(),
+                                                                              env.getExecutionTarget(),
+                                                                              env.getProject(),
+                                                                              env.getRunnerSettings(),
+                                                                              env.getConfigurationSettings(),
+                                                                              null, null);
               taskEnvironment.putUserData(RunContentDescriptor.REUSE_CONTENT_PROHIBITED, RunConfigurationBeforeRunProvider.ID.equals(provider.getId()));
               if (!provider.executeTask(dataContext, runConfiguration, taskEnvironment, task)) {
                 if (onCancelRunnable != null) {
