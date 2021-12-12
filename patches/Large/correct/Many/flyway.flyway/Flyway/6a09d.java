diff --git a/flyway-core/src/main/java/com/googlecode/flyway/core/Flyway.java b/flyway-core/src/main/java/com/googlecode/flyway/core/Flyway.java
index 553d1c9..ab6585f 100644
--- a/flyway-core/src/main/java/com/googlecode/flyway/core/Flyway.java
+++ b/flyway-core/src/main/java/com/googlecode/flyway/core/Flyway.java
@@ -873,7 +873,7 @@
                 } finally {
                     if (schemaChange) {
                         // switch back to original schema only if one was defined in datasource url else keep schema[0]
-                        if(!originalSchemaUserObjects.getName().isEmpty()) {
+                        if(!originalSchemaUserObjects.getName().equals("")) {
                             dbSupportUserObjects.setCurrentSchema(originalSchemaUserObjects);
                         }
                     }
