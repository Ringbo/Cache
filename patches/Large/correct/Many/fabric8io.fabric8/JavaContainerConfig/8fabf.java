diff --git a/fabric/fabric-process-container/src/main/java/io/fabric8/container/process/JavaContainerConfig.java b/fabric/fabric-process-container/src/main/java/io/fabric8/container/process/JavaContainerConfig.java
index 3202f8f..928dece 100644
--- a/fabric/fabric-process-container/src/main/java/io/fabric8/container/process/JavaContainerConfig.java
+++ b/fabric/fabric-process-container/src/main/java/io/fabric8/container/process/JavaContainerConfig.java
@@ -59,7 +59,7 @@
         if (Strings.isNotBlank(javaAgent)) {
             environmentVariables.put(FABRIC8_JAVA_AGENT, javaAgent);
         }
-        if (Strings.isNotBlank(javaAgent)) {
+        if (Strings.isNotBlank(jvmArguments)) {
             environmentVariables.put(FABRIC8_JVM_ARGS, jvmArguments);
         }
     }
