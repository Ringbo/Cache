diff --git a/src/main/java/com/commafeed/backend/dao/FeedSubscriptionService.java b/src/main/java/com/commafeed/backend/dao/FeedSubscriptionService.java
index 74a6076..e4eb7ba 100644
--- a/src/main/java/com/commafeed/backend/dao/FeedSubscriptionService.java
+++ b/src/main/java/com/commafeed/backend/dao/FeedSubscriptionService.java
@@ -30,7 +30,7 @@
 		EasyCriteria<FeedSubscription> criteria = EasyCriteriaFactory
 				.createQueryCriteria(em, getType());
 		criteria.andEquals("user", user);
-		criteria.andEquals("category", null);
+		criteria.andIsNull("category");
 		return criteria.getResultList();
 
 	}
