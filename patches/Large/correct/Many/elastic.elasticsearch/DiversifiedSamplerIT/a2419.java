diff --git a/core/src/test/java/org/elasticsearch/search/aggregations/bucket/DiversifiedSamplerIT.java b/core/src/test/java/org/elasticsearch/search/aggregations/bucket/DiversifiedSamplerIT.java
index f7cbfa7..23b0513 100644
--- a/core/src/test/java/org/elasticsearch/search/aggregations/bucket/DiversifiedSamplerIT.java
+++ b/core/src/test/java/org/elasticsearch/search/aggregations/bucket/DiversifiedSamplerIT.java
@@ -215,7 +215,7 @@
                 .execute().actionGet();
         assertSearchResponse(response);
         Sampler sample = response.getAggregations().get("sample");
-        assertThat(sample.getDocCount(), greaterThan(0l));
+        assertThat(sample.getDocCount(), greaterThan(0L));
         Terms authors = sample.getAggregations().get("authors");
         assertThat(authors.getBuckets().size(), greaterThan(0));
     }
@@ -230,7 +230,7 @@
                 .setQuery(new TermQueryBuilder("genre", "fantasy")).setFrom(0).setSize(60).addAggregation(sampleAgg).execute().actionGet();
         assertSearchResponse(response);
         Sampler sample = response.getAggregations().get("sample");
-        assertThat(sample.getDocCount(), equalTo(0l));
+        assertThat(sample.getDocCount(), equalTo(0L));
         Terms authors = sample.getAggregations().get("authors");
         assertNull(authors);
     }
