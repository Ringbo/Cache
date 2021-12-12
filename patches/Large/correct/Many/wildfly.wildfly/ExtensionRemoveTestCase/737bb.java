diff --git a/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/extension/remove/ExtensionRemoveTestCase.java b/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/extension/remove/ExtensionRemoveTestCase.java
index 219096c..6bc2447 100644
--- a/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/extension/remove/ExtensionRemoveTestCase.java
+++ b/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/extension/remove/ExtensionRemoveTestCase.java
@@ -224,7 +224,7 @@
             }
             modulePath = jbossHome + File.separatorChar + "modules";
         }else{
-           modulePath = modulePath.split(File.pathSeparator)[1];
+           modulePath = modulePath.split(File.pathSeparator)[0];
         }
         File moduleDir = new File(modulePath);
         if (!moduleDir.exists()) {
