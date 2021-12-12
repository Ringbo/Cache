diff --git a/portal-impl/src/com/liferay/portal/model/impl/LayoutTypePortletImpl.java b/portal-impl/src/com/liferay/portal/model/impl/LayoutTypePortletImpl.java
index 0835b18..b4e0f01 100644
--- a/portal-impl/src/com/liferay/portal/model/impl/LayoutTypePortletImpl.java
+++ b/portal-impl/src/com/liferay/portal/model/impl/LayoutTypePortletImpl.java
@@ -1590,7 +1590,7 @@
 		Layout layout = getLayout();
 
 		if (layout.isTypeControlPanel()) {
-			return true;
+			return false;
 		}
 
 		if (!strict &&
