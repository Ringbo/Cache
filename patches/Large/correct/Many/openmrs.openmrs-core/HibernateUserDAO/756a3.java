diff --git a/src/api/org/openmrs/api/db/hibernate/HibernateUserDAO.java b/src/api/org/openmrs/api/db/hibernate/HibernateUserDAO.java
index da9a215..668d5b1 100644
--- a/src/api/org/openmrs/api/db/hibernate/HibernateUserDAO.java
+++ b/src/api/org/openmrs/api/db/hibernate/HibernateUserDAO.java
@@ -104,7 +104,7 @@
 	public boolean hasDuplicateUsername(String username, String systemId, Integer userId) {
 		if (username == null || username.length() == 0)
 			username = "-";
-		if (systemId == null || username.length() == 0)
+		if (systemId == null || systemId.length() == 0)
 			systemId = "-";
 		
 		if (userId == null)
