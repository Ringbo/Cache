diff --git a/hazelcast/src/main/java/com/hazelcast/monitor/impl/MemberStateImpl.java b/hazelcast/src/main/java/com/hazelcast/monitor/impl/MemberStateImpl.java
index c6f60f1..7a01ce8 100644
--- a/hazelcast/src/main/java/com/hazelcast/monitor/impl/MemberStateImpl.java
+++ b/hazelcast/src/main/java/com/hazelcast/monitor/impl/MemberStateImpl.java
@@ -334,7 +334,7 @@
             nodeState.fromJson(jsonNodeState);
         }
         JsonObject jsonHotRestartState = getObject(json, "hotRestartState", null);
-        if (hotRestartState != null) {
+        if (jsonHotRestartState != null) {
             hotRestartState = new HotRestartStateImpl();
             hotRestartState.fromJson(jsonHotRestartState);
         }
