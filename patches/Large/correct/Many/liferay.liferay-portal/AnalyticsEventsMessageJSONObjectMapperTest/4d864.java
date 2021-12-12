diff --git a/modules/apps/analytics/analytics-data-binding-impl/src/test/java/com/liferay/analytics/data/binding/internal/AnalyticsEventsMessageJSONObjectMapperTest.java b/modules/apps/analytics/analytics-data-binding-impl/src/test/java/com/liferay/analytics/data/binding/internal/AnalyticsEventsMessageJSONObjectMapperTest.java
index a2be6c2..089425e 100644
--- a/modules/apps/analytics/analytics-data-binding-impl/src/test/java/com/liferay/analytics/data/binding/internal/AnalyticsEventsMessageJSONObjectMapperTest.java
+++ b/modules/apps/analytics/analytics-data-binding-impl/src/test/java/com/liferay/analytics/data/binding/internal/AnalyticsEventsMessageJSONObjectMapperTest.java
@@ -115,7 +115,7 @@
 
 		byte[] bytes = Files.readAllBytes(Paths.get(url.toURI()));
 
-		return new String(bytes);
+		return new String(bytes, "UTF-8");
 	}
 
 	private final JSONObjectMapper<AnalyticsEventsMessage> _jsonObjectMapper =
