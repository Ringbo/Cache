diff --git a/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/jca/moduledeployment/ModuleDeploymentTestCaseSetup.java b/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/jca/moduledeployment/ModuleDeploymentTestCaseSetup.java
index 79552fe..4bd6169 100644
--- a/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/jca/moduledeployment/ModuleDeploymentTestCaseSetup.java
+++ b/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/jca/moduledeployment/ModuleDeploymentTestCaseSetup.java
@@ -123,7 +123,7 @@
             }
             modulePath = jbossHome + File.separatorChar + "modules";
         } else {
-            modulePath = modulePath.split(File.pathSeparator)[1];
+            modulePath = modulePath.split(File.pathSeparator)[0];
         }
         File moduleDir = new File(modulePath);
         if (!moduleDir.exists()) {
