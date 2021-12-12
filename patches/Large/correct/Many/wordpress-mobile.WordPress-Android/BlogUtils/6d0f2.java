diff --git a/WordPress/src/main/java/org/wordpress/android/ui/accounts/BlogUtils.java b/WordPress/src/main/java/org/wordpress/android/ui/accounts/BlogUtils.java
index c38e245..a286c19 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/accounts/BlogUtils.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/accounts/BlogUtils.java
@@ -152,7 +152,7 @@
                     blog.setPlanShortName(planShortName);
                     blogUpdated = true;
                 }
-                if (!blog.getCapabilities().equals(capabilities)) {
+                if (blog.getCapabilities() == null || !blog.getCapabilities().equals(capabilities)) {
                     blog.setCapabilities(capabilities);
                     blogUpdated = true;
                 }
