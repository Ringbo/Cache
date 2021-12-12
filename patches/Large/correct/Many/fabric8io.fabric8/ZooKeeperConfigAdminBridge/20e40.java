diff --git a/fabric/fabric-configadmin/src/main/java/org/fusesource/fabric/configadmin/ZooKeeperConfigAdminBridge.java b/fabric/fabric-configadmin/src/main/java/org/fusesource/fabric/configadmin/ZooKeeperConfigAdminBridge.java
index 2f73ec3..da110e2 100644
--- a/fabric/fabric-configadmin/src/main/java/org/fusesource/fabric/configadmin/ZooKeeperConfigAdminBridge.java
+++ b/fabric/fabric-configadmin/src/main/java/org/fusesource/fabric/configadmin/ZooKeeperConfigAdminBridge.java
@@ -180,7 +180,7 @@
                             value = context.getProperty(key);
                         }
                         if (value == null) {
-                            value = System.getProperty(value, "");
+                            value = System.getProperty(key, "");
                         }
                         return value;
                     }
