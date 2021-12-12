diff --git a/sonar-db/src/test/java/org/sonar/db/version/v60/AddBColumnsToProjectsTest.java b/sonar-db/src/test/java/org/sonar/db/version/v60/AddBColumnsToProjectsTest.java
index bb4cd65..835582c 100644
--- a/sonar-db/src/test/java/org/sonar/db/version/v60/AddBColumnsToProjectsTest.java
+++ b/sonar-db/src/test/java/org/sonar/db/version/v60/AddBColumnsToProjectsTest.java
@@ -86,6 +86,6 @@
     db.assertColumnDefinition(TABLE, "b_module_uuid_path", Types.VARCHAR, 1500, true);
     db.assertColumnDefinition(TABLE, "b_name", Types.VARCHAR, 500, true);
     db.assertColumnDefinition(TABLE, "b_path", Types.VARCHAR, 2000, true);
-    db.assertColumnDefinition(TABLE, "b_qualifier", Types.VARCHAR, 3, true);
+    db.assertColumnDefinition(TABLE, "b_qualifier", Types.VARCHAR, 10, true);
   }
 }
