diff --git a/app/src/processing/app/syntax/Brackets.java b/app/src/processing/app/syntax/Brackets.java
index 2d7bcaa..d351ef6 100644
--- a/app/src/processing/app/syntax/Brackets.java
+++ b/app/src/processing/app/syntax/Brackets.java
@@ -51,7 +51,7 @@
       return -1;
     }
 
-    if (offsets == null)
+    if (offsets == null || offsets.get(offsets.size()-1) >= text.length())
       parse(text);
     
     // find this bracket
