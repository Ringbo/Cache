diff --git a/sql/src/main/java/org/cratedb/sql/TableAlreadyExistsException.java b/sql/src/main/java/org/cratedb/sql/TableAlreadyExistsException.java
index 7ee52ed..91849c3 100644
--- a/sql/src/main/java/org/cratedb/sql/TableAlreadyExistsException.java
+++ b/sql/src/main/java/org/cratedb/sql/TableAlreadyExistsException.java
@@ -2,13 +2,6 @@
 
 import org.elasticsearch.rest.RestStatus;
 
-/**
- * Created with IntelliJ IDEA.
- * User: max
- * Date: 10/17/13
- * Time: 8:38 AM
- * To change this template use File | Settings | File Templates.
- */
 public class TableAlreadyExistsException extends CrateException {
 
     public TableAlreadyExistsException(String msg, Throwable e) {
@@ -17,7 +10,7 @@
 
     @Override
     public int errorCode() {
-        return 4090;
+        return 4093;
     }
 
     @Override
