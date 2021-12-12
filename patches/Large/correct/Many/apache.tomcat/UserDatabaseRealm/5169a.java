diff --git a/java/org/apache/catalina/realm/UserDatabaseRealm.java b/java/org/apache/catalina/realm/UserDatabaseRealm.java
index af32b51..e2e469d 100644
--- a/java/org/apache/catalina/realm/UserDatabaseRealm.java
+++ b/java/org/apache/catalina/realm/UserDatabaseRealm.java
@@ -223,7 +223,7 @@
         Iterator groups = user.getGroups();
         while(groups.hasNext()) {
             Group group = (Group)groups.next();
-            uroles = user.getRoles();
+            uroles = group.getRoles();
             while(uroles.hasNext()) {
                 Role role = (Role)uroles.next();
                 roles.add(role.getName());
