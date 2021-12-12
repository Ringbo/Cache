diff --git a/spring-cloud-netflix-core/src/test/java/org/springframework/cloud/netflix/resttemplate/RestTemplateRetryTests.java b/spring-cloud-netflix-core/src/test/java/org/springframework/cloud/netflix/resttemplate/RestTemplateRetryTests.java
index 47d8e8c..9ce98d6 100644
--- a/spring-cloud-netflix-core/src/test/java/org/springframework/cloud/netflix/resttemplate/RestTemplateRetryTests.java
+++ b/spring-cloud-netflix-core/src/test/java/org/springframework/cloud/netflix/resttemplate/RestTemplateRetryTests.java
@@ -95,7 +95,7 @@
 
 		assertTrue(badServer1Stats.isCircuitBreakerTripped());
 		assertTrue(badServer2Stats.isCircuitBreakerTripped());
-		assertThat(targetConnectionCount).isGreaterThanOrEqualTo(goodServerStats.getTotalRequestsCount());
+		assertThat(targetConnectionCount).isLessThanOrEqualTo(goodServerStats.getTotalRequestsCount());
 
 		// Wait for any timeout thread to finish.
 
@@ -141,7 +141,7 @@
 
 		assertTrue(badServer1Stats.isCircuitBreakerTripped());
 		assertTrue(badServer2Stats.isCircuitBreakerTripped());
-		assertThat(targetConnectionCount).isGreaterThanOrEqualTo(goodServerStats.getTotalRequestsCount());
+		assertThat(targetConnectionCount).isLessThanOrEqualTo(goodServerStats.getTotalRequestsCount());
 		assertEquals(numCalls, hits);
 		logger.debug("Retry Hits: " + hits);
 	}
