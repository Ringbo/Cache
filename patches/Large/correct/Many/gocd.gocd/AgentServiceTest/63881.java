diff --git a/server/test/unit/com/thoughtworks/go/server/service/AgentServiceTest.java b/server/test/unit/com/thoughtworks/go/server/service/AgentServiceTest.java
index d431c09..cc626f4 100644
--- a/server/test/unit/com/thoughtworks/go/server/service/AgentServiceTest.java
+++ b/server/test/unit/com/thoughtworks/go/server/service/AgentServiceTest.java
@@ -174,7 +174,7 @@
 
         doThrow(new RuntimeException()).when(agentConfigService).deleteAgents(username, agentInstance);
 
-        when(agentInstances.findAgent(uuid)).thenReturn(agentInstance);
+        when(agentInstances.findAgentAndRefreshStatus(uuid)).thenReturn(agentInstance);
 
         AgentService agentService = new AgentService(agentConfigService, new SystemEnvironment(), agentInstances, mock(EnvironmentConfigService.class),
                 mock(GoConfigService.class), securityService, agentDao, uuidGenerator, serverHealthService = mock(ServerHealthService.class));
