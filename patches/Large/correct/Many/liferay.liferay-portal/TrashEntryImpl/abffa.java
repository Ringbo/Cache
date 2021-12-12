diff --git a/portal-impl/src/com/liferay/portlet/trash/model/impl/TrashEntryImpl.java b/portal-impl/src/com/liferay/portlet/trash/model/impl/TrashEntryImpl.java
index d92acf5..2cf9e25 100644
--- a/portal-impl/src/com/liferay/portlet/trash/model/impl/TrashEntryImpl.java
+++ b/portal-impl/src/com/liferay/portlet/trash/model/impl/TrashEntryImpl.java
@@ -33,7 +33,7 @@
 			return super.getTypeSettings();
 		}
 		else {
-			return _typeSettingsProperties.toString();
+			return _typeSettingsProperties.toSortedString();
 		}
 	}
 
@@ -98,7 +98,7 @@
 
 		_typeSettingsProperties = typeSettingsProperties;
 
-		super.setTypeSettings(_typeSettingsProperties.toString());
+		super.setTypeSettings(_typeSettingsProperties.toSortedString());
 	}
 
 	private TrashEntry _rootEntry;
