diff --git a/hazelcast/src/main/java/com/hazelcast/map/impl/MapContainer.java b/hazelcast/src/main/java/com/hazelcast/map/impl/MapContainer.java
index 007b047..684eeda 100644
--- a/hazelcast/src/main/java/com/hazelcast/map/impl/MapContainer.java
+++ b/hazelcast/src/main/java/com/hazelcast/map/impl/MapContainer.java
@@ -288,7 +288,7 @@
     }
 
     public boolean shouldCloneOnEntryProcessing() {
-        return getIndexes().hasIndex() & OBJECT.equals(mapConfig.getInMemoryFormat());
+        return getIndexes().hasIndex() && OBJECT.equals(mapConfig.getInMemoryFormat());
     }
 }
 
