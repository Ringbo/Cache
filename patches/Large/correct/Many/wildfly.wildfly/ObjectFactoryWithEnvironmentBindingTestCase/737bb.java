diff --git a/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/naming/ObjectFactoryWithEnvironmentBindingTestCase.java b/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/naming/ObjectFactoryWithEnvironmentBindingTestCase.java
index 8c3f214..40f45e3 100644
--- a/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/naming/ObjectFactoryWithEnvironmentBindingTestCase.java
+++ b/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/naming/ObjectFactoryWithEnvironmentBindingTestCase.java
@@ -210,7 +210,7 @@
             }
             modulePath = jbossHome + File.separatorChar + "modules";
         } else {
-            modulePath = modulePath.split(File.pathSeparator)[1];
+            modulePath = modulePath.split(File.pathSeparator)[0];
         }
         File moduleDir = new File(modulePath);
         if (!moduleDir.exists()) {
