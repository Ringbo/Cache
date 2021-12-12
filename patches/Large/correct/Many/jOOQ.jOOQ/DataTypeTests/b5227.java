diff --git a/jOOQ-test/src/org/jooq/test/_/testcases/DataTypeTests.java b/jOOQ-test/src/org/jooq/test/_/testcases/DataTypeTests.java
index 42679d7..7fa2249 100644
--- a/jOOQ-test/src/org/jooq/test/_/testcases/DataTypeTests.java
+++ b/jOOQ-test/src/org/jooq/test/_/testcases/DataTypeTests.java
@@ -1587,7 +1587,7 @@
 
     @Test
     public void testUUIDArrayDataType() throws Exception {
-        if (TArrays() == null) {
+        if (TArrays_STRING() == null) {
             log.info("SKIPPING", "Skipping UUID ARRAY data type tests");
             return;
         }
