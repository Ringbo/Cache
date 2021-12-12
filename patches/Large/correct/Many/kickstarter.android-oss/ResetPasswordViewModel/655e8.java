diff --git a/app/src/main/java/com/kickstarter/viewmodels/ResetPasswordViewModel.java b/app/src/main/java/com/kickstarter/viewmodels/ResetPasswordViewModel.java
index 88aaa2a..6563e8c 100644
--- a/app/src/main/java/com/kickstarter/viewmodels/ResetPasswordViewModel.java
+++ b/app/src/main/java/com/kickstarter/viewmodels/ResetPasswordViewModel.java
@@ -94,7 +94,7 @@
       .compose(Transformers.pipeApiErrorsTo(resetError))
       .compose(Transformers.neverError())
       .doOnSubscribe(() -> isFormSubmitting.onNext(true))
-      .finallyDo(() -> isFormSubmitting.onNext(false));
+      .doAfterTerminate(() -> isFormSubmitting.onNext(false));
   }
 
   private void success() {
