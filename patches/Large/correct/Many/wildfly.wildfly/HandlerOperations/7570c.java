diff --git a/logging/src/main/java/org/jboss/as/logging/HandlerOperations.java b/logging/src/main/java/org/jboss/as/logging/HandlerOperations.java
index e280521..08afbff 100644
--- a/logging/src/main/java/org/jboss/as/logging/HandlerOperations.java
+++ b/logging/src/main/java/org/jboss/as/logging/HandlerOperations.java
@@ -143,9 +143,9 @@
                         reloadRequired = reloadRequired || Logging.requiresReload(attribute.getFlags());
                     }
                     if (restartRequired) {
-                        context.restartRequired();
+                        context.revertRestartRequired();
                     } else if (reloadRequired) {
-                        context.reloadRequired();
+                        context.revertReloadRequired();
                     }
                 }
                 performRollback(context, configuration, name, originalModel);
