diff --git a/src/main/java/com/gitblit/wicket/pages/EditRepositoryPage.java b/src/main/java/com/gitblit/wicket/pages/EditRepositoryPage.java
index b5c46ac..318b2b7 100644
--- a/src/main/java/com/gitblit/wicket/pages/EditRepositoryPage.java
+++ b/src/main/java/com/gitblit/wicket/pages/EditRepositoryPage.java
@@ -681,7 +681,7 @@
 				RepositoryModel latestModel = app().repositories().getRepositoryModel(repositoryModel.name);
 				boolean canDelete = app().repositories().canDelete(latestModel);
 				if (canDelete) {
-					if (app().repositories().deleteRepositoryModel(latestModel)) {
+					if (app().gitblit().deleteRepositoryModel(latestModel)) {
 						info(MessageFormat.format(getString("gb.repositoryDeleted"), latestModel));
 						if (latestModel.isPersonalRepository()) {
 							// redirect to user's profile page
