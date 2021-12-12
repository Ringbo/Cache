diff --git a/src/main/com/mongodb/ByteEncoder.java b/src/main/com/mongodb/ByteEncoder.java
index f20b3f1..558870c 100644
--- a/src/main/com/mongodb/ByteEncoder.java
+++ b/src/main/com/mongodb/ByteEncoder.java
@@ -360,7 +360,7 @@
         _buf.putInt( 0 );
         _putValueString( code._code );
         putObject( code._scope );
-        _buf.putInt( temp , _buf.position() - start );
+        _buf.putInt( temp , _buf.position() - temp );
         return _buf.position() - start;        
     }
 
