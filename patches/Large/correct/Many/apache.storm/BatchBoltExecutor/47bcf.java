diff --git a/storm-core/src/jvm/backtype/storm/coordination/BatchBoltExecutor.java b/storm-core/src/jvm/backtype/storm/coordination/BatchBoltExecutor.java
index 89ef028..8653010 100644
--- a/storm-core/src/jvm/backtype/storm/coordination/BatchBoltExecutor.java
+++ b/storm-core/src/jvm/backtype/storm/coordination/BatchBoltExecutor.java
@@ -103,6 +103,6 @@
     }
     
     private IBatchBolt newTransactionalBolt() {
-        return Utils.deserialize(_boltSer, IBatchBolt.class);
+        return Utils.javaDeserialize(_boltSer, IBatchBolt.class);
     }
 }
