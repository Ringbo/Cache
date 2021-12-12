diff --git a/liquibase-core/src/main/java/liquibase/structure/core/DatabaseObjectFactory.java b/liquibase-core/src/main/java/liquibase/structure/core/DatabaseObjectFactory.java
index da45ee5..812b193 100644
--- a/liquibase-core/src/main/java/liquibase/structure/core/DatabaseObjectFactory.java
+++ b/liquibase-core/src/main/java/liquibase/structure/core/DatabaseObjectFactory.java
@@ -15,7 +15,7 @@
     private static DatabaseObjectFactory instance;
     private Set<Class<? extends DatabaseObject>> standardTypes;
 
-    public static DatabaseObjectFactory getInstance() {
+    public static synchronized DatabaseObjectFactory getInstance() {
         if (instance == null) {
             instance = new DatabaseObjectFactory();
         }
