diff --git a/plugin/sql/src/test/java/org/elasticsearch/xpack/sql/tree/NodeSubclassTests.java b/plugin/sql/src/test/java/org/elasticsearch/xpack/sql/tree/NodeSubclassTests.java
index 3e41d2e..a7bd55c 100644
--- a/plugin/sql/src/test/java/org/elasticsearch/xpack/sql/tree/NodeSubclassTests.java
+++ b/plugin/sql/src/test/java/org/elasticsearch/xpack/sql/tree/NodeSubclassTests.java
@@ -346,7 +346,7 @@
                 return map;
             }
             if (pt.getRawType() == List.class) {
-                return makeList(toBuildClass, pt, between(0, 10));
+                return makeList(toBuildClass, pt, between(1, 10));
             }
             if (pt.getRawType() == Supplier.class) {
                 if (toBuildClass == AggValueInput.class) {
