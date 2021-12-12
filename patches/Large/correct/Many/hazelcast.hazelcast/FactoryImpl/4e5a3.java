diff --git a/hazelcast/src/main/java/com/hazelcast/impl/FactoryImpl.java b/hazelcast/src/main/java/com/hazelcast/impl/FactoryImpl.java
index 499ac7a..02b9726 100644
--- a/hazelcast/src/main/java/com/hazelcast/impl/FactoryImpl.java
+++ b/hazelcast/src/main/java/com/hazelcast/impl/FactoryImpl.java
@@ -592,7 +592,7 @@
                         if (mapStoreConfig != null && mapStoreConfig.isEnabled()) {
                             cmap.setInitState(InitializationState.INITIALIZING);
                             try {
-                                ExecutorService es = getExecutorService();
+                                ExecutorService es = getExecutorService("hz.initialization");
                                 final Set<Member> members = new HashSet<Member>(getCluster().getMembers());
                                 members.remove(node.localMember);
                                 final MultiTask task = new MultiTask(new InitializeMap(mProxy.getName()), members);
