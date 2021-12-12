diff --git a/database/app/src/main/java/com/google/firebase/quickstart/database/SignInActivity.java b/database/app/src/main/java/com/google/firebase/quickstart/database/SignInActivity.java
index 88408c5..a96bba1 100644
--- a/database/app/src/main/java/com/google/firebase/quickstart/database/SignInActivity.java
+++ b/database/app/src/main/java/com/google/firebase/quickstart/database/SignInActivity.java
@@ -71,7 +71,7 @@
         String password = mPasswordField.getText().toString();
 
         mAuth.signInWithEmailAndPassword(email, password)
-                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
+                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                     @Override
                     public void onComplete(@NonNull Task<AuthResult> task) {
                         Log.d(TAG, "signIn:onComplete:" + task.isSuccessful());
@@ -98,7 +98,7 @@
         String password = mPasswordField.getText().toString();
 
         mAuth.createUserWithEmailAndPassword(email, password)
-                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
+                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                     @Override
                     public void onComplete(@NonNull Task<AuthResult> task) {
                         Log.d(TAG, "createUser:onComplete:" + task.isSuccessful());
