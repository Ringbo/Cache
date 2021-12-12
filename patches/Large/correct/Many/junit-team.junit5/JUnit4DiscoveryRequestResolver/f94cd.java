diff --git a/junit4-engine/src/main/java/org/junit/gen5/engine/junit4/discovery/JUnit4DiscoveryRequestResolver.java b/junit4-engine/src/main/java/org/junit/gen5/engine/junit4/discovery/JUnit4DiscoveryRequestResolver.java
index 447bcb8..e03ffc1 100644
--- a/junit4-engine/src/main/java/org/junit/gen5/engine/junit4/discovery/JUnit4DiscoveryRequestResolver.java
+++ b/junit4-engine/src/main/java/org/junit/gen5/engine/junit4/discovery/JUnit4DiscoveryRequestResolver.java
@@ -73,7 +73,7 @@
 		List<ClassFilter> allClassFilters = discoveryRequest.getDiscoveryFiltersByType(ClassFilter.class);
 		Filter<Class<?>> classFilter = new ExclusionReasonConsumingFilter<>(combine(allClassFilters),
 			(testClass, reason) -> {
-				logger.warning(String.format("Class %s was excluded by a class filter: %s", testClass.getName(),
+				logger.info(String.format("Class %s was excluded by a class filter: %s", testClass.getName(),
 					reason.orElse("<unknown reason>")));
 			});
 		return collector.toRequests(classFilter.toPredicate());
