diff --git a/core/src/test/java/org/elasticsearch/index/mapper/all/SimpleAllMapperTests.java b/core/src/test/java/org/elasticsearch/index/mapper/all/SimpleAllMapperTests.java
index 762a62f..501c538 100644
--- a/core/src/test/java/org/elasticsearch/index/mapper/all/SimpleAllMapperTests.java
+++ b/core/src/test/java/org/elasticsearch/index/mapper/all/SimpleAllMapperTests.java
@@ -223,7 +223,7 @@
     }
 
     public void testRandom() throws Exception {
-        boolean norms = false;
+        boolean norms = true;
         boolean stored = false;
         boolean enabled = true;
         boolean tv_stored = false;
