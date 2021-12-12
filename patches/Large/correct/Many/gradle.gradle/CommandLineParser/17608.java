diff --git a/subprojects/cli/src/main/java/org/gradle/cli/CommandLineParser.java b/subprojects/cli/src/main/java/org/gradle/cli/CommandLineParser.java
index 3996137..b124fc3 100644
--- a/subprojects/cli/src/main/java/org/gradle/cli/CommandLineParser.java
+++ b/subprojects/cli/src/main/java/org/gradle/cli/CommandLineParser.java
@@ -64,7 +64,7 @@
     }
 
     public CommandLineParser(Writer deprecationPrinter) {
-        this.deprecationPrinter = new PrintWriter(deprecationPrinter);
+        this.deprecationPrinter = new PrintWriter(deprecationPrinter, true);
     }
 
     /**
