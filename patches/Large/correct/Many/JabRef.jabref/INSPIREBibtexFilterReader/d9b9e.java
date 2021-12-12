diff --git a/src/main/java/net/sf/jabref/imports/INSPIREBibtexFilterReader.java b/src/main/java/net/sf/jabref/imports/INSPIREBibtexFilterReader.java
index d579c66..cd2f78a 100644
--- a/src/main/java/net/sf/jabref/imports/INSPIREBibtexFilterReader.java
+++ b/src/main/java/net/sf/jabref/imports/INSPIREBibtexFilterReader.java
@@ -57,11 +57,11 @@
             if (l == null) {
                 return null;
             }
-            if (l.equals("<pre>")) {
+            if (l.contains("<pre>")) {
                 pre = true;
                 l = in.readLine();
             }
-            if (l.equals("</pre>")) {
+            if (l.contains("</pre>")) {
                 pre = false;
             }
         } while (!pre);
