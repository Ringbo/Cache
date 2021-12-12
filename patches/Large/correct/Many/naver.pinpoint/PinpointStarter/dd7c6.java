diff --git a/bootstrap/src/main/java/com/navercorp/pinpoint/bootstrap/PinpointStarter.java b/bootstrap/src/main/java/com/navercorp/pinpoint/bootstrap/PinpointStarter.java
index 056da38..7beb09d 100644
--- a/bootstrap/src/main/java/com/navercorp/pinpoint/bootstrap/PinpointStarter.java
+++ b/bootstrap/src/main/java/com/navercorp/pinpoint/bootstrap/PinpointStarter.java
@@ -127,7 +127,7 @@
             agentClassLoader.setBootClass(bootClass);
             logger.info("pinpoint agent [" + bootClass + "] starting...");
 
-            AgentOption option = createAgentOption(agentArgs, instrumentation, profilerConfig, pluginJars, bootStrapCore, serviceTypeRegistryService, annotationKeyRegistryService, bootStrapCoreJar);
+            AgentOption option = createAgentOption(agentArgs, instrumentation, profilerConfig, pluginJars, bootStrapCore, serviceTypeRegistryService, annotationKeyRegistryService);
             Agent pinpointAgent = agentClassLoader.boot(option);
             pinpointAgent.start();
             registerShutdownHook(pinpointAgent);
@@ -139,9 +139,9 @@
         }
     }
 
-    private AgentOption createAgentOption(String agentArgs, Instrumentation instrumentation, ProfilerConfig profilerConfig, URL[] pluginJars, String bootStrapJarPath, ServiceTypeRegistryService serviceTypeRegistryService, AnnotationKeyRegistryService annotationKeyRegistryService, String bootStrapCoreJar) {
+    private AgentOption createAgentOption(String agentArgs, Instrumentation instrumentation, ProfilerConfig profilerConfig, URL[] pluginJars, String bootStrapJarCorePath, ServiceTypeRegistryService serviceTypeRegistryService, AnnotationKeyRegistryService annotationKeyRegistryService) {
 
-        return new DefaultAgentOption(agentArgs, instrumentation, profilerConfig, pluginJars, bootStrapJarPath, serviceTypeRegistryService, annotationKeyRegistryService);
+        return new DefaultAgentOption(agentArgs, instrumentation, profilerConfig, pluginJars, bootStrapJarCorePath, serviceTypeRegistryService, annotationKeyRegistryService);
     }
 
     // for test
