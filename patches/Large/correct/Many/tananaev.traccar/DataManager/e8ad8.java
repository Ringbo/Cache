diff --git a/src/org/traccar/database/DataManager.java b/src/org/traccar/database/DataManager.java
index 3c26685..ae5ec2d 100644
--- a/src/org/traccar/database/DataManager.java
+++ b/src/org/traccar/database/DataManager.java
@@ -295,7 +295,8 @@
                     config.getString("database.url"),
                     config.getString("database.user"),
                     config.getString("database.password"),
-                    null, resourceAccessor);
+                    config.getString("database.driver"),
+                    null, null, null, resourceAccessor);
 
             Liquibase liquibase = new Liquibase(
                     config.getString("database.changelog"), resourceAccessor, database);
