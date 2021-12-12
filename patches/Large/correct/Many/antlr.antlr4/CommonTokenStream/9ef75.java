diff --git a/runtime/Java/src/org/antlr/v4/runtime/CommonTokenStream.java b/runtime/Java/src/org/antlr/v4/runtime/CommonTokenStream.java
index a510bc4..fd6a8eb 100644
--- a/runtime/Java/src/org/antlr/v4/runtime/CommonTokenStream.java
+++ b/runtime/Java/src/org/antlr/v4/runtime/CommonTokenStream.java
@@ -77,7 +77,7 @@
         int i = p;
         int n = 1;
         // find k good tokens looking backwards
-        while ( n<=k ) {
+        while ( n<=k && i>0 ) {
             // skip off-channel tokens
             i = previousTokenOnChannel(i - 1, channel);
             n++;
