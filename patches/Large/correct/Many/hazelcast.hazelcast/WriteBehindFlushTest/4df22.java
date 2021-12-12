diff --git a/hazelcast/src/test/java/com/hazelcast/map/impl/mapstore/writebehind/WriteBehindFlushTest.java b/hazelcast/src/test/java/com/hazelcast/map/impl/mapstore/writebehind/WriteBehindFlushTest.java
index 3e924f4..60ac6c9 100644
--- a/hazelcast/src/test/java/com/hazelcast/map/impl/mapstore/writebehind/WriteBehindFlushTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/map/impl/mapstore/writebehind/WriteBehindFlushTest.java
@@ -72,7 +72,7 @@
                 .mapName(mapName)
                 .withMapStore(mapStore)
                 .withNodeCount(nodeCount)
-                .withBackupCount(2)
+                .withBackupCount(1)
                 .withConfig(getConfig())
                 .withNodeFactory(factory)
                 .withWriteDelaySeconds(300);
