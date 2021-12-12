diff --git a/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java
index fee8378..f6539dc 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java
@@ -2098,7 +2098,7 @@
 	protected void validateFirstLayout(String type)
 		throws PortalException {
 
-		if (!PortalUtil.isLayoutFirstPageable(type)) {
+		if (Validator.isNull(type) || !PortalUtil.isLayoutFirstPageable(type)) {
 			throw new LayoutTypeException(LayoutTypeException.FIRST_LAYOUT);
 		}
 	}
