diff --git a/src/main/com/mongodb/DBCollection.java b/src/main/com/mongodb/DBCollection.java
index 7a5a1a7..797c45b 100644
--- a/src/main/com/mongodb/DBCollection.java
+++ b/src/main/com/mongodb/DBCollection.java
@@ -564,7 +564,7 @@
     public final DBObject findOne( DBObject o, DBObject fields ) {
         Iterator<DBObject> i = __find( o , fields , 0 , -1 , 0, getOptions() );
         DBObject obj = (i == null ? null : i.next());
-        if ( fields != null && fields.keySet().size() > 0 ){
+        if ( obj != null && ( fields != null && fields.keySet().size() > 0 ) ){
             obj.markAsPartialObject();
         }
         return obj;
