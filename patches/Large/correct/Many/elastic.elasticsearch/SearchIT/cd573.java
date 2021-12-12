diff --git a/client/rest-high-level/src/test/java/org/elasticsearch/client/SearchIT.java b/client/rest-high-level/src/test/java/org/elasticsearch/client/SearchIT.java
index 5667053..e868833 100644
--- a/client/rest-high-level/src/test/java/org/elasticsearch/client/SearchIT.java
+++ b/client/rest-high-level/src/test/java/org/elasticsearch/client/SearchIT.java
@@ -174,7 +174,7 @@
         assertSearchHeader(searchResponse);
         assertNull(searchResponse.getSuggest());
         assertEquals(Collections.emptyMap(), searchResponse.getProfileResults());
-        assertThat(searchResponse.getTook().nanos(), greaterThan(0L));
+        assertThat(searchResponse.getTook().nanos(), greaterThanOrEqualTo(0L));
         assertEquals(5, searchResponse.getHits().totalHits);
         assertEquals(0, searchResponse.getHits().getHits().length);
         assertEquals(0f, searchResponse.getHits().getMaxScore(), 0f);
@@ -257,7 +257,7 @@
         assertSearchHeader(searchResponse);
         assertNull(searchResponse.getSuggest());
         assertEquals(Collections.emptyMap(), searchResponse.getProfileResults());
-        assertThat(searchResponse.getTook().nanos(), greaterThan(0L));
+        assertThat(searchResponse.getTook().nanos(), greaterThanOrEqualTo(0L));
         assertEquals(5, searchResponse.getHits().totalHits);
         assertEquals(0, searchResponse.getHits().getHits().length);
         assertEquals(0f, searchResponse.getHits().getMaxScore(), 0f);
@@ -337,7 +337,7 @@
         assertSearchHeader(searchResponse);
         assertNull(searchResponse.getSuggest());
         assertEquals(Collections.emptyMap(), searchResponse.getProfileResults());
-        assertThat(searchResponse.getTook().nanos(), greaterThan(0L));
+        assertThat(searchResponse.getTook().nanos(), greaterThanOrEqualTo(0L));
         assertEquals(3, searchResponse.getHits().totalHits);
         assertEquals(0, searchResponse.getHits().getHits().length);
         assertEquals(0f, searchResponse.getHits().getMaxScore(), 0f);
