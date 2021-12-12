diff --git a/lib/src/main/java/app/philm/in/controllers/UserController.java b/lib/src/main/java/app/philm/in/controllers/UserController.java
index cbbe1a6..e8e3313 100644
--- a/lib/src/main/java/app/philm/in/controllers/UserController.java
+++ b/lib/src/main/java/app/philm/in/controllers/UserController.java
@@ -333,9 +333,9 @@
         }
 
         @Override
-        public String doBackgroundCall() {
+        public Response doBackgroundCall() {
             mTraktClient.setAuthentication(mUsername, mPassword);
-            return mTraktClient.accountService().test().status;
+            return mTraktClient.accountService().test();
         }
     }
 
