diff --git a/liquibase-core/src/test/java/liquibase/verify/change/VerifyChangeClassesTest.java b/liquibase-core/src/test/java/liquibase/verify/change/VerifyChangeClassesTest.java
index b0434ac..02c9749 100644
--- a/liquibase-core/src/test/java/liquibase/verify/change/VerifyChangeClassesTest.java
+++ b/liquibase-core/src/test/java/liquibase/verify/change/VerifyChangeClassesTest.java
@@ -35,7 +35,7 @@
             if (changeName.equals("addDefaultValue")) {
                 continue; //need to better handle strange "one of defaultValue* is required" logic
             }
-            if (changeName.equals("changeWithNestedTags") || changeName.equals("sampleChange")) {
+            if (changeName.equals("changeWithNestedTags") || changeName.equals("sampleChange") || changeName.equals("output") ){
                 continue; //not a real change
             }
             for (Database database : DatabaseFactory.getInstance().getImplementedDatabases()) {
