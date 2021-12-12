diff --git a/actor-apps/core-js/src/main/java/im/actor/model/js/JsFacade.java b/actor-apps/core-js/src/main/java/im/actor/model/js/JsFacade.java
index c90151a..c4b6ac7 100644
--- a/actor-apps/core-js/src/main/java/im/actor/model/js/JsFacade.java
+++ b/actor-apps/core-js/src/main/java/im/actor/model/js/JsFacade.java
@@ -116,7 +116,7 @@
                            final JsAuthErrorClosure error) {
         try {
             long res = Long.parseLong(phone);
-            messenger.requestSms(res).start(new CommandCallback<AuthState>() {
+            messenger.requestSmsObsolete(res).start(new CommandCallback<AuthState>() {
                 @Override
                 public void onResult(AuthState res) {
                     success.onResult(Enums.convert(res));
@@ -151,7 +151,7 @@
                          final JsAuthErrorClosure error) {
         try {
             int res = Integer.parseInt(code);
-            messenger.sendCode(res).start(new CommandCallback<AuthState>() {
+            messenger.sendCodeObsolete(res).start(new CommandCallback<AuthState>() {
                 @Override
                 public void onResult(AuthState res) {
                     success.onResult(Enums.convert(res));
@@ -184,7 +184,7 @@
 
     public void signUp(String name, final JsAuthSuccessClosure success,
                        final JsAuthErrorClosure error) {
-        messenger.signUp(name, null, false).start(new CommandCallback<AuthState>() {
+        messenger.signUpObsolete(name, null, false).start(new CommandCallback<AuthState>() {
             @Override
             public void onResult(AuthState res) {
                 success.onResult(Enums.convert(res));
