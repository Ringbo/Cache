diff --git a/WordPress/src/main/java/org/wordpress/android/ui/accounts/SignInFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/accounts/SignInFragment.java
index 1bdad74..974d536 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/accounts/SignInFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/accounts/SignInFragment.java
@@ -910,7 +910,7 @@
         }
 
         if (forceWordPressComDisplay) {
-            showSelfHostedSignInForm();
+            showPasswordFieldAndFocus();
             return;
         }
 
