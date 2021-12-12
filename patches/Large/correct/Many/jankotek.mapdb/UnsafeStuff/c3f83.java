diff --git a/src/main/java/org/mapdb/UnsafeStuff.java b/src/main/java/org/mapdb/UnsafeStuff.java
index 72e0cb8..9a6df76 100644
--- a/src/main/java/org/mapdb/UnsafeStuff.java
+++ b/src/main/java/org/mapdb/UnsafeStuff.java
@@ -678,7 +678,7 @@
         if (len < 0) {
             throw new IllegalArgumentException("lengths must be >= 0");
         }
-        if(off<0 || off>=buf.length || off+len<0 || off+len>buf.length){
+        if(off<0 || off>buf.length || off+len<0 || off+len>buf.length){
             throw new IndexOutOfBoundsException();
         }
 
@@ -793,7 +793,7 @@
         if (len < 0) {
             throw new IllegalArgumentException("lengths must be >= 0");
         }
-        if(off<0 || off>=buf.length || off+len<0 || off+len>buf.length){
+        if(off<0 || off>buf.length || off+len<0 || off+len>buf.length){
             throw new IndexOutOfBoundsException();
         }
 
