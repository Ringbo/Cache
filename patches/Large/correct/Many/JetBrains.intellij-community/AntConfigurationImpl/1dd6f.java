diff --git a/plugins/ant/src/com/intellij/lang/ant/config/impl/AntConfigurationImpl.java b/plugins/ant/src/com/intellij/lang/ant/config/impl/AntConfigurationImpl.java
index 789e548..f5b55e3 100644
--- a/plugins/ant/src/com/intellij/lang/ant/config/impl/AntConfigurationImpl.java
+++ b/plugins/ant/src/com/intellij/lang/ant/config/impl/AntConfigurationImpl.java
@@ -426,7 +426,7 @@
       });
     }
     else {
-      myStartupManager.registerPostStartupActivity(new Runnable() {
+      myStartupManager.runWhenProjectIsInitialized(new Runnable() {
         public void run() {
           runnable.run();
         }
