diff --git a/activiti-spring-boot-starter/src/test/java/org/activiti/spring/boot/process/ProcessRuntimeTest.java b/activiti-spring-boot-starter/src/test/java/org/activiti/spring/boot/process/ProcessRuntimeTest.java
index 698d7b5..f65524c 100644
--- a/activiti-spring-boot-starter/src/test/java/org/activiti/spring/boot/process/ProcessRuntimeTest.java
+++ b/activiti-spring-boot-starter/src/test/java/org/activiti/spring/boot/process/ProcessRuntimeTest.java
@@ -91,8 +91,7 @@
                                                      processInstanceConverter,
                                                      variableInstanceConverter,
                                                      configuration,
-                                                     eventPublisher,
-                                                     null));
+                                                     eventPublisher));
 
         processAdminRuntimeMock = spy(new ProcessAdminRuntimeImpl(repositoryService,
                                                               processDefinitionConverter,
