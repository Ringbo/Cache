diff --git a/portlets/ddl-form-portlet/docroot/WEB-INF/src/com/liferay/ddlform/portlet/DDLFormPortlet.java b/portlets/ddl-form-portlet/docroot/WEB-INF/src/com/liferay/ddlform/portlet/DDLFormPortlet.java
index ce3b822..c71bd1b 100644
--- a/portlets/ddl-form-portlet/docroot/WEB-INF/src/com/liferay/ddlform/portlet/DDLFormPortlet.java
+++ b/portlets/ddl-form-portlet/docroot/WEB-INF/src/com/liferay/ddlform/portlet/DDLFormPortlet.java
@@ -67,7 +67,7 @@
 			DDLRecord.class.getName(), actionRequest);
 
 		DDLRecordServiceUtil.addRecord(
-			themeDisplay.getScopeGroupId(), recordSetId, fields, 0,
+			themeDisplay.getScopeGroupId(), recordSetId, 0, fields, 
 			serviceContext);
 	}
 
