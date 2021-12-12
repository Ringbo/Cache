diff --git a/portal-impl/src/com/liferay/portal/service/impl/RepositoryServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/RepositoryServiceImpl.java
index 653e4c4..7703851 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/RepositoryServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/RepositoryServiceImpl.java
@@ -155,7 +155,9 @@
 		long classNameId = getRepositoryClassNameId(repositoryId);
 
 		if (classNameId == 0) {
-			localRepositoryImpl = new LiferayLocalRepository(repositoryId);
+			localRepositoryImpl = new LiferayLocalRepository(
+				repositoryService, dlRepositoryLocalService,
+				dlRepositoryService, repositoryId);
 		}
 		else {
 			BaseRepositoryImpl baseRepositoryImpl = createRepositoryImpl(
@@ -229,7 +231,9 @@
 		long classNameId = getRepositoryClassNameId(repositoryId);
 
 		if (classNameId == 0) {
-			repositoryImpl = new LiferayRepository(repositoryId);
+			repositoryImpl = new LiferayRepository(
+				repositoryService, dlRepositoryLocalService,
+				dlRepositoryService, repositoryId);
 		}
 		else {
 			repositoryImpl = createRepositoryImpl(repositoryId, classNameId);
