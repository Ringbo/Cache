diff --git a/portal-impl/src/com/liferay/portal/repository/registry/RepositoryCatalogImpl.java b/portal-impl/src/com/liferay/portal/repository/registry/RepositoryCatalogImpl.java
index 5827fbd..0522836 100644
--- a/portal-impl/src/com/liferay/portal/repository/registry/RepositoryCatalogImpl.java
+++ b/portal-impl/src/com/liferay/portal/repository/registry/RepositoryCatalogImpl.java
@@ -92,7 +92,7 @@
 			ClassName className = _classNameLocalService.getClassName(
 				classNameId);
 
-			_externalRepositoriesClassNames.add(className.getClassName());
+			_externalRepositoriesClassNames.add(className.getValue());
 		}
 
 		_repositoryConfigurations.put(
