diff --git a/storm-webapp/src/main/java/org/apache/storm/daemon/ui/filters/AuthorizedUserFilter.java b/storm-webapp/src/main/java/org/apache/storm/daemon/ui/filters/AuthorizedUserFilter.java
index 6c6d947..1d10f06 100644
--- a/storm-webapp/src/main/java/org/apache/storm/daemon/ui/filters/AuthorizedUserFilter.java
+++ b/storm-webapp/src/main/java/org/apache/storm/daemon/ui/filters/AuthorizedUserFilter.java
@@ -169,7 +169,7 @@
                 containerRequestContext.abortWith(
                         makeResponse(new AuthorizationException("UI request '" + op + "' for '"
                                         + user + "' user is not authorized"),
-                                containerRequestContext, 401)
+                                containerRequestContext, 403)
                 );
             }
         }
