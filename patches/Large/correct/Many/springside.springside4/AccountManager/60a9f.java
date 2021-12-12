diff --git a/examples/showcase/src/main/java/org/springside/examples/showcase/common/service/AccountManager.java b/examples/showcase/src/main/java/org/springside/examples/showcase/common/service/AccountManager.java
index 3b4e4c4..c75ea85 100644
--- a/examples/showcase/src/main/java/org/springside/examples/showcase/common/service/AccountManager.java
+++ b/examples/showcase/src/main/java/org/springside/examples/showcase/common/service/AccountManager.java
@@ -87,7 +87,7 @@
 	public List<User> getAllUser() {
 
 		if (applicationStatistics != null) {
-			applicationStatistics.incrUpdateUserTimes();
+			applicationStatistics.incrListUserTimes();
 		}
 		return (List<User>) userJpaDao.findAll();
 	}
