diff --git a/portal-impl/src/com/liferay/portlet/dynamicdatamapping/util/DDMXSDImpl.java b/portal-impl/src/com/liferay/portlet/dynamicdatamapping/util/DDMXSDImpl.java
index 148d5f8..fbec52b 100644
--- a/portal-impl/src/com/liferay/portlet/dynamicdatamapping/util/DDMXSDImpl.java
+++ b/portal-impl/src/com/liferay/portlet/dynamicdatamapping/util/DDMXSDImpl.java
@@ -347,7 +347,7 @@
 		JSONArray jsonArray = null;
 
 		if (Validator.isNull(xsd)) {
-			jsonArray = getJSONArray(structure.getDocument());
+			jsonArray = getJSONArray(structure.getXsd());
 		}
 		else {
 			jsonArray = getJSONArray(xsd);
