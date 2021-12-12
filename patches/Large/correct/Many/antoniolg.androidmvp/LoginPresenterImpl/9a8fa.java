diff --git a/app/src/main/java/com/antonioleiva/mvpexample/app/Login/LoginPresenterImpl.java b/app/src/main/java/com/antonioleiva/mvpexample/app/Login/LoginPresenterImpl.java
index ff8bc90..554718d 100644
--- a/app/src/main/java/com/antonioleiva/mvpexample/app/Login/LoginPresenterImpl.java
+++ b/app/src/main/java/com/antonioleiva/mvpexample/app/Login/LoginPresenterImpl.java
@@ -23,7 +23,7 @@
     private LoginView loginView;
     private LoginInteractor loginInteractor;
 
-    public LoginPresenterImpl(LoginView loginView,LoginInteractorImpl loginInteractor) {
+    public LoginPresenterImpl(LoginView loginView, LoginInteractor loginInteractor) {
         this.loginView = loginView;
         this.loginInteractor = loginInteractor;
     }
