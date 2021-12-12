diff --git a/app/src/main/java/acr/browser/lightning/activity/BrowserActivity.java b/app/src/main/java/acr/browser/lightning/activity/BrowserActivity.java
index a497882..eb9585c 100644
--- a/app/src/main/java/acr/browser/lightning/activity/BrowserActivity.java
+++ b/app/src/main/java/acr/browser/lightning/activity/BrowserActivity.java
@@ -1532,7 +1532,7 @@
         boolean containsPeriod = query.contains(".");
         boolean isIPAddress = (TextUtils.isDigitsOnly(query.replace(".", ""))
                 && (query.replace(".", "").length() >= 4) && query.contains("."));
-        boolean aboutScheme = query.contains("about:");
+        boolean aboutScheme = query.startsWith("about:");
         boolean validURL = (query.startsWith("ftp://") || query.startsWith(Constants.HTTP)
                 || query.startsWith(Constants.FILE) || query.startsWith(Constants.HTTPS))
                 || isIPAddress;
