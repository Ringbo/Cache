diff --git a/portlets/private-messaging-portlet/docroot/WEB-INF/src/com/liferay/privatemessaging/portlet/PrivateMessagingPortlet.java b/portlets/private-messaging-portlet/docroot/WEB-INF/src/com/liferay/privatemessaging/portlet/PrivateMessagingPortlet.java
index 58f2f15..bdea1fc 100644
--- a/portlets/private-messaging-portlet/docroot/WEB-INF/src/com/liferay/privatemessaging/portlet/PrivateMessagingPortlet.java
+++ b/portlets/private-messaging-portlet/docroot/WEB-INF/src/com/liferay/privatemessaging/portlet/PrivateMessagingPortlet.java
@@ -352,7 +352,7 @@
 			PortletPropsValues.AUTOCOMPLETE_RECIPIENT_TYPE, keywords, 0,
 			PortletPropsValues.AUTOCOMPLETE_RECIPIENT_MAX);
 
-		results.put("results", jsonObject);
+		resultsJSONObject.put("results", jsonObject);
 
 		writeJSON(resourceRequest, resourceResponse, resultsJSONObject);
 	}
