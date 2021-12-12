diff --git a/web/src/main/java/com/navercorp/pinpoint/web/service/AgentServiceImpl.java b/web/src/main/java/com/navercorp/pinpoint/web/service/AgentServiceImpl.java
index ed53bd5..43a895d 100644
--- a/web/src/main/java/com/navercorp/pinpoint/web/service/AgentServiceImpl.java
+++ b/web/src/main/java/com/navercorp/pinpoint/web/service/AgentServiceImpl.java
@@ -131,7 +131,7 @@
 
     @Override
     public PinpointRouteResponse invoke(AgentInfo agentInfo, byte[] payload) throws TException {
-        return invoke(agentInfo, payload, DEFUALT_FUTURE_TIMEOUT);
+        return invoke(agentInfo, payload, DEFAULT_FUTURE_TIMEOUT);
     }
 
     @Override
@@ -161,7 +161,7 @@
     @Override
     public Map<AgentInfo, PinpointRouteResponse> invoke(List<AgentInfo> agentInfoList, byte[] payload)
             throws TException {
-        return invoke(agentInfoList, payload, DEFUALT_FUTURE_TIMEOUT);
+        return invoke(agentInfoList, payload, DEFAULT_FUTURE_TIMEOUT);
     }
 
     @Override
