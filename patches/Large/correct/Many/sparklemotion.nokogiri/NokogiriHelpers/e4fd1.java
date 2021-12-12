diff --git a/ext/java/nokogiri/internals/NokogiriHelpers.java b/ext/java/nokogiri/internals/NokogiriHelpers.java
index f618652..32cab69 100644
--- a/ext/java/nokogiri/internals/NokogiriHelpers.java
+++ b/ext/java/nokogiri/internals/NokogiriHelpers.java
@@ -548,9 +548,8 @@
     }
 
     private static boolean nodesAreEqual(Object a, Object b) {
-      return (((a == null) && (a == null)) ||
-                (a != null) && (b != null) &&
-                (b.equals(a)));
+        return (((a == null) && (b == null)) ||
+                ((a != null) && (b != null) && (b.equals(a))));
     }
 
     private static Pattern encoded_pattern = Pattern.compile("&amp;|&gt;|&lt;|&#13;");
