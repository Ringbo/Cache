diff --git a/portal-impl/src/com/liferay/portlet/expando/model/impl/ExpandoColumnImpl.java b/portal-impl/src/com/liferay/portlet/expando/model/impl/ExpandoColumnImpl.java
index b4152bb..06769e4 100644
--- a/portal-impl/src/com/liferay/portlet/expando/model/impl/ExpandoColumnImpl.java
+++ b/portal-impl/src/com/liferay/portlet/expando/model/impl/ExpandoColumnImpl.java
@@ -131,7 +131,7 @@
 			return super.getTypeSettings();
 		}
 		else {
-			return _typeSettingsProperties.toString();
+			return _typeSettingsProperties.toSortedString();
 		}
 	}
 
@@ -164,7 +164,7 @@
 
 		_typeSettingsProperties = typeSettingsProperties;
 
-		super.setTypeSettings(_typeSettingsProperties.toString());
+		super.setTypeSettings(_typeSettingsProperties.toSortedString());
 	}
 
 	private static Log _log = LogFactoryUtil.getLog(ExpandoColumnImpl.class);
