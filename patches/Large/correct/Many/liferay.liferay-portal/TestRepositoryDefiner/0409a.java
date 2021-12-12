diff --git a/portal-impl/test/integration/com/liferay/portal/repository/registry/bundle/repositoryclassdefinitioncatalogimpl/TestRepositoryDefiner.java b/portal-impl/test/integration/com/liferay/portal/repository/registry/bundle/repositoryclassdefinitioncatalogimpl/TestRepositoryDefiner.java
index 6816848..8c2d340 100644
--- a/portal-impl/test/integration/com/liferay/portal/repository/registry/bundle/repositoryclassdefinitioncatalogimpl/TestRepositoryDefiner.java
+++ b/portal-impl/test/integration/com/liferay/portal/repository/registry/bundle/repositoryclassdefinitioncatalogimpl/TestRepositoryDefiner.java
@@ -49,7 +49,7 @@
 
 	@Override
 	public RepositoryConfiguration getRepositoryConfiguration() {
-		return _EMPTY_CONFIGURATION;
+		return _repositoryConfiguration;
 	}
 
 	@Override
