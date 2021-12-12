diff --git a/app/src/main/java/com/firebase/uidemo/auth/AuthUiActivity.java b/app/src/main/java/com/firebase/uidemo/auth/AuthUiActivity.java
index 978d723..f98a4d7 100644
--- a/app/src/main/java/com/firebase/uidemo/auth/AuthUiActivity.java
+++ b/app/src/main/java/com/firebase/uidemo/auth/AuthUiActivity.java
@@ -171,7 +171,7 @@
     @OnClick(R.id.sign_in_silent)
     public void silentSignIn(View view) {
         AuthUI.getInstance().silentSignIn(this, getSelectedProviders())
-                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
+                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                     @Override
                     public void onComplete(@NonNull Task<AuthResult> task) {
                         if (task.isSuccessful()) {
