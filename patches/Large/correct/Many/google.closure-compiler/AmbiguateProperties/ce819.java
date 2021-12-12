diff --git a/src/com/google/javascript/jscomp/AmbiguateProperties.java b/src/com/google/javascript/jscomp/AmbiguateProperties.java
index c72c004..2929e04 100644
--- a/src/com/google/javascript/jscomp/AmbiguateProperties.java
+++ b/src/com/google/javascript/jscomp/AmbiguateProperties.java
@@ -240,7 +240,7 @@
       }
     }
 
-    logger.info("Collapsed " + numRenamedPropertyNames + " properties into "
+    logger.fine("Collapsed " + numRenamedPropertyNames + " properties into "
                 + numNewPropertyNames + " and skipped renaming "
                 + numSkippedPropertyNames + " properties.");
   }
