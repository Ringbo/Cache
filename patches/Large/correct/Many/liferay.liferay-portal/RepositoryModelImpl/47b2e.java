diff --git a/portal-impl/src/com/liferay/portal/model/impl/RepositoryModelImpl.java b/portal-impl/src/com/liferay/portal/model/impl/RepositoryModelImpl.java
index 2790b283..52e31b3 100644
--- a/portal-impl/src/com/liferay/portal/model/impl/RepositoryModelImpl.java
+++ b/portal-impl/src/com/liferay/portal/model/impl/RepositoryModelImpl.java
@@ -294,15 +294,15 @@
 
 		repositoryImpl.setModifiedDate(getModifiedDate());
 
-		clone.setClassNameId(getClassNameId());
+		repositoryImpl.setClassNameId(getClassNameId());
 
-		clone.setName(getName());
+		repositoryImpl.setName(getName());
 
 		repositoryImpl.setDescription(getDescription());
 
 		repositoryImpl.setPortletId(getPortletId());
 
-		clone.setTypeSettings(getTypeSettings());
+		repositoryImpl.setTypeSettings(getTypeSettings());
 
 		repositoryImpl.setDlFolderId(getDlFolderId());
 
