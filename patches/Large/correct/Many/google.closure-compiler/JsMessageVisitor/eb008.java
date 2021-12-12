diff --git a/src/com/google/javascript/jscomp/JsMessageVisitor.java b/src/com/google/javascript/jscomp/JsMessageVisitor.java
index 157f1a0..f6bc02f 100644
--- a/src/com/google/javascript/jscomp/JsMessageVisitor.java
+++ b/src/com/google/javascript/jscomp/JsMessageVisitor.java
@@ -746,7 +746,7 @@
       if (!phNames.contains(phName)) {
         throw new MalformedException(
             "Unrecognized message placeholder referenced: " + phName,
-            objLitNode);
+            node);
       }
     }
 
@@ -756,7 +756,7 @@
       if (!usedPlaceholders.contains(phName)) {
         throw new MalformedException(
             "Unused message placeholder: " + phName,
-            objLitNode);
+            node);
       }
     }
   }
