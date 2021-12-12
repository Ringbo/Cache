diff --git a/src/api/org/openmrs/api/impl/UserServiceImpl.java b/src/api/org/openmrs/api/impl/UserServiceImpl.java
index 6b7b215..ac5b089 100644
--- a/src/api/org/openmrs/api/impl/UserServiceImpl.java
+++ b/src/api/org/openmrs/api/impl/UserServiceImpl.java
@@ -428,7 +428,7 @@
 	 */
 	public User setUserProperty(User user, String key, String value) {
 		if (user != null) {
-			if (!user.hasPrivilege(OpenmrsConstants.PRIV_EDIT_USERS) && !user.equals(Context.getAuthenticatedUser()))
+			if (!Context.hasPrivilege(OpenmrsConstants.PRIV_EDIT_USERS) && !user.equals(Context.getAuthenticatedUser()))
 				throw new APIException("You are not authorized to change " + user.getUserId() + "'s properties");
 			
 			user.setUserProperty(key, value);
