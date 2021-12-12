diff --git a/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceStagingAdvice.java b/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceStagingAdvice.java
index 1a6ed6d..8ecb77d 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceStagingAdvice.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceStagingAdvice.java
@@ -245,7 +245,7 @@
 			layoutRevision.setIconImage(iconImage.booleanValue());
 
 			if (iconImage.booleanValue()) {
-				long iconImageId = originalLayout.getIconImageId();
+				long iconImageId = layoutRevision.getIconImageId();
 
 				if (iconImageId <= 0) {
 					iconImageId = CounterLocalServiceUtil.increment();
@@ -286,7 +286,7 @@
 		if (iconImage != null) {
 			if ((iconBytes != null) && (iconBytes.length > 0)) {
 				ImageLocalServiceUtil.updateImage(
-					originalLayout.getIconImageId(), iconBytes);
+					layoutRevision.getIconImageId(), iconBytes);
 			}
 		}
 
