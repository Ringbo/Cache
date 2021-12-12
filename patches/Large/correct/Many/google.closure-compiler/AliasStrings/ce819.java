diff --git a/src/com/google/javascript/jscomp/AliasStrings.java b/src/com/google/javascript/jscomp/AliasStrings.java
index 36ed3e9..9e7625c 100644
--- a/src/com/google/javascript/jscomp/AliasStrings.java
+++ b/src/com/google/javascript/jscomp/AliasStrings.java
@@ -110,7 +110,7 @@
 
   @Override
   public void process(Node externs, Node root) {
-    logger.info("Aliasing common strings");
+    logger.fine("Aliasing common strings");
 
     // Traverse the tree and collect strings
     NodeTraversal.traverse(compiler, root, this);
@@ -330,7 +330,7 @@
       }
     }
     // TODO(user): Make this save to file OR output to the application
-    logger.info(sb.toString());
+    logger.fine(sb.toString());
   }
 
   // -------------------------------------------------------------------------
