diff --git a/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/types/system/SystemTypeManager.java b/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/types/system/SystemTypeManager.java
index f1a7dce..1aa3818 100644
--- a/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/types/system/SystemTypeManager.java
+++ b/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/types/system/SystemTypeManager.java
@@ -38,7 +38,7 @@
 
 
             ADDITIONAL_RESERVED_NAMES = ImmutableSet.of(
-                "key", "vertex", "edge", "element", "property" /* TODO #730, "label" */);
+                "key", "vertex", "edge", "element", "property", "label");
         }
         assert SYSTEM_TYPES_BY_ID.size()==17;
         assert SYSTEM_TYPES_BY_NAME.size()==17;
