diff --git a/portal-impl/src/com/liferay/portlet/dynamicdatamapping/util/DDMImpl.java b/portal-impl/src/com/liferay/portlet/dynamicdatamapping/util/DDMImpl.java
index 15bbb03..5401c5a 100644
--- a/portal-impl/src/com/liferay/portlet/dynamicdatamapping/util/DDMImpl.java
+++ b/portal-impl/src/com/liferay/portlet/dynamicdatamapping/util/DDMImpl.java
@@ -379,7 +379,8 @@
 			try {
 				String fileName = uploadRequest.getFileName(fieldNameValue);
 
-				inputStream = uploadRequest.getFileAsStream(fieldName, true);
+				inputStream = uploadRequest.getFileAsStream(
+					fieldNameValue, true);
 
 				if (inputStream != null) {
 					String filePath = storeFieldFile(
