diff --git a/storm-webapp/src/main/java/org/apache/storm/daemon/ui/filters/AuthorizedUserFilter.java b/storm-webapp/src/main/java/org/apache/storm/daemon/ui/filters/AuthorizedUserFilter.java
index 9a4a2a1..6c6d947 100644
--- a/storm-webapp/src/main/java/org/apache/storm/daemon/ui/filters/AuthorizedUserFilter.java
+++ b/storm-webapp/src/main/java/org/apache/storm/daemon/ui/filters/AuthorizedUserFilter.java
@@ -160,7 +160,7 @@
         }
 
         if (uiAclHandler != null) {
-            if (!uiAclHandler.permit(reqContext, op, conf)) {
+            if (!uiAclHandler.permit(reqContext, op, topoConf)) {
                 Principal principal = reqContext.principal();
                 String user = "unknown";
                 if (principal != null) {
