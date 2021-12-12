diff --git a/portal-impl/src/com/liferay/portal/model/impl/GroupImpl.java b/portal-impl/src/com/liferay/portal/model/impl/GroupImpl.java
index acde386..ebd33ef 100644
--- a/portal-impl/src/com/liferay/portal/model/impl/GroupImpl.java
+++ b/portal-impl/src/com/liferay/portal/model/impl/GroupImpl.java
@@ -442,7 +442,7 @@
 
 				showSite = false;
 			}
-			else if (isOrganization() && isSite()) {
+			else if (isOrganization() && !isSite()) {
 				_log.error(
 					"Group " + getGroupId() +
 						" is an organization site that does not have pages");
