diff --git a/languagetool-wikipedia/src/main/java/org/languagetool/dev/wikipedia/TextConverter.java b/languagetool-wikipedia/src/main/java/org/languagetool/dev/wikipedia/TextConverter.java
index 6534d3a..3b3427f 100644
--- a/languagetool-wikipedia/src/main/java/org/languagetool/dev/wikipedia/TextConverter.java
+++ b/languagetool-wikipedia/src/main/java/org/languagetool/dev/wikipedia/TextConverter.java
@@ -158,7 +158,7 @@
 
     public void visit(ItemizationItem i)
     {
-        newline(1);
+        newline(2);
         iterate(i.getContent());
     }
     
@@ -169,7 +169,7 @@
 
     public void visit(EnumerationItem item)
     {
-        newline(1);
+        newline(2);
         iterate(item.getContent());
     }
     
