diff --git a/doc/ref/examples/src/com/tightdb/refdoc/DynTableViewExamples.java b/doc/ref/examples/src/com/tightdb/refdoc/DynTableViewExamples.java
index bbbf731..0ae3b59 100644
--- a/doc/ref/examples/src/com/tightdb/refdoc/DynTableViewExamples.java
+++ b/doc/ref/examples/src/com/tightdb/refdoc/DynTableViewExamples.java
@@ -461,16 +461,17 @@
         table.add("user7", 420, true);
         table.add("user8", 770, true);
 
-        TableView view = table.where().findAll();
+        // Query the table to get a view of all users with a score above 500
+        TableView view = table.where().greaterThan(1, 500).findAll();
         
         // Get a query from the view
         TableQuery query = view.where();
         
-        // Use the query object to query the table and get a table view with the results
+        // Use the query object to query the view and get a new view with the results
         TableView results = query.equalTo(2, false).findAll();
 
         // Check that resulting view has 5 rows
-        Assert(results.size() == 5);
+        Assert(results.size() == 3);
         // @@EndShow@@
         // @@EndExample@@
     }
