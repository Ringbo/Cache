diff --git a/src/main/java/com/commafeed/frontend/pages/NextUnreadRedirectPage.java b/src/main/java/com/commafeed/frontend/pages/NextUnreadRedirectPage.java
index 7a59f0b..4f74318 100644
--- a/src/main/java/com/commafeed/frontend/pages/NextUnreadRedirectPage.java
+++ b/src/main/java/com/commafeed/frontend/pages/NextUnreadRedirectPage.java
@@ -42,7 +42,7 @@
 		if (StringUtils.isBlank(categoryId)
 				|| CategoryREST.ALL.equals(categoryId)) {
 			statuses = feedEntryStatusDAO.findAll(user, true, 0, 1,
-					ReadingOrder.desc, false);
+					ReadingOrder.desc, true);
 		} else {
 			FeedCategory category = feedCategoryDAO.findById(user,
 					Long.valueOf(categoryId));
