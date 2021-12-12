diff --git a/app/src/main/java/com/kickstarter/viewmodels/TwoFactorViewModel.java b/app/src/main/java/com/kickstarter/viewmodels/TwoFactorViewModel.java
index a9b1eb7..227a00b 100644
--- a/app/src/main/java/com/kickstarter/viewmodels/TwoFactorViewModel.java
+++ b/app/src/main/java/com/kickstarter/viewmodels/TwoFactorViewModel.java
@@ -170,7 +170,7 @@
       .compose(Transformers.pipeApiErrorsTo(tfaError))
       .compose(Transformers.neverError())
       .doOnSubscribe(() -> formSubmitting.onNext(true))
-      .finallyDo(() -> formSubmitting.onNext(false));
+      .doAfterTerminate(() -> formSubmitting.onNext(false));
   }
 
   public Observable<AccessTokenEnvelope> loginWithFacebook(final @NonNull String code, final @NonNull String fbAccessToken) {
@@ -178,7 +178,7 @@
       .compose(Transformers.pipeApiErrorsTo(tfaError))
       .compose(Transformers.neverError())
       .doOnSubscribe(() -> formSubmitting.onNext(true))
-      .finallyDo(() -> formSubmitting.onNext(false));
+      .doAfterTerminate(() -> formSubmitting.onNext(false));
   }
 
   private Observable<AccessTokenEnvelope> resendCode(final @NonNull String email, final @NonNull String password) {
