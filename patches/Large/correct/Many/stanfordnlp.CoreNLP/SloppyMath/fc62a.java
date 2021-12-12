diff --git a/src/edu/stanford/nlp/math/SloppyMath.java b/src/edu/stanford/nlp/math/SloppyMath.java
index 0daa3cb..97b2462 100644
--- a/src/edu/stanford/nlp/math/SloppyMath.java
+++ b/src/edu/stanford/nlp/math/SloppyMath.java
@@ -351,7 +351,7 @@
       if (e == 1) {
         return b;
       } else {
-        return 0; // this is also what you get for e < 0 !
+        return 1; // this is also what you get for e < 0 !
       }
     } else {
       if (e == 2) {
