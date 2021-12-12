diff --git a/portal-impl/src/com/liferay/portlet/expando/service/impl/ExpandoValueLocalServiceImpl.java b/portal-impl/src/com/liferay/portlet/expando/service/impl/ExpandoValueLocalServiceImpl.java
index 9a16234a..73ecd03 100644
--- a/portal-impl/src/com/liferay/portlet/expando/service/impl/ExpandoValueLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/expando/service/impl/ExpandoValueLocalServiceImpl.java
@@ -849,7 +849,9 @@
 				value.setClassPK(classPK);
 			}
 
-			if (value.isNew() || !Validator.equals(value.getData(), data)) {
+			if (value.isNew() ||
+				!Validator.equals(value.getData(), dataString)) {
+
 				value.setData(dataString);
 
 				expandoValuePersistence.update(value, false);
