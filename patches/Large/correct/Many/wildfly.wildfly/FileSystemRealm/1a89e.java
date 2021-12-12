diff --git a/testsuite/shared/src/main/java/org/wildfly/test/security/common/elytron/FileSystemRealm.java b/testsuite/shared/src/main/java/org/wildfly/test/security/common/elytron/FileSystemRealm.java
index 1013629..a574e6e 100644
--- a/testsuite/shared/src/main/java/org/wildfly/test/security/common/elytron/FileSystemRealm.java
+++ b/testsuite/shared/src/main/java/org/wildfly/test/security/common/elytron/FileSystemRealm.java
@@ -62,7 +62,7 @@
                             name, user.getName(), user.getPassword()));
             cli.sendLine(
                     String.format("/subsystem=elytron/filesystem-realm=%s/identity=%s:add-attribute(name=groups, value=[%s])",
-                            name, user.getName(), user.getPassword(), String.join(",", user.getRoles())));
+                            name, user.getName(), String.join(",", user.getRoles())));
         }
     }
 
