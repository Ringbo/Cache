diff --git a/testsuite/shared/src/main/java/org/jboss/as/test/integration/domain/management/util/JBossAsManagedConfiguration.java b/testsuite/shared/src/main/java/org/jboss/as/test/integration/domain/management/util/JBossAsManagedConfiguration.java
index 8301489..9f376ae 100644
--- a/testsuite/shared/src/main/java/org/jboss/as/test/integration/domain/management/util/JBossAsManagedConfiguration.java
+++ b/testsuite/shared/src/main/java/org/jboss/as/test/integration/domain/management/util/JBossAsManagedConfiguration.java
@@ -129,7 +129,7 @@
             Validate.configurationDirectoryExists(javaHome, "javaHome must exist at " + javaHome);
         }
         if (controllerJavaHome != null) {
-            Validate.configurationDirectoryExists(javaHome, "controllerJavaHome must exist at " + controllerJavaHome);
+            Validate.configurationDirectoryExists(controllerJavaHome, "controllerJavaHome must exist at " + controllerJavaHome);
         }
     }
 
