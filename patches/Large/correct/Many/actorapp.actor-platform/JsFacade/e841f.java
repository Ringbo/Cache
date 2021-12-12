diff --git a/actor-sdk/sdk-core/core/core-js/src/main/java/im/actor/core/js/JsFacade.java b/actor-sdk/sdk-core/core/core-js/src/main/java/im/actor/core/js/JsFacade.java
index 0bd4b77..f0893d8 100644
--- a/actor-sdk/sdk-core/core/core-js/src/main/java/im/actor/core/js/JsFacade.java
+++ b/actor-sdk/sdk-core/core/core-js/src/main/java/im/actor/core/js/JsFacade.java
@@ -1031,7 +1031,7 @@
     }
 
     @UsedByApp
-    private JsPromise loadBlockedUsers() {
+    public JsPromise loadBlockedUsers() {
         return JsPromise.create(new JsPromiseExecutor() {
             @Override
             public void execute() {
@@ -1042,12 +1042,12 @@
                         for (User u : users) {
                             res.push(getUser(u.getUid()));
                         }
-                        resolve();
+                        resolve(res);
                     }
                 }).failure(new Consumer<Exception>() {
                     @Override
                     public void apply(Exception e) {
-                        reject();
+                        reject(e);
                     }
                 }).done(JsPromiseDispatcher.INSTANCE);
             }
