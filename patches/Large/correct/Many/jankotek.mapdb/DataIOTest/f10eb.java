diff --git a/src/test/java/org/mapdb/DataIOTest.java b/src/test/java/org/mapdb/DataIOTest.java
index 14482a2..7406add 100644
--- a/src/test/java/org/mapdb/DataIOTest.java
+++ b/src/test/java/org/mapdb/DataIOTest.java
@@ -60,7 +60,7 @@
 
     @Test public void testSixLong(){
         byte[] b = new byte[8];
-        for(long i=0;i>>48==0;i=i+1+1/10000){
+        for(long i=0;i>>>48==0;i=i+1+1/10000){
             DataIO.putSixLong(b,2,i);
             assertEquals(i, DataIO.getSixLong(b,2));
         }
