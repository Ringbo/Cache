diff --git a/src/main/com/mongodb/DBApiLayer.java b/src/main/com/mongodb/DBApiLayer.java
index 4bce3ec..5f78c33 100644
--- a/src/main/com/mongodb/DBApiLayer.java
+++ b/src/main/com/mongodb/DBApiLayer.java
@@ -238,7 +238,7 @@
             if ( res.size() == 1 ){
                 BSONObject foo = res.get(0);
                 MongoException e = MongoException.parse( foo );
-                if ( e != null )
+                if ( e != null && ! _name.equals( "$cmd" ) )
                     throw e;
             }
             
