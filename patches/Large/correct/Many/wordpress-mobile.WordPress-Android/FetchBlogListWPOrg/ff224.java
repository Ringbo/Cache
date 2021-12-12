diff --git a/WordPress/src/main/java/org/wordpress/android/ui/accounts/helpers/FetchBlogListWPOrg.java b/WordPress/src/main/java/org/wordpress/android/ui/accounts/helpers/FetchBlogListWPOrg.java
index 4719083..b81b804 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/accounts/helpers/FetchBlogListWPOrg.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/accounts/helpers/FetchBlogListWPOrg.java
@@ -465,7 +465,7 @@
                 AppLog.e(T.NUX, "XMLRPCException received from XMLRPC call wp.getUsersBlogs", xmlRpcException);
                 mErrorMsgId = org.wordpress.android.R.string.no_site_error;
             } catch (SSLHandshakeException e) {
-                if (WPUrlUtils.isWordPressCom(xmlrpcUri)) {
+                if (!WPUrlUtils.isWordPressCom(xmlrpcUri)) {
                     mErroneousSslCertificate = true;
                 }
                 AppLog.w(T.NUX, "SSLHandshakeException failed. Erroneous SSL certificate detected.");
