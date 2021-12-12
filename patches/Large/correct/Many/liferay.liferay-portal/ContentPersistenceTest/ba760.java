diff --git a/portal-impl/test/com/liferay/documentlibrary/service/persistence/ContentPersistenceTest.java b/portal-impl/test/com/liferay/documentlibrary/service/persistence/ContentPersistenceTest.java
index af51f3f..b2425d9 100644
--- a/portal-impl/test/com/liferay/documentlibrary/service/persistence/ContentPersistenceTest.java
+++ b/portal-impl/test/com/liferay/documentlibrary/service/persistence/ContentPersistenceTest.java
@@ -123,7 +123,7 @@
 			content1.getCompanyId(), content1.getPortletId(),
 			content1.getRepositoryId(), content1.getPath());
 
-		assertTrue(existingContents2.size() == 1);
+		assertTrue(existingContents2.size() == 2);
 
 		Content existingContent2 = existingContents2.get(0);
 
