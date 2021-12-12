diff --git a/platform/lang-impl/src/com/intellij/execution/impl/RunManagerImpl.java b/platform/lang-impl/src/com/intellij/execution/impl/RunManagerImpl.java
index 7dd72ba..5780ac2 100644
--- a/platform/lang-impl/src/com/intellij/execution/impl/RunManagerImpl.java
+++ b/platform/lang-impl/src/com/intellij/execution/impl/RunManagerImpl.java
@@ -282,7 +282,7 @@
   static String getUniqueName(@NotNull RunnerAndConfigurationSettings settings) {
     RunConfiguration config = settings.getConfiguration();
     return config.getType().getDisplayName() + "." + settings.getName() +
-           (settings instanceof UnknownRunConfiguration ? config.getUniqueID() : "");
+           (config instanceof UnknownRunConfiguration ? config.getUniqueID() : "");
   }
 
   public void removeConfigurations(@NotNull final ConfigurationType type) {
