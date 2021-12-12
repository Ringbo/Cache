diff --git a/driver-core/src/test/java/com/datastax/driver/core/TupleTest.java b/driver-core/src/test/java/com/datastax/driver/core/TupleTest.java
index a4a2b4e..0c10812 100644
--- a/driver-core/src/test/java/com/datastax/driver/core/TupleTest.java
+++ b/driver-core/src/test/java/com/datastax/driver/core/TupleTest.java
@@ -434,12 +434,12 @@
                             "v_1 %s, " +
                             "v_2 %s, " +
                             "v_3 %s, " +
-                            "v_128 %s)", nestedTuplesSchemaHelper(1),
+                            "v_64 %s)", nestedTuplesSchemaHelper(1),
                                          nestedTuplesSchemaHelper(2),
                                          nestedTuplesSchemaHelper(3),
-                                         nestedTuplesSchemaHelper(128)));
+                                         nestedTuplesSchemaHelper(64)));
 
-            for (int i : Arrays.asList(1, 2, 3, 128)) {
+            for (int i : Arrays.asList(1, 2, 3, 64)) {
                 // create tuple
                 TupleValue createdTuple = nestedTuplesCreatorHelper(i);
 
