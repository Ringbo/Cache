diff --git a/undertow/src/main/java/org/jboss/as/undertow/deployment/UndertowDeploymentProcessor.java b/undertow/src/main/java/org/jboss/as/undertow/deployment/UndertowDeploymentProcessor.java
index cae1407..cea198a 100644
--- a/undertow/src/main/java/org/jboss/as/undertow/deployment/UndertowDeploymentProcessor.java
+++ b/undertow/src/main/java/org/jboss/as/undertow/deployment/UndertowDeploymentProcessor.java
@@ -354,7 +354,7 @@
                 d.setMinorVersion(Integer.parseInt(servletVersion.charAt(2) + ""));
             } else {
                 d.setMajorVersion(3);
-                d.setMajorVersion(1);
+                d.setMinorVersion(1);
             }
 
             //for 2.2 apps we do not require a leading / in path mappings
