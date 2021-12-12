diff --git a/app/controllers/SessionsController.java b/app/controllers/SessionsController.java
index 64bdd6f..61055d8 100644
--- a/app/controllers/SessionsController.java
+++ b/app/controllers/SessionsController.java
@@ -102,7 +102,7 @@
 
             // if we were redirected from somewhere else because the session had expired, redirect back to that page
             // otherwise use the configured startpage (or skip it if that was requested)
-            if (r.destination != null) {
+            if (r.destination != null && !r.destination.isEmpty()) {
                 return redirect(r.destination);
             }
             // upon redirect, the auth layer will load the user with the given session and log the user in.
