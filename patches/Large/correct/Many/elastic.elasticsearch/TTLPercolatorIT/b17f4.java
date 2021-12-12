diff --git a/core/src/test/java/org/elasticsearch/percolator/TTLPercolatorIT.java b/core/src/test/java/org/elasticsearch/percolator/TTLPercolatorIT.java
index 52f8ecb..f85b12d 100644
--- a/core/src/test/java/org/elasticsearch/percolator/TTLPercolatorIT.java
+++ b/core/src/test/java/org/elasticsearch/percolator/TTLPercolatorIT.java
@@ -184,7 +184,7 @@
                         .endObject()
                 ).setTTL(randomIntBetween(1, 500)).setRefresh(true).execute().actionGet();
             } catch (MapperParsingException e) {
-                logger.info("failed indexing {}", i, e);
+                logger.info("failed indexing {}", e, i);
                 // if we are unlucky the TTL is so small that we see the expiry date is already in the past when
                 // we parse the doc ignore those...
                 assertThat(e.getCause(), Matchers.instanceOf(AlreadyExpiredException.class));
