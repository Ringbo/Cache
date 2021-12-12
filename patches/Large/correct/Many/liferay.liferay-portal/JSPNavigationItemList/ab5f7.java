diff --git a/modules/apps/foundation/frontend-taglib/frontend-taglib-clay/src/main/java/com/liferay/frontend/taglib/clay/servlet/taglib/util/JSPNavigationItemList.java b/modules/apps/foundation/frontend-taglib/frontend-taglib-clay/src/main/java/com/liferay/frontend/taglib/clay/servlet/taglib/util/JSPNavigationItemList.java
index 26f43e1..fbd685a 100644
--- a/modules/apps/foundation/frontend-taglib/frontend-taglib-clay/src/main/java/com/liferay/frontend/taglib/clay/servlet/taglib/util/JSPNavigationItemList.java
+++ b/modules/apps/foundation/frontend-taglib/frontend-taglib-clay/src/main/java/com/liferay/frontend/taglib/clay/servlet/taglib/util/JSPNavigationItemList.java
@@ -27,7 +27,7 @@
 	public JSPNavigationItemList(PageContext pageContext) {
 		renderResponse = (RenderResponse)pageContext.findAttribute(
 			"renderResponse");
-		request = (HttpServletRequest)pageContext.findAttribute("request");
+		request = (HttpServletRequest)pageContext.getRequest();
 	}
 
 	protected RenderResponse renderResponse;
