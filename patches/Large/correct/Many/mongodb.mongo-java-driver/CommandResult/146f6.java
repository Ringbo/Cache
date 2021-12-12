diff --git a/src/main/com/mongodb/CommandResult.java b/src/main/com/mongodb/CommandResult.java
index c70844f..df13f80 100644
--- a/src/main/com/mongodb/CommandResult.java
+++ b/src/main/com/mongodb/CommandResult.java
@@ -50,7 +50,7 @@
 
     static class CommandFailure extends MongoException {
         CommandFailure( CommandResult res , String msg ){
-            super( ServerError._getCode( res ) , msg );
+            super( ServerError.getCode( res ) , msg );
         }
     }
 }
