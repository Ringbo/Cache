diff --git a/support/cas-server-support-oauth/src/main/java/org/apereo/cas/support/oauth/web/BaseOAuthWrapperController.java b/support/cas-server-support-oauth/src/main/java/org/apereo/cas/support/oauth/web/BaseOAuthWrapperController.java
index 9708255..8c6bfa1 100644
--- a/support/cas-server-support-oauth/src/main/java/org/apereo/cas/support/oauth/web/BaseOAuthWrapperController.java
+++ b/support/cas-server-support-oauth/src/main/java/org/apereo/cas/support/oauth/web/BaseOAuthWrapperController.java
@@ -158,7 +158,7 @@
                     LOGGER.debug("Added attribute [{}] with value [{}] to the authentication", k, v);
                     bldr.addAttribute(k, v);
                 } else {
-                    LOGGER.debug("Skipped over attribute [{}] since it's already contained by the principal", k, v);
+                    LOGGER.debug("Skipped over attribute [{}] since it's already contained by the principal", k);
                 }
             });
         }
