diff --git a/api/cas-server-core-api-logout/src/main/java/org/apereo/cas/logout/LogoutExecutionPlan.java b/api/cas-server-core-api-logout/src/main/java/org/apereo/cas/logout/LogoutExecutionPlan.java
index 93b9f52..f3040e1 100644
--- a/api/cas-server-core-api-logout/src/main/java/org/apereo/cas/logout/LogoutExecutionPlan.java
+++ b/api/cas-server-core-api-logout/src/main/java/org/apereo/cas/logout/LogoutExecutionPlan.java
@@ -28,6 +28,6 @@
      * @return the logout handlers
      */
     default Collection<LogoutHandler> getLogoutHandlers() {
-        return new ArrayList<>();
+        return new ArrayList<>(0);
     }
 }
