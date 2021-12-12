diff --git a/support/cas-server-support-pm/src/main/java/org/apereo/cas/pm/PasswordManagementService.java b/support/cas-server-support-pm/src/main/java/org/apereo/cas/pm/PasswordManagementService.java
index 8d66b4c..4ca97e3 100644
--- a/support/cas-server-support-pm/src/main/java/org/apereo/cas/pm/PasswordManagementService.java
+++ b/support/cas-server-support-pm/src/main/java/org/apereo/cas/pm/PasswordManagementService.java
@@ -65,7 +65,7 @@
      * @return the security questions
      */
     default Map<String, String> getSecurityQuestions(String username) {
-        return new LinkedHashMap<>();
+        return new LinkedHashMap<>(0);
     }
 
     /**
