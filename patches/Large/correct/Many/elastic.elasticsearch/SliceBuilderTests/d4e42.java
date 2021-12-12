diff --git a/core/src/test/java/org/elasticsearch/search/slice/SliceBuilderTests.java b/core/src/test/java/org/elasticsearch/search/slice/SliceBuilderTests.java
index 576838f..70e3ccf 100644
--- a/core/src/test/java/org/elasticsearch/search/slice/SliceBuilderTests.java
+++ b/core/src/test/java/org/elasticsearch/search/slice/SliceBuilderTests.java
@@ -86,7 +86,7 @@
 
     private static SliceBuilder randomSliceBuilder() throws IOException {
         int max = randomIntBetween(2, MAX_SLICE);
-        int id = randomInt(max - 1);
+        int id = randomIntBetween(1, max - 1);
         String field = randomAsciiOfLengthBetween(5, 20);
         return new SliceBuilder(field, id, max);
     }
@@ -98,7 +98,7 @@
     private static SliceBuilder mutate(SliceBuilder original) throws IOException {
         switch (randomIntBetween(0, 2)) {
             case 0: return new SliceBuilder(original.getField() + "_xyz", original.getId(), original.getMax());
-            case 1: return new SliceBuilder(original.getField(), original.getId() + 1, original.getMax());
+            case 1: return new SliceBuilder(original.getField(), original.getId() - 1, original.getMax());
             case 2:
             default: return new SliceBuilder(original.getField(), original.getId(), original.getMax() + 1);
         }
