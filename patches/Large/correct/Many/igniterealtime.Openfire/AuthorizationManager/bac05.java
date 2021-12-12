diff --git a/src/java/org/jivesoftware/openfire/auth/AuthorizationManager.java b/src/java/org/jivesoftware/openfire/auth/AuthorizationManager.java
index 5909232..b353bc1 100644
--- a/src/java/org/jivesoftware/openfire/auth/AuthorizationManager.java
+++ b/src/java/org/jivesoftware/openfire/auth/AuthorizationManager.java
@@ -165,7 +165,7 @@
                             return false;
                         }
                         try {
-                            UserManager.getUserProvider().createUser(username, StringUtils.randomString(8), null, null);
+                            UserManager.getInstance().createUser(username, StringUtils.randomString(8), null, null);
                             if (Log.isDebugEnabled()) {
                                 Log.info("AuthorizationManager: User "+username+" created.");
                             }
