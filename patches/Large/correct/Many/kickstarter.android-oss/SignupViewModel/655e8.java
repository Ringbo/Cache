diff --git a/app/src/main/java/com/kickstarter/viewmodels/SignupViewModel.java b/app/src/main/java/com/kickstarter/viewmodels/SignupViewModel.java
index 391f89a..54914b2 100644
--- a/app/src/main/java/com/kickstarter/viewmodels/SignupViewModel.java
+++ b/app/src/main/java/com/kickstarter/viewmodels/SignupViewModel.java
@@ -154,7 +154,7 @@
       .compose(Transformers.pipeApiErrorsTo(signupError))
       .compose(Transformers.neverError())
       .doOnSubscribe(() -> formSubmitting.onNext(true))
-      .finallyDo(() -> formSubmitting.onNext(false));
+      .doAfterTerminate(() -> formSubmitting.onNext(false));
   }
 
   private void success(final @NonNull AccessTokenEnvelope envelope) {
