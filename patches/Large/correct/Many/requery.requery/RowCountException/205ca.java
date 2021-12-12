diff --git a/requery/src/main/java/io/requery/sql/RowCountException.java b/requery/src/main/java/io/requery/sql/RowCountException.java
index b9799da..69d1a97 100644
--- a/requery/src/main/java/io/requery/sql/RowCountException.java
+++ b/requery/src/main/java/io/requery/sql/RowCountException.java
@@ -30,7 +30,7 @@
     RowCountException(long expected, long actual) {
         super("Expected " + expected + " row affected actual " + actual);
         this.expected = expected;
-        this.actual = expected;
+        this.actual = actual;
     }
 
     /**
