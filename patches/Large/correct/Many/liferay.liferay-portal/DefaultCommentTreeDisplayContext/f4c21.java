diff --git a/portal-impl/src/com/liferay/portal/comment/display/context/DefaultCommentTreeDisplayContext.java b/portal-impl/src/com/liferay/portal/comment/display/context/DefaultCommentTreeDisplayContext.java
index 27735ea..bf3f18c 100644
--- a/portal-impl/src/com/liferay/portal/comment/display/context/DefaultCommentTreeDisplayContext.java
+++ b/portal-impl/src/com/liferay/portal/comment/display/context/DefaultCommentTreeDisplayContext.java
@@ -125,7 +125,7 @@
 			return false;
 		}
 
-		return _discussionComment.isInTrash();
+		return !_discussionComment.isInTrash();
 	}
 
 	@Override
