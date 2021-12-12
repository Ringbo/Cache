diff --git a/activiti-spring-boot-starter/src/test/java/org/activiti/spring/boot/process/ProcessRuntimeTest.java b/activiti-spring-boot-starter/src/test/java/org/activiti/spring/boot/process/ProcessRuntimeTest.java
index 071eb83..841509e 100644
--- a/activiti-spring-boot-starter/src/test/java/org/activiti/spring/boot/process/ProcessRuntimeTest.java
+++ b/activiti-spring-boot-starter/src/test/java/org/activiti/spring/boot/process/ProcessRuntimeTest.java
@@ -59,25 +59,25 @@
     private SecurityUtil securityUtil;
 
     @Autowired
-    RepositoryService repositoryService;
+    private RepositoryService repositoryService;
 
     @Autowired
-    APIProcessDefinitionConverter processDefinitionConverter;
+    private APIProcessDefinitionConverter processDefinitionConverter;
 
     @Autowired
-    RuntimeService runtimeService;
+    private RuntimeService runtimeService;
 
     @Autowired
-    ProcessSecurityPoliciesManager securityPoliciesManager;
+    private ProcessSecurityPoliciesManager securityPoliciesManager;
 
     @Autowired
-    APIProcessInstanceConverter processInstanceConverter;
+    private APIProcessInstanceConverter processInstanceConverter;
 
     @Autowired
-    APIVariableInstanceConverter variableInstanceConverter;
+    private APIVariableInstanceConverter variableInstanceConverter;
 
     @Autowired
-    ProcessRuntimeConfiguration configuration;
+    private ProcessRuntimeConfiguration configuration;
     
     @Mock
     private ApplicationEventPublisher eventPublisher;
