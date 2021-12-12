diff --git a/arquillian/common/src/main/java/org/jboss/as/arquillian/container/ArchiveDeployer.java b/arquillian/common/src/main/java/org/jboss/as/arquillian/container/ArchiveDeployer.java
index ab460e1..f5bacfe 100644
--- a/arquillian/common/src/main/java/org/jboss/as/arquillian/container/ArchiveDeployer.java
+++ b/arquillian/common/src/main/java/org/jboss/as/arquillian/container/ArchiveDeployer.java
@@ -77,7 +77,7 @@
             return deployer.deploy(name, input);
         } catch (Exception ex) {
             Throwable rootCause = ex.getCause();
-            while (null != rootCause) {
+            while (null != rootCause && rootCause.getCause() != null) {
                 rootCause = rootCause.getCause();
             }
             throw new DeploymentException("Cannot deploy: " + name, rootCause);
