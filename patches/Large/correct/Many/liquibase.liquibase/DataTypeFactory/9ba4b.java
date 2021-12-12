diff --git a/liquibase-core/src/main/java/liquibase/datatype/DataTypeFactory.java b/liquibase-core/src/main/java/liquibase/datatype/DataTypeFactory.java
index 13873db..cc5d503 100644
--- a/liquibase-core/src/main/java/liquibase/datatype/DataTypeFactory.java
+++ b/liquibase-core/src/main/java/liquibase/datatype/DataTypeFactory.java
@@ -45,7 +45,7 @@
         return instance;
     }
 
-    public static void reset() {
+    public static synchronized void reset() {
         instance = new DataTypeFactory();
     }
 
