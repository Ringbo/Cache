diff --git a/portal-impl/src/com/liferay/portal/service/impl/GroupLocalServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/GroupLocalServiceImpl.java
index 42d6703..743fc0b 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/GroupLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/GroupLocalServiceImpl.java
@@ -135,7 +135,7 @@
 		}
 
 		validateFriendlyURL(
-			groupId, user.getCompanyId(), classNameId, classPK, friendlyURL);
+			user.getCompanyId(), groupId, classNameId, classPK, friendlyURL);
 
 		Group group = groupPersistence.create(groupId);
 
@@ -663,7 +663,7 @@
 			group.getClassPK(), StringPool.BLANK, friendlyURL);
 
 		validateFriendlyURL(
-			group.getGroupId(), group.getCompanyId(), group.getClassNameId(),
+			group.getCompanyId(), group.getGroupId(), group.getClassNameId(),
 			group.getClassPK(), friendlyURL);
 
 		group.setFriendlyURL(friendlyURL);
@@ -697,7 +697,7 @@
 		}
 
 		validateFriendlyURL(
-			group.getGroupId(), group.getCompanyId(), group.getClassNameId(),
+			group.getCompanyId(), group.getGroupId(), group.getClassNameId(),
 			group.getClassPK(), friendlyURL);
 
 		group.setName(name);
