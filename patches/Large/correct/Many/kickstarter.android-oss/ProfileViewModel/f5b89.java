diff --git a/app/src/main/java/com/kickstarter/viewmodels/ProfileViewModel.java b/app/src/main/java/com/kickstarter/viewmodels/ProfileViewModel.java
index 3089f08..d22b23c 100644
--- a/app/src/main/java/com/kickstarter/viewmodels/ProfileViewModel.java
+++ b/app/src/main/java/com/kickstarter/viewmodels/ProfileViewModel.java
@@ -46,7 +46,7 @@
     return projects;
   }
   @Override public Observable<User> user() {
-    return currentUser.observable();
+    return currentUser.loggedInUser();
   }
   private final PublishSubject<Project> showProject = PublishSubject.create();
   @Override
