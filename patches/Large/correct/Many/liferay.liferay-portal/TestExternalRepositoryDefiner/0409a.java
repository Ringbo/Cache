diff --git a/portal-impl/test/integration/com/liferay/portal/repository/registry/bundle/repositoryclassdefinitioncatalogimpl/TestExternalRepositoryDefiner.java b/portal-impl/test/integration/com/liferay/portal/repository/registry/bundle/repositoryclassdefinitioncatalogimpl/TestExternalRepositoryDefiner.java
index 31ec1e5..15c10a7 100644
--- a/portal-impl/test/integration/com/liferay/portal/repository/registry/bundle/repositoryclassdefinitioncatalogimpl/TestExternalRepositoryDefiner.java
+++ b/portal-impl/test/integration/com/liferay/portal/repository/registry/bundle/repositoryclassdefinitioncatalogimpl/TestExternalRepositoryDefiner.java
@@ -49,7 +49,7 @@
 
 	@Override
 	public RepositoryConfiguration getRepositoryConfiguration() {
-		return _EMPTY_CONFIGURATION;
+		return _repositoryConfiguration;
 	}
 
 	@Override
