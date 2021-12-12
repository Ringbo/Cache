diff --git a/core/src/main/java/org/apache/shiro/authc/pam/FirstSuccessfulStrategy.java b/core/src/main/java/org/apache/shiro/authc/pam/FirstSuccessfulStrategy.java
index 05b7010..6a99ff0 100644
--- a/core/src/main/java/org/apache/shiro/authc/pam/FirstSuccessfulStrategy.java
+++ b/core/src/main/java/org/apache/shiro/authc/pam/FirstSuccessfulStrategy.java
@@ -57,7 +57,7 @@
      * since this strategy mandates that only the info from the first successfully authenticated realm be used.
      */
     protected AuthenticationInfo merge(AuthenticationInfo info, AuthenticationInfo aggregate) {
-        if (aggregate != null && isEmpty(aggregate.getPrincipals())) {
+        if (aggregate != null && !isEmpty(aggregate.getPrincipals())) {
             return aggregate;
         }
         return info != null ? info : aggregate;
