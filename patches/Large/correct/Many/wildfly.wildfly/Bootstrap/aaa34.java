diff --git a/server/src/main/java/org/jboss/as/server/Bootstrap.java b/server/src/main/java/org/jboss/as/server/Bootstrap.java
index 463c3db..f7dbbc0 100644
--- a/server/src/main/java/org/jboss/as/server/Bootstrap.java
+++ b/server/src/main/java/org/jboss/as/server/Bootstrap.java
@@ -80,7 +80,7 @@
         private long startTime = Module.getStartTime();
 
         public Configuration(final ServerEnvironment serverEnvironment) {
-            assert serverEnvironment == null : "serverEnvironment is null";
+            assert serverEnvironment != null : "serverEnvironment is null";
             this.serverEnvironment = serverEnvironment;
             this.extensionRegistry = new ExtensionRegistry(serverEnvironment.getLaunchType().getProcessType());
         }
