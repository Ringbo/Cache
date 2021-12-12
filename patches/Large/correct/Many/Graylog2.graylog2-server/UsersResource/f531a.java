diff --git a/graylog2-server/src/main/java/org/graylog2/rest/resources/users/UsersResource.java b/graylog2-server/src/main/java/org/graylog2/rest/resources/users/UsersResource.java
index 7b8bdbd..d7be313 100644
--- a/graylog2-server/src/main/java/org/graylog2/rest/resources/users/UsersResource.java
+++ b/graylog2-server/src/main/java/org/graylog2/rest/resources/users/UsersResource.java
@@ -196,7 +196,7 @@
             user.setStartpage(cr.startpage.type, cr.startpage.id);
         }
         if (isPermitted("*")) {
-            if (cr.session_timeout_ms != 0) {
+            if (cr.session_timeout_ms != null && cr.session_timeout_ms != 0) {
                 user.setSessionTimeoutMs(cr.session_timeout_ms);
             }
         }
