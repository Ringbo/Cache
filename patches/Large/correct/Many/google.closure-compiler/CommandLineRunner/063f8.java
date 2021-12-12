diff --git a/src/com/google/javascript/jscomp/CommandLineRunner.java b/src/com/google/javascript/jscomp/CommandLineRunner.java
index bb992ef..7ef7bd2 100644
--- a/src/com/google/javascript/jscomp/CommandLineRunner.java
+++ b/src/com/google/javascript/jscomp/CommandLineRunner.java
@@ -1165,7 +1165,7 @@
     // Args4j has a different format that the old command-line parser.
     // So we use some voodoo to get the args into the format that args4j
     // expects.
-    Pattern argPattern = Pattern.compile("(--?[a-zA-Z_]+)=(.*)");
+    Pattern argPattern = Pattern.compile("(--?[a-zA-Z_]+)=(.*)", Pattern.DOTALL);
     Pattern quotesPattern = Pattern.compile("^['\"](.*)['\"]$");
     List<String> processedArgs = new ArrayList<>();
 
