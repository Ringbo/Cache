diff --git a/core/test/com/googlecode/guice/StrictContainerTestSuiteBuilder.java b/core/test/com/googlecode/guice/StrictContainerTestSuiteBuilder.java
index ec99089..82838b8 100644
--- a/core/test/com/googlecode/guice/StrictContainerTestSuiteBuilder.java
+++ b/core/test/com/googlecode/guice/StrictContainerTestSuiteBuilder.java
@@ -102,7 +102,8 @@
           || name.startsWith("javax.")
           || name.startsWith("junit.")
           || name.startsWith("sun.")
-          || name.startsWith("com.sun.")) {
+          || name.startsWith("com.sun.")
+          || name.contains("cglib")) {
         return super.loadClass(name, resolve);
       }
 
