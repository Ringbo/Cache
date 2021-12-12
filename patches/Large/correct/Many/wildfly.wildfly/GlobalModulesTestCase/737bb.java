diff --git a/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/ee/globalmodules/GlobalModulesTestCase.java b/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/ee/globalmodules/GlobalModulesTestCase.java
index 4b6dae2..562cee7 100644
--- a/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/ee/globalmodules/GlobalModulesTestCase.java
+++ b/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/ee/globalmodules/GlobalModulesTestCase.java
@@ -181,7 +181,7 @@
             }
             modulePath = jbossHome + File.separatorChar + "modules";
         } else {
-            modulePath = modulePath.split(File.pathSeparator)[1];
+            modulePath = modulePath.split(File.pathSeparator)[0];
         }
         File moduleDir = new File(modulePath);
         if (!moduleDir.exists()) {
