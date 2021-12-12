diff --git a/modules/apps/apio-architect/apio-architect-sample/src/main/java/com/liferay/apio/architect/sample/internal/router/BlogPostingRatingReusableNestedCollectionRouter.java b/modules/apps/apio-architect/apio-architect-sample/src/main/java/com/liferay/apio/architect/sample/internal/router/BlogPostingRatingReusableNestedCollectionRouter.java
index cd84a4b..3dfeb4a 100644
--- a/modules/apps/apio-architect/apio-architect-sample/src/main/java/com/liferay/apio/architect/sample/internal/router/BlogPostingRatingReusableNestedCollectionRouter.java
+++ b/modules/apps/apio-architect/apio-architect-sample/src/main/java/com/liferay/apio/architect/sample/internal/router/BlogPostingRatingReusableNestedCollectionRouter.java
@@ -63,7 +63,7 @@
 					}
 				).map(
 					BlogPostingConverter::toBlogPosting
-				).blogPostings(
+				).collect(
 					Collectors.toList()
 				);
 
