diff --git a/src/main/org/bson/BasicBSONCallback.java b/src/main/org/bson/BasicBSONCallback.java
index d01d831..625ccc6 100644
--- a/src/main/org/bson/BasicBSONCallback.java
+++ b/src/main/org/bson/BasicBSONCallback.java
@@ -136,7 +136,7 @@
     }
     
     public void gotBinary( String name , byte type , byte[] data ){
-        if( type == BSON.B_GENERAL )
+        if( type == BSON.B_GENERAL || type == BSON.B_BINARY )
             _put( name , data );
         else
             _put( name , new Binary( type , data ) );
