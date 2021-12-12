diff --git a/src/main/com/mongodb/WriteConcern.java b/src/main/com/mongodb/WriteConcern.java
index bc306d5..f23c817 100644
--- a/src/main/com/mongodb/WriteConcern.java
+++ b/src/main/com/mongodb/WriteConcern.java
@@ -242,7 +242,8 @@
     public BasicDBObject getCommand(){
         BasicDBObject _command = new BasicDBObject( "getlasterror" , 1 );
 
-        if ( _wValue instanceof Integer && ( (Integer) _wValue > 0) ){
+        if ( _wValue instanceof Integer && ( (Integer) _wValue > 0) || 
+            ( _wValue instanceof String && _wValue != null ) ){
             _command.put( "w" , _wValue );
             _command.put( "wtimeout" , _wtimeout );
         }
