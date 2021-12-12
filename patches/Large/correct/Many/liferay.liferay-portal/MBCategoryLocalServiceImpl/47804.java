diff --git a/portal-impl/src/com/liferay/portlet/messageboards/service/impl/MBCategoryLocalServiceImpl.java b/portal-impl/src/com/liferay/portlet/messageboards/service/impl/MBCategoryLocalServiceImpl.java
index 7356384..be985d4 100644
--- a/portal-impl/src/com/liferay/portlet/messageboards/service/impl/MBCategoryLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/messageboards/service/impl/MBCategoryLocalServiceImpl.java
@@ -627,7 +627,8 @@
 			User user = userPersistence.findByPrimaryKey(userId);
 
 			List<Object> categoriesAndThreads = getCategoriesAndThreads(
-				category.getGroupId(), categoryId);
+				category.getGroupId(), categoryId,
+				WorkflowConstants.STATUS_IN_TRASH);
 
 			restoreDependentsFromTrash(user, categoriesAndThreads);
 		}
@@ -681,7 +682,8 @@
 		User user = userPersistence.findByPrimaryKey(userId);
 
 		List<Object> categoriesAndThreads = getCategoriesAndThreads(
-			category.getGroupId(), categoryId);
+			category.getGroupId(), categoryId,
+			WorkflowConstants.STATUS_IN_TRASH);
 
 		restoreDependentsFromTrash(user, categoriesAndThreads);
 
@@ -1141,7 +1143,8 @@
 				restoreDependentsFromTrash(
 					user,
 					getCategoriesAndThreads(
-						category.getGroupId(), category.getCategoryId()));
+						category.getGroupId(), category.getCategoryId(),
+						WorkflowConstants.STATUS_IN_TRASH));
 
 				// Trash
 
