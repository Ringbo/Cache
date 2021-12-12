diff --git a/server/sonar-server/src/main/java/org/sonar/server/search/IndexQueue.java b/server/sonar-server/src/main/java/org/sonar/server/search/IndexQueue.java
index 831772c..de7636d 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/search/IndexQueue.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/search/IndexQueue.java
@@ -90,7 +90,7 @@
 
       long refreshTime = this.refreshRequiredIndex(indices);
 
-      LOGGER.info("-- submitted {} items with {}ms in normalization, {}ms indexing and {}ms refresh({}). Total: {}ms",
+      LOGGER.debug("-- submitted {} items with {}ms in normalization, {}ms indexing and {}ms refresh({}). Total: {}ms",
         bulkRequestBuilder.numberOfActions(), normTime, indexTime, refreshTime, indices, (normTime + indexTime + refreshTime));
 
       if (response.hasFailures()) {
