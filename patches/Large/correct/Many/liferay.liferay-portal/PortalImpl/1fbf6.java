diff --git a/portal-impl/src/com/liferay/portal/util/PortalImpl.java b/portal-impl/src/com/liferay/portal/util/PortalImpl.java
index d5590cc..4ee32d5 100644
--- a/portal-impl/src/com/liferay/portal/util/PortalImpl.java
+++ b/portal-impl/src/com/liferay/portal/util/PortalImpl.java
@@ -3865,7 +3865,8 @@
 				scopeGroup.getParentGroupId(), companyGroup.getGroupId()
 			};
 		}
-		else if (scopeGroup.isRegularSite()) {
+		else if (scopeGroup.isRegularSite() ||
+			scopeGroup.isLayoutSetPrototype()) {
 			return new long[] {groupId, companyGroup.getGroupId()};
 		}
 		else {
