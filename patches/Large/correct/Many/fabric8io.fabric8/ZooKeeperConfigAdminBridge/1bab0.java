diff --git a/fabric/fabric-configadmin/src/main/java/org/fusesource/fabric/configadmin/ZooKeeperConfigAdminBridge.java b/fabric/fabric-configadmin/src/main/java/org/fusesource/fabric/configadmin/ZooKeeperConfigAdminBridge.java
index fd65a61..52b5d5c 100644
--- a/fabric/fabric-configadmin/src/main/java/org/fusesource/fabric/configadmin/ZooKeeperConfigAdminBridge.java
+++ b/fabric/fabric-configadmin/src/main/java/org/fusesource/fabric/configadmin/ZooKeeperConfigAdminBridge.java
@@ -182,7 +182,7 @@
                             value = context.getProperty(key);
                         }
                         if (value == null) {
-                            value = System.getProperty(value, "");
+                            value = System.getProperty(key, "");
                         }
                         return value;
                     }
