diff --git a/portal-impl/src/com/liferay/portal/service/impl/GroupLocalServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/GroupLocalServiceImpl.java
index 80b3e44..da7d2fd 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/GroupLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/GroupLocalServiceImpl.java
@@ -271,7 +271,9 @@
 		}
 
 		if (className.equals(Group.class.getName())) {
-			if (!site && (liveGroupId == 0)) {
+			if (!site && (liveGroupId == 0) &&
+				!name.equals(GroupConstants.CONTROL_PANEL)) {
+
 				throw new IllegalArgumentException();
 			}
 		}
