diff --git a/portlets/so-portlet/docroot/WEB-INF/src/com/liferay/so/service/impl/ProjectsEntryLocalServiceImpl.java b/portlets/so-portlet/docroot/WEB-INF/src/com/liferay/so/service/impl/ProjectsEntryLocalServiceImpl.java
index bfd14ee..681ba9f 100644
--- a/portlets/so-portlet/docroot/WEB-INF/src/com/liferay/so/service/impl/ProjectsEntryLocalServiceImpl.java
+++ b/portlets/so-portlet/docroot/WEB-INF/src/com/liferay/so/service/impl/ProjectsEntryLocalServiceImpl.java
@@ -79,7 +79,7 @@
 		projectsEntry.setEndDate(endDate);
 		projectsEntry.setData(data);
 
-		projectsEntryPersistence.update(projectsEntry);
+		projectsEntryPersistence.update(projectsEntry, false);
 
 		return projectsEntry;
 	}
@@ -125,7 +125,7 @@
 		projectsEntry.setEndDate(endDate);
 		projectsEntry.setData(data);
 
-		projectsEntryPersistence.update(projectsEntry);
+		projectsEntryPersistence.update(projectsEntry, false);
 
 		return projectsEntry;
 	}
