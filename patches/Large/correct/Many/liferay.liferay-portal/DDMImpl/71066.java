diff --git a/portal-impl/src/com/liferay/portlet/dynamicdatamapping/util/DDMImpl.java b/portal-impl/src/com/liferay/portlet/dynamicdatamapping/util/DDMImpl.java
index adeccc3..5700039 100644
--- a/portal-impl/src/com/liferay/portlet/dynamicdatamapping/util/DDMImpl.java
+++ b/portal-impl/src/com/liferay/portlet/dynamicdatamapping/util/DDMImpl.java
@@ -117,7 +117,7 @@
 				ddmStructure, repeatabaleFieldsMapJSONObject, fieldName,
 				fieldNamespace, serviceContext);
 
-			if (fieldValues.isEmpty()) {
+			if ((fieldValues == null) || fieldValues.isEmpty()) {
 				continue;
 			}
 
