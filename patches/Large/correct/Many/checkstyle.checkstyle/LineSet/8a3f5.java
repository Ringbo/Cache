diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/LineSet.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/LineSet.java
index 402f2b4..e1e48d0 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/LineSet.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/LineSet.java
@@ -51,7 +51,7 @@
      * @return the starting column for the first line.
      */
     public int firstLineCol() {
-        final Object firstLineKey = lines.firstKey();
+        final Integer firstLineKey = lines.firstKey();
         return lines.get(firstLineKey);
     }
 
