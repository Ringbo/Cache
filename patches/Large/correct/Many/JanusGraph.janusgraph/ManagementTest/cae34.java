diff --git a/titan-test/src/main/java/com/thinkaurelius/titan/graphdb/database/management/ManagementTest.java b/titan-test/src/main/java/com/thinkaurelius/titan/graphdb/database/management/ManagementTest.java
index 2a80c2a..177ae75 100644
--- a/titan-test/src/main/java/com/thinkaurelius/titan/graphdb/database/management/ManagementTest.java
+++ b/titan-test/src/main/java/com/thinkaurelius/titan/graphdb/database/management/ManagementTest.java
@@ -19,7 +19,7 @@
     private static final Set<String> ILLEGAL_USER_DEFINED_NAMES = ImmutableSet.of(
             "~key", "~value", "~id", "~nid", "~label", "~adjacent",
             "~timestamp", "~ttl", "~visibility",
-            "key", "vertex", "edge", "element", "property", /* TODO #730 "label", */
+            "key", "vertex", "edge", "element", "property", "label",
             "~T$VertexExists",
             "~T$SchemaName",
             "~T$SchemaDefinitionProperty",
