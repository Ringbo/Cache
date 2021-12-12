diff --git a/portal-impl/src/com/liferay/portlet/trash/model/impl/TrashEntryImpl.java b/portal-impl/src/com/liferay/portlet/trash/model/impl/TrashEntryImpl.java
index 2cf9e25..d92acf5 100644
--- a/portal-impl/src/com/liferay/portlet/trash/model/impl/TrashEntryImpl.java
+++ b/portal-impl/src/com/liferay/portlet/trash/model/impl/TrashEntryImpl.java
@@ -33,7 +33,7 @@
 			return super.getTypeSettings();
 		}
 		else {
-			return _typeSettingsProperties.toSortedString();
+			return _typeSettingsProperties.toString();
 		}
 	}
 
@@ -98,7 +98,7 @@
 
 		_typeSettingsProperties = typeSettingsProperties;
 
-		super.setTypeSettings(_typeSettingsProperties.toSortedString());
+		super.setTypeSettings(_typeSettingsProperties.toString());
 	}
 
 	private TrashEntry _rootEntry;
