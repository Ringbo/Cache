diff --git a/src/main/java/org/mapdb/DataIO.java b/src/main/java/org/mapdb/DataIO.java
index 6f00411..8dfb463 100644
--- a/src/main/java/org/mapdb/DataIO.java
+++ b/src/main/java/org/mapdb/DataIO.java
@@ -1491,7 +1491,8 @@
         if (len < 0) {
             throw new IllegalArgumentException("lengths must be >= 0");
         }
-        if(off<0 || off>=buf.length || off+len<0 || off+len>buf.length){
+
+        if(off<0 || off>buf.length || off+len<0 || off+len>buf.length){
             throw new IndexOutOfBoundsException();
         }
 
@@ -1603,7 +1604,7 @@
         if (len < 0) {
             throw new IllegalArgumentException("lengths must be >= 0");
         }
-        if(off<0 || off>=buf.length || off+len<0 || off+len>buf.length){
+        if(off<0 || off>buf.length || off+len<0 || off+len>buf.length){
             throw new IndexOutOfBoundsException();
         }
 
