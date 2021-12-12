diff --git a/facebook/src/com/facebook/WebDialog.java b/facebook/src/com/facebook/WebDialog.java
index 3ca2be8..e41486a 100644
--- a/facebook/src/com/facebook/WebDialog.java
+++ b/facebook/src/com/facebook/WebDialog.java
@@ -470,7 +470,7 @@
                 }
 
                 if (Utility.isNullOrEmpty(error) && Utility
-                        .isNullOrEmpty(errorMessage) && errorCode != FacebookRequestError.INVALID_ERROR_CODE) {
+                        .isNullOrEmpty(errorMessage) && errorCode == FacebookRequestError.INVALID_ERROR_CODE) {
                     sendSuccessToListener(values);
                 } else if (error != null && (error.equals("access_denied") ||
                         error.equals("OAuthAccessDeniedException"))) {
