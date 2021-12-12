diff --git a/src/java/net/sf/jabref/export/layout/LayoutHelper.java b/src/java/net/sf/jabref/export/layout/LayoutHelper.java
index f020584..8d20977 100755
--- a/src/java/net/sf/jabref/export/layout/LayoutHelper.java
+++ b/src/java/net/sf/jabref/export/layout/LayoutHelper.java
@@ -364,7 +364,7 @@
                 _eof = true;
             }
 
-            if (!Character.isLetter((char) c) && (c != '_'))
+            if (!Character.isLetter((char) c) && (c != '_') && (c != '-'))
             {
                 unread(c);
 
