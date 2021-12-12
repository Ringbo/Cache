diff --git a/fabric-core/src/main/java/org/fusesource/fabric/service/ChildAgentProvider.java b/fabric-core/src/main/java/org/fusesource/fabric/service/ChildAgentProvider.java
index 93616e1..d4ef98b 100644
--- a/fabric-core/src/main/java/org/fusesource/fabric/service/ChildAgentProvider.java
+++ b/fabric-core/src/main/java/org/fusesource/fabric/service/ChildAgentProvider.java
@@ -24,7 +24,7 @@
 
     @Override
     public void create(final URI agentUri, final String name, final String zooKeeperUrl) {
-        final Agent parent = service.getAgent(agentUri.getPath());
+        final Agent parent = service.getAgent(agentUri.getSchemeSpecificPart());
         service.getAgentTemplate(parent).execute(new AgentTemplate.AdminServiceCallback<Object>() {
             public Object doWithAdminService(AdminServiceMBean adminService) throws Exception {
                 String javaOpts = zooKeeperUrl != null ? "-Dzookeeper.url=\"" + zooKeeperUrl + "\" -Xmx512M -server" : "";
