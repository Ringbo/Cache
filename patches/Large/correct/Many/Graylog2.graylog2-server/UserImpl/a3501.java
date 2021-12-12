diff --git a/graylog2-server/src/main/java/org/graylog2/users/UserImpl.java b/graylog2-server/src/main/java/org/graylog2/users/UserImpl.java
index dba58f8..9f6e4ed 100644
--- a/graylog2-server/src/main/java/org/graylog2/users/UserImpl.java
+++ b/graylog2-server/src/main/java/org/graylog2/users/UserImpl.java
@@ -180,7 +180,7 @@
         final List<String> perms = Lists.newArrayList(permissions);
         // Do not store the dynamic user self edit permissions
         perms.removeAll(this.permissions.userSelfEditPermissions(getName()));
-        fields.put(PERMISSIONS, permissions);
+        fields.put(PERMISSIONS, perms);
     }
 
     @Override
