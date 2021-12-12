diff --git a/src/main/java/org/jabref/gui/autocompleter/PersonNameStringConverter.java b/src/main/java/org/jabref/gui/autocompleter/PersonNameStringConverter.java
index f9ff3de..a37ed5c 100644
--- a/src/main/java/org/jabref/gui/autocompleter/PersonNameStringConverter.java
+++ b/src/main/java/org/jabref/gui/autocompleter/PersonNameStringConverter.java
@@ -59,7 +59,7 @@
                     break;
             }
         }
-        return author.getLastFirst(false);
+        return author.getLastOnly();
     }
 
     @Override
