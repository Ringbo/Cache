diff --git a/src/org/zaproxy/zap/extension/users/ExtensionUserManagement.java b/src/org/zaproxy/zap/extension/users/ExtensionUserManagement.java
index e480a63..65ef632 100644
--- a/src/org/zaproxy/zap/extension/users/ExtensionUserManagement.java
+++ b/src/org/zaproxy/zap/extension/users/ExtensionUserManagement.java
@@ -303,7 +303,7 @@
 	public void exportContextData(Context ctx, Configuration config) {
 		ContextUserAuthManager m = contextManagers.get(ctx.getIndex());
 		for (User u : m.getUsers()) {
-			config.setProperty(CONTEXT_CONFIG_USERS_USER, User.encode(u));
+			config.addProperty(CONTEXT_CONFIG_USERS_USER, User.encode(u));
 		}
 	}
 
