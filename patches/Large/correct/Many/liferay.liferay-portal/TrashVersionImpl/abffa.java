diff --git a/portal-impl/src/com/liferay/portlet/trash/model/impl/TrashVersionImpl.java b/portal-impl/src/com/liferay/portlet/trash/model/impl/TrashVersionImpl.java
index 8f5fd92..a1ebae8 100644
--- a/portal-impl/src/com/liferay/portlet/trash/model/impl/TrashVersionImpl.java
+++ b/portal-impl/src/com/liferay/portlet/trash/model/impl/TrashVersionImpl.java
@@ -30,7 +30,7 @@
 			return super.getTypeSettings();
 		}
 		else {
-			return _typeSettingsProperties.toString();
+			return _typeSettingsProperties.toSortedString();
 		}
 	}
 
@@ -72,7 +72,7 @@
 
 		_typeSettingsProperties = typeSettingsProperties;
 
-		super.setTypeSettings(_typeSettingsProperties.toString());
+		super.setTypeSettings(_typeSettingsProperties.toSortedString());
 	}
 
 	private UnicodeProperties _typeSettingsProperties;
