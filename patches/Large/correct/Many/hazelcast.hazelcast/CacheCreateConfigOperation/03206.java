diff --git a/hazelcast/src/main/java/com/hazelcast/cache/impl/operation/CacheCreateConfigOperation.java b/hazelcast/src/main/java/com/hazelcast/cache/impl/operation/CacheCreateConfigOperation.java
index 626cc70..37a4ac2 100644
--- a/hazelcast/src/main/java/com/hazelcast/cache/impl/operation/CacheCreateConfigOperation.java
+++ b/hazelcast/src/main/java/com/hazelcast/cache/impl/operation/CacheCreateConfigOperation.java
@@ -73,7 +73,7 @@
         AbstractCacheService service = getService();
         response = service.createCacheConfigIfAbsent(config);
 
-        if (createAlsoOnOthers && response == null) {
+        if (createAlsoOnOthers) {
             NodeEngine nodeEngine = getNodeEngine();
             Collection<MemberImpl> members = nodeEngine.getClusterService().getMemberList();
             int remoteNodeCount = members.size() - 1;
@@ -85,7 +85,7 @@
                 OperationService operationService = nodeEngine.getOperationService();
                 for (MemberImpl member : members) {
                     if (!member.localMember()) {
-                        CacheCreateConfigOperation op = new CacheCreateConfigOperation(config, true);
+                        CacheCreateConfigOperation op = new CacheCreateConfigOperation(config, false);
                         operationService
                                 .createInvocationBuilder(AbstractCacheService.SERVICE_NAME, op, member.getAddress())
                                 .setCallback(callback)
