diff --git a/src/com/android/email/activity/setup/AccountSetupIncoming.java b/src/com/android/email/activity/setup/AccountSetupIncoming.java
index de7b3f1..67b1692 100644
--- a/src/com/android/email/activity/setup/AccountSetupIncoming.java
+++ b/src/com/android/email/activity/setup/AccountSetupIncoming.java
@@ -233,15 +233,18 @@
 
                     for (int i = 0, count = pathParts.length; i < count; i++) {
                         if (i == 0) {
-                            if (pathParts[0] != null) {
+                            if (pathParts[0] != null &&
+                                pathParts[0].length() > 1) {
                                 mWebdavPathPrefixView.setText(pathParts[0].substring(1));
                             }
                         } else if (i == 1) {
-                            if (pathParts[1] != null) {
+                            if (pathParts[1] != null &&
+                                pathParts[1].length() > 1) {
                                 mWebdavAuthPathView.setText(pathParts[1]);
                             }
                         } else if (i == 2) {
-                            if (pathParts[2] != null ) {
+                            if (pathParts[2] != null &&
+                                pathParts[2].length() > 1) {
                                 mWebdavMailboxPathView.setText(pathParts[2]);
                             }
                         }
