diff --git a/src/java/org/apache/cassandra/auth/CassandraRoleManager.java b/src/java/org/apache/cassandra/auth/CassandraRoleManager.java
index 261631d..802ae3c 100644
--- a/src/java/org/apache/cassandra/auth/CassandraRoleManager.java
+++ b/src/java/org/apache/cassandra/auth/CassandraRoleManager.java
@@ -43,7 +43,7 @@
 import org.mindrot.jbcrypt.BCrypt;
 
 /**
- * Responsible for the creation, maintainance and delation of roles
+ * Responsible for the creation, maintenance and deletion of roles
  * for the purposes of authentication and authorization.
  * Role data is stored internally, using the roles and role_members tables
  * in the system_auth keyspace.
@@ -65,7 +65,7 @@
  * extends CassandraRoleManager and which includes Option.PASSWORD in the Set<Option>
  * returned from supportedOptions/alterableOptions. Any additional processing
  * of the password itself (such as storing it in an alternative location) would
- * be added in overriden createRole and alterRole implementations.
+ * be added in overridden createRole and alterRole implementations.
  */
 public class CassandraRoleManager implements IRoleManager
 {
@@ -437,7 +437,7 @@
         for (String memberOf : role.memberOf)
         {
             Role granted = getRole(memberOf);
-            if (role.equals(NULL_ROLE))
+            if (granted.equals(NULL_ROLE))
                 continue;
             collected.add(RoleResource.role(granted.name));
             if (includeInherited)
