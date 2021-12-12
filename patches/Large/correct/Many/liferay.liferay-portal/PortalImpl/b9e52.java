diff --git a/portal-impl/src/com/liferay/portal/util/PortalImpl.java b/portal-impl/src/com/liferay/portal/util/PortalImpl.java
index 5be22e7..ea72808 100644
--- a/portal-impl/src/com/liferay/portal/util/PortalImpl.java
+++ b/portal-impl/src/com/liferay/portal/util/PortalImpl.java
@@ -4793,7 +4793,8 @@
 			};
 		}
 		else if (scopeGroup.isLayoutSetPrototype() ||
-				 scopeGroup.isRegularSite()) {
+				 scopeGroup.isRegularSite() ||
+				 scopeGroup.isUser()) {
 
 			return new long[] {groupId, companyGroup.getGroupId()};
 		}
