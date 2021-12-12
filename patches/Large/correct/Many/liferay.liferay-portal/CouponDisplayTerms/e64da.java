diff --git a/modules/apps/shopping/shopping-web/docroot/WEB-INF/src/com/liferay/shopping/web/search/CouponDisplayTerms.java b/modules/apps/shopping/shopping-web/docroot/WEB-INF/src/com/liferay/shopping/web/search/CouponDisplayTerms.java
index 3c885ee..a1b1eef 100644
--- a/modules/apps/shopping/shopping-web/docroot/WEB-INF/src/com/liferay/shopping/web/search/CouponDisplayTerms.java
+++ b/modules/apps/shopping/shopping-web/docroot/WEB-INF/src/com/liferay/shopping/web/search/CouponDisplayTerms.java
@@ -35,7 +35,8 @@
 
 		active = ParamUtil.getBoolean(portletRequest, ACTIVE, true);
 		code = ParamUtil.getString(portletRequest, CODE);
-		discountType = ParamUtil.getString(portletRequest, DISCOUNT_TYPE);
+		discountType = ParamUtil.getString(
+			portletRequest, DISCOUNT_TYPE, "all");
 	}
 
 	public String getCode() {
