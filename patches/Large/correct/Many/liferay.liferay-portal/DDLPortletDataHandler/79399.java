diff --git a/portal-impl/src/com/liferay/portlet/dynamicdatalists/lar/DDLPortletDataHandler.java b/portal-impl/src/com/liferay/portlet/dynamicdatalists/lar/DDLPortletDataHandler.java
index 9a0570d..9f48a36 100644
--- a/portal-impl/src/com/liferay/portlet/dynamicdatalists/lar/DDLPortletDataHandler.java
+++ b/portal-impl/src/com/liferay/portlet/dynamicdatalists/lar/DDLPortletDataHandler.java
@@ -152,7 +152,7 @@
 			}
 		}
 
-		if (!portletDataContext.getBooleanParameter(NAMESPACE, "record-sets")) {
+		if (portletDataContext.getBooleanParameter(NAMESPACE, "record-sets")) {
 			Element recordSetsElement =
 				portletDataContext.getImportDataGroupElement(
 					DDLRecordSet.class);
