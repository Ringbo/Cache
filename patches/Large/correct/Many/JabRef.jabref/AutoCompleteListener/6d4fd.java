diff --git a/src/java/net/sf/jabref/gui/AutoCompleteListener.java b/src/java/net/sf/jabref/gui/AutoCompleteListener.java
index 7ca9197..9deb062 100644
--- a/src/java/net/sf/jabref/gui/AutoCompleteListener.java
+++ b/src/java/net/sf/jabref/gui/AutoCompleteListener.java
@@ -90,7 +90,7 @@
                 }
             }
 
-            if ((toSetIn != null) && ((toSetIn.length() < 1) ||
+            if ((toSetIn != null) && ((toSetIn.length() <= 1) ||
                     (ch != toSetIn.charAt(1)))) {
                 // User discontinues the word that was suggested.
                 lastBeginning = lastBeginning + ch;
