diff --git a/modules/apps/analytics/analytics-client-impl/src/main/java/com/liferay/analytics/client/impl/AnalyticsClientImpl.java b/modules/apps/analytics/analytics-client-impl/src/main/java/com/liferay/analytics/client/impl/AnalyticsClientImpl.java
index a0da792..4ae4b0a 100644
--- a/modules/apps/analytics/analytics-client-impl/src/main/java/com/liferay/analytics/client/impl/AnalyticsClientImpl.java
+++ b/modules/apps/analytics/analytics-client-impl/src/main/java/com/liferay/analytics/client/impl/AnalyticsClientImpl.java
@@ -46,7 +46,7 @@
 
 		_jsonWebServiceClient.setHostName(_ANALYTICS_GATEWAY_HOST);
 		_jsonWebServiceClient.setHostPort(
-			Integer.valueOf(_ANALYTICS_GATEWAY_PORT));
+			Integer.parseInt(_ANALYTICS_GATEWAY_PORT));
 		_jsonWebServiceClient.setProtocol(_ANALYTICS_GATEWAY_PROTOCOL);
 
 		return _jsonWebServiceClient.doPostAsJSON(
