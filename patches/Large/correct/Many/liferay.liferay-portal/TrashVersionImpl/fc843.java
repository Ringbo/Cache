diff --git a/portal-impl/src/com/liferay/portlet/trash/model/impl/TrashVersionImpl.java b/portal-impl/src/com/liferay/portlet/trash/model/impl/TrashVersionImpl.java
index a1ebae8..8f5fd92 100644
--- a/portal-impl/src/com/liferay/portlet/trash/model/impl/TrashVersionImpl.java
+++ b/portal-impl/src/com/liferay/portlet/trash/model/impl/TrashVersionImpl.java
@@ -30,7 +30,7 @@
 			return super.getTypeSettings();
 		}
 		else {
-			return _typeSettingsProperties.toSortedString();
+			return _typeSettingsProperties.toString();
 		}
 	}
 
@@ -72,7 +72,7 @@
 
 		_typeSettingsProperties = typeSettingsProperties;
 
-		super.setTypeSettings(_typeSettingsProperties.toSortedString());
+		super.setTypeSettings(_typeSettingsProperties.toString());
 	}
 
 	private UnicodeProperties _typeSettingsProperties;
