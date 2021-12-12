diff --git a/domain-controller/src/main/java/org/jboss/as/domain/controller/operations/coordination/DomainFinalResultHandler.java b/domain-controller/src/main/java/org/jboss/as/domain/controller/operations/coordination/DomainFinalResultHandler.java
index a981fff..a7b1326 100644
--- a/domain-controller/src/main/java/org/jboss/as/domain/controller/operations/coordination/DomainFinalResultHandler.java
+++ b/domain-controller/src/main/java/org/jboss/as/domain/controller/operations/coordination/DomainFinalResultHandler.java
@@ -174,7 +174,7 @@
             final String serverGroup = entry.getKey().getServerGroupName();
             groupNames.add(serverGroup);
             final String hostName = entry.getKey().getHostName();
-            final String serverName = entry.getKey().getHostName();
+            final String serverName = entry.getKey().getServerName();
             if (!groupToServerMap.containsKey(serverGroup)) {
                 groupToServerMap.put(serverGroup, new TreeSet<HostServer>());
             }
