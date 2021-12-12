diff --git a/app/controllers/UsersController.java b/app/controllers/UsersController.java
index 0bb5ac5..487b8ef 100644
--- a/app/controllers/UsersController.java
+++ b/app/controllers/UsersController.java
@@ -340,7 +340,7 @@
         user.update(changeRequest);
 
         flash("success", "User '" + user.getFullName() + "' was updated successfully");
-        return redirect(routes.UsersController.index());
+        return redirect(routes.UsersController.editUserForm(username));
     }
 
     private boolean checkRequireOldPassword(String username) {
