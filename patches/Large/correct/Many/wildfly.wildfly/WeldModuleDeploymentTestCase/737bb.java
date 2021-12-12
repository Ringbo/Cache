diff --git a/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/weld/multideployment/WeldModuleDeploymentTestCase.java b/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/weld/multideployment/WeldModuleDeploymentTestCase.java
index 23a11f2..1d8fa5b 100644
--- a/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/weld/multideployment/WeldModuleDeploymentTestCase.java
+++ b/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/weld/multideployment/WeldModuleDeploymentTestCase.java
@@ -135,7 +135,7 @@
             }
             modulePath = jbossHome + File.separatorChar + "modules";
         } else {
-            modulePath = modulePath.split(File.pathSeparator)[1];
+            modulePath = modulePath.split(File.pathSeparator)[0];
         }
         File moduleDir = new File(modulePath);
         if (!moduleDir.exists()) {
