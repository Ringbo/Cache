diff --git a/src/api/org/openmrs/api/impl/UserServiceImpl.java b/src/api/org/openmrs/api/impl/UserServiceImpl.java
index 8914b4c..9118305 100644
--- a/src/api/org/openmrs/api/impl/UserServiceImpl.java
+++ b/src/api/org/openmrs/api/impl/UserServiceImpl.java
@@ -98,24 +98,30 @@
 	}
 	
 	/**
-	 * Save changes to user
-	 * @param user
+	 * Save changes to given <code>user</code> to the database.
+	 * 
+	 * If the user.systemId is blank or null, it will be filled in automatically
+	 * by the current systemId algorithm 
+	 * 
+	 * @param user the OpenMRS User to save to the database
 	 * @throws APIException
 	 */
 	public void updateUser(User user) throws APIException {
 		checkPrivileges(user);
 		setCollectionProperties(user);
 		
-		if (user.getSystemId() == null)
+		if (user.getSystemId() == null || user.getSystemId().equals(""))
 			user.setSystemId(generateSystemId());
 		
 		getUserDAO().updateUser(user);
 	}
 	
 	/**
-	 * Grant roles for user
-	 * @param user
-	 * @param role
+	 * Give a <code>role</code> to the given <code>user</code>.  If the 
+	 * <code>user</code> already has this role, the user is saved anyway.
+	 * 
+	 * @param user The OpenMRS user to add the <code>role</code> to 
+	 * @param role Role to give to the <code>user</code>
 	 * @throws APIException
 	 */
 	public void grantUserRole(User user, Role role) throws APIException {
@@ -124,9 +130,13 @@
 	}
 	
 	/**
-	 * Revoke roles from user
-	 * @param user
-	 * @param role
+	 * Remove the given <code>role</code> from the given <code>user</code>
+	 * If the <code>user</code> does not have this <code>role</code>, no
+	 * errors will be thrown and the user will be saved anyway
+	 * 
+	 * @param user the OpenMRS user from which to remove the <code>role</code> 
+	 * @param role Role to remove from <code>user</code>
+	 * 
 	 * @throws APIException
 	 */
 	public void revokeUserRole(User user, Role role) throws APIException {
