diff --git a/test/selenium/pages/LoginPage.java b/test/selenium/pages/LoginPage.java
index 3d512a4..46ab37a 100644
--- a/test/selenium/pages/LoginPage.java
+++ b/test/selenium/pages/LoginPage.java
@@ -35,7 +35,7 @@
 
     @Override
     public String getUrl() {
-        return routes.SessionsController.index().url();
+        return routes.SessionsController.index("").url();
     }
 
     @Override
