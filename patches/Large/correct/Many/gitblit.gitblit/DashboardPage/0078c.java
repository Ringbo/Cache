diff --git a/src/main/java/com/gitblit/wicket/pages/DashboardPage.java b/src/main/java/com/gitblit/wicket/pages/DashboardPage.java
index 66bbf73..5d83839 100644
--- a/src/main/java/com/gitblit/wicket/pages/DashboardPage.java
+++ b/src/main/java/com/gitblit/wicket/pages/DashboardPage.java
@@ -124,7 +124,7 @@
 		// parameters
 		int daysBack = params == null ? 0 : WicketUtils.getDaysBack(params);
 		if (daysBack < 1) {
-			daysBack = 14;
+			daysBack = 7;
 		}
 		Calendar c = Calendar.getInstance();
 		c.add(Calendar.DATE, -1*daysBack);
@@ -136,7 +136,7 @@
 		List<RepositoryModel> owned = new ArrayList<RepositoryModel>();
 		List<RepositoryModel> active = new ArrayList<RepositoryModel>();
 
-		for (RepositoryModel model : GitBlit.self().getRepositoryModels(user)) {
+		for (RepositoryModel model : getRepositoryModels()) {
 			if (model.isUsersPersonalRepository(user.username) || model.isOwner(user.username)) {
 				owned.add(model);
 			}
