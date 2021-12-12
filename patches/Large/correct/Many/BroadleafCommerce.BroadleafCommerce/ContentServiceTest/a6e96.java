diff --git a/BroadleafCommerce/BroadleafCommerceIntegrationTests/src/test/java/org/broadleafcommerce/content/service/ContentServiceTest.java b/BroadleafCommerce/BroadleafCommerceIntegrationTests/src/test/java/org/broadleafcommerce/content/service/ContentServiceTest.java
index 5540d2b..0c6f54a 100644
--- a/BroadleafCommerce/BroadleafCommerceIntegrationTests/src/test/java/org/broadleafcommerce/content/service/ContentServiceTest.java
+++ b/BroadleafCommerce/BroadleafCommerceIntegrationTests/src/test/java/org/broadleafcommerce/content/service/ContentServiceTest.java
@@ -98,7 +98,7 @@
 		List<Integer> contentIds = new ArrayList<Integer>();
 		contentIds.add(checkedOutContentId);
 
-		contentService.submitContentFromSandbox(contentIds, "UserSandBox", "NumeroUno");
+		contentService.submitContentFromSandbox(contentIds, "UserSandBox", "NumeroUno", "NoteTest");
 
 		List<Content> awaitingApproval = contentDao.readContentAwaitingApproval();
 		assert awaitingApproval != null && !awaitingApproval.isEmpty();
