diff --git a/app/src/main/java/com/kickstarter/ui/views/DiscoveryToolbar.java b/app/src/main/java/com/kickstarter/ui/views/DiscoveryToolbar.java
index e1a23d5..9b524a6 100644
--- a/app/src/main/java/com/kickstarter/ui/views/DiscoveryToolbar.java
+++ b/app/src/main/java/com/kickstarter/ui/views/DiscoveryToolbar.java
@@ -90,7 +90,8 @@
       currentUserButton,
       filterExpandMoreButton,
       filterTextView,
-      loginButton);
+      loginButton,
+      searchButton);
 
     final @ColorInt int overlayTextColor = DiscoveryUtils.overlayTextColor(context, params);
 
