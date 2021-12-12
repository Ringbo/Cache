diff --git a/core/src/test/java/org/elasticsearch/index/mapper/NumberFieldMapperTests.java b/core/src/test/java/org/elasticsearch/index/mapper/NumberFieldMapperTests.java
index 875cec3..5de43f5 100644
--- a/core/src/test/java/org/elasticsearch/index/mapper/NumberFieldMapperTests.java
+++ b/core/src/test/java/org/elasticsearch/index/mapper/NumberFieldMapperTests.java
@@ -128,7 +128,7 @@
 
     public void testNoDocValues() throws Exception {
         for (String type : TYPES) {
-            doTestNotIndexed(type);
+            doTestNoDocValues(type);
         }
     }
 
