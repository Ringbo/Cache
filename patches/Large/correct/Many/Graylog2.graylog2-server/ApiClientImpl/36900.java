diff --git a/app/lib/ApiClientImpl.java b/app/lib/ApiClientImpl.java
index 521787c..2d3e2e7 100644
--- a/app/lib/ApiClientImpl.java
+++ b/app/lib/ApiClientImpl.java
@@ -319,7 +319,7 @@
             if (radio == null) {
                 if (node == null) {
                     if (nodes != null) {
-                        log.error("Multiple nodes are set, but execute() was called. This is most likely a bug and you meant to call executeOnAll()!");
+                        log.error("Multiple nodes are set, but execute() was called. This is most likely a bug and you meant to call executeOnAll()!", new Throwable());
                     }
                     node(serverNodes.any());
                 }
@@ -334,7 +334,7 @@
                 if (user != null) {
                     session(user.getSessionId());
                 } else {
-                    log.warn("You did not add unauthenticated() nor session() but also don't have a current user. You probably meant unauthenticated(). This is a bug!");
+                    log.warn("You did not add unauthenticated() nor session() but also don't have a current user. You probably meant unauthenticated(). This is a bug!", new Throwable());
                 }
             }
             final URL url = prepareUrl(target);
@@ -544,7 +544,7 @@
                 }
 
                 if (unauthenticated && sessionId != null) {
-                    log.error("Both session() and unauthenticated() are set for this request, this is a bug, using session id.");
+                    log.error("Both session() and unauthenticated() are set for this request, this is a bug, using session id.", new Throwable());
                 }
                 if (sessionId != null) {
                     // pass the current session id via basic auth and special "password"
