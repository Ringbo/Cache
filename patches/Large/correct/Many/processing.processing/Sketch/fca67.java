diff --git a/app/Sketch.java b/app/Sketch.java
index d7d80e1..cfd45ce 100644
--- a/app/Sketch.java
+++ b/app/Sketch.java
@@ -182,7 +182,7 @@
         base = base.substring(0, base.length() - 4);
       }
       if (base.endsWith(".java")) {
-        base = base.substring(0, base.length() - 4);
+        base = base.substring(0, base.length() - 5);
       }
 
       if (list[i].startsWith(".")) {
