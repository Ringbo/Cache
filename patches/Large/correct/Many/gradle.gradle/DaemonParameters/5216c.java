diff --git a/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/configuration/DaemonParameters.java b/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/configuration/DaemonParameters.java
index 1e7eadf..e13dad9 100644
--- a/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/configuration/DaemonParameters.java
+++ b/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/configuration/DaemonParameters.java
@@ -107,9 +107,9 @@
             return;
         }
         if (javaVersion.compareTo(JavaVersion.VERSION_1_9) >= 0) {
-            jvmOptions.setAllJvmArgs(DEFAULT_JVM_9_ARGS);
+            jvmOptions.jvmArgs(DEFAULT_JVM_9_ARGS);
         } else {
-            jvmOptions.setAllJvmArgs(DEFAULT_JVM_ARGS);
+            jvmOptions.jvmArgs(DEFAULT_JVM_ARGS);
         }
     }
 
