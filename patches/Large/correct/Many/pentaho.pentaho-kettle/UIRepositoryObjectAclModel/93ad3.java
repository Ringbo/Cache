diff --git a/src-ui/org/pentaho/di/ui/repository/repositoryexplorer/model/UIRepositoryObjectAclModel.java b/src-ui/org/pentaho/di/ui/repository/repositoryexplorer/model/UIRepositoryObjectAclModel.java
index 94c416f..7687fe0 100644
--- a/src-ui/org/pentaho/di/ui/repository/repositoryexplorer/model/UIRepositoryObjectAclModel.java
+++ b/src-ui/org/pentaho/di/ui/repository/repositoryexplorer/model/UIRepositoryObjectAclModel.java
@@ -53,7 +53,7 @@
     previousVal.addAll(this.selectedAvailableRoles);
     this.selectedAvailableRoles.clear();
     for(Object role:selectedAvailableRoles) {
-      if(role instanceof UIRepositoryRole) {
+      if(role instanceof String) {
         this.selectedAvailableRoles.add((String) role);
       } else {
         UIRepositoryObjectAcl acl = (UIRepositoryObjectAcl) role;
@@ -74,7 +74,7 @@
     previousVal.addAll(this.selectedAvailableUsers);
     this.selectedAvailableUsers.clear();
     for(Object user:selectedAvailableUsers) {
-      if(user instanceof UIRepositoryUser) {
+      if(user instanceof String) {
         this.selectedAvailableUsers.add((String) user);
       } else {
         UIRepositoryObjectAcl acl = (UIRepositoryObjectAcl) user;
@@ -95,7 +95,7 @@
     previousVal.addAll(this.selectedAssignedRoles);
     this.selectedAssignedRoles.clear();
     for(Object role:selectedAssignedRoles) {
-      if(role instanceof UIRepositoryRole) {
+      if(role instanceof String) {
         this.selectedAssignedRoles.add(createAclFromRole((String)role));  
       } else {
         this.selectedAssignedRoles.add( (UIRepositoryObjectAcl) role);
