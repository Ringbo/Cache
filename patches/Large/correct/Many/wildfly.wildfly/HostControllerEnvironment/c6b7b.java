diff --git a/host-controller/src/main/java/org/jboss/as/host/controller/HostControllerEnvironment.java b/host-controller/src/main/java/org/jboss/as/host/controller/HostControllerEnvironment.java
index 4b3c19c..8791f36 100644
--- a/host-controller/src/main/java/org/jboss/as/host/controller/HostControllerEnvironment.java
+++ b/host-controller/src/main/java/org/jboss/as/host/controller/HostControllerEnvironment.java
@@ -319,7 +319,7 @@
         if (tmp == null) {
             tmp = new File(this.domainBaseDir, "configuration");
         }
-        if (!tmp.exists() && !tmp.isDirectory()) {
+        if (!tmp.exists() || !tmp.isDirectory()) {
             throw MESSAGES.configDirectoryDoesNotExist(tmp);
         }
         this.domainConfigurationDir = tmp;
