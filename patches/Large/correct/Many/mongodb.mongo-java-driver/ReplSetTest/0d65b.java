diff --git a/src/test/com/mongodb/ReplSetTest.java b/src/test/com/mongodb/ReplSetTest.java
index f4db1d8..fec41ab 100644
--- a/src/test/com/mongodb/ReplSetTest.java
+++ b/src/test/com/mongodb/ReplSetTest.java
@@ -85,8 +85,7 @@
         while ( true ){
             _sleep();
             try {
-                DBObject x = c.findOne(new BasicDBObject( "_id", 17 ), null,
-                                       ReadPreference.withTags( new BasicDBObject("dc", "proximacentauri") ));
+                DBObject x = c.findOne(new BasicDBObject( "_id", 17 ), null);
                 System.out.println( x );
                 Integer n = (Integer) x.get( "x" );
                 if (n != null && n >= 150 )
