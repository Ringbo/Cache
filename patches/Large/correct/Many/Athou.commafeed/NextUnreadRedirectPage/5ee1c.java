diff --git a/src/main/java/com/commafeed/frontend/pages/NextUnreadRedirectPage.java b/src/main/java/com/commafeed/frontend/pages/NextUnreadRedirectPage.java
index 21c7f64..b2eeb9f 100644
--- a/src/main/java/com/commafeed/frontend/pages/NextUnreadRedirectPage.java
+++ b/src/main/java/com/commafeed/frontend/pages/NextUnreadRedirectPage.java
@@ -50,7 +50,7 @@
 				List<FeedCategory> children = feedCategoryDAO
 						.findAllChildrenCategories(user, category);
 				statuses = feedEntryStatusDAO.findUnreadByCategories(children,
-						null, 0, 1, ReadingOrder.desc, false);
+						null, 0, 1, ReadingOrder.desc, true);
 			}
 		}
 
