diff --git a/jetty-util/src/main/java/org/eclipse/jetty/util/QuotedStringTokenizer.java b/jetty-util/src/main/java/org/eclipse/jetty/util/QuotedStringTokenizer.java
index 3db458b..da14280 100644
--- a/jetty-util/src/main/java/org/eclipse/jetty/util/QuotedStringTokenizer.java
+++ b/jetty-util/src/main/java/org/eclipse/jetty/util/QuotedStringTokenizer.java
@@ -316,10 +316,10 @@
 
     }
 
-    private static final char[] escapes = new char[31];
+    private static final char[] escapes = new char[32];
     static
     {
-        Arrays.fill(escapes, (char)-1);
+        Arrays.fill(escapes, (char)0xFFFF);
         escapes['\b'] = 'b';
         escapes['\t'] = 't';
         escapes['\n'] = 'n';
@@ -350,10 +350,10 @@
                 else
                 {
                     char escape = escapes[c];
-                    if (escape == -1)
+                    if (escape == 0xFFFF)
                     {
                         // Unicode escape
-                        buffer.append('\\').append('0').append('0');
+                        buffer.append('\\').append('u').append('0').append('0');
                         if (c < 0x10)
                             buffer.append('0');
                         buffer.append(Integer.toString(c, 16));
