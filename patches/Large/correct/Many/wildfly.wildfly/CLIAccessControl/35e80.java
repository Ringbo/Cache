diff --git a/cli/src/main/java/org/jboss/as/cli/accesscontrol/CLIAccessControl.java b/cli/src/main/java/org/jboss/as/cli/accesscontrol/CLIAccessControl.java
index 0d288e3..1b6fab9 100644
--- a/cli/src/main/java/org/jboss/as/cli/accesscontrol/CLIAccessControl.java
+++ b/cli/src/main/java/org/jboss/as/cli/accesscontrol/CLIAccessControl.java
@@ -56,7 +56,7 @@
 
         final ModelNode defaults = accessControl.get(Util.DEFAULT);
         if(!defaults.has(Util.OPERATIONS)) {
-            log.warn("access-control/default is missing operations: " + accessControl);
+            log.warn("access-control/default is missing operations: " + defaults);
             return false;
         }
 
