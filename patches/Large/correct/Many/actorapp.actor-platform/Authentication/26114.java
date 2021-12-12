diff --git a/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/Authentication.java b/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/Authentication.java
index 97d449a..fa988f4 100644
--- a/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/Authentication.java
+++ b/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/Authentication.java
@@ -280,7 +280,8 @@
         return new Command<AuthState>() {
             @Override
             public void start(final CommandCallback<AuthState> callback) {
-                request(new RequestSignUp(modules.getPreferences().getString(KEY_TRANSACTION_HASH), name, sex), new RpcCallback<ResponseAuth>() {
+                request(new RequestSignUp(modules.getPreferences().getString(KEY_TRANSACTION_HASH), name, sex,
+                        null), new RpcCallback<ResponseAuth>() {
                     @Override
                     public void onResult(ResponseAuth response) {
                         onLoggedIn(callback, response);
