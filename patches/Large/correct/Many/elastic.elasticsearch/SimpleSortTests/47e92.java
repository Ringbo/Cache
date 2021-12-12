diff --git a/modules/lang-groovy/src/test/java/org/elasticsearch/messy/tests/SimpleSortTests.java b/modules/lang-groovy/src/test/java/org/elasticsearch/messy/tests/SimpleSortTests.java
index a5c5f8a..db8a13c 100644
--- a/modules/lang-groovy/src/test/java/org/elasticsearch/messy/tests/SimpleSortTests.java
+++ b/modules/lang-groovy/src/test/java/org/elasticsearch/messy/tests/SimpleSortTests.java
@@ -469,7 +469,7 @@
     }
 
     public void testSimpleSorts() throws Exception {
-        Random random = getRandom();
+        Random random = random();
         assertAcked(prepareCreate("test")
                 .addMapping("type1", XContentFactory.jsonBuilder().startObject().startObject("type1").startObject("properties")
                         .startObject("str_value").field("type", "string").field("index", "not_analyzed").startObject("fielddata").field("format", random().nextBoolean() ? "doc_values" : null).endObject().endObject()
@@ -496,7 +496,7 @@
                     .endObject());
             builders.add(builder);
         }
-        Randomness.shuffle(builders);
+        Collections.shuffle(builders, random);
         for (IndexRequestBuilder builder : builders) {
             builder.execute().actionGet();
             if (random.nextBoolean()) {
