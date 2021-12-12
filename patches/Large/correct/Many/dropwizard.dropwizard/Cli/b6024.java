diff --git a/dropwizard-core/src/main/java/io/dropwizard/cli/Cli.java b/dropwizard-core/src/main/java/io/dropwizard/cli/Cli.java
index 3ad2965..8d6570e 100644
--- a/dropwizard-core/src/main/java/io/dropwizard/cli/Cli.java
+++ b/dropwizard-core/src/main/java/io/dropwizard/cli/Cli.java
@@ -89,7 +89,7 @@
         }
     }
 
-    private boolean isFlag(String[][] flags, String[] arguments) {
+    private static boolean isFlag(String[][] flags, String[] arguments) {
         for (String[] cmd : flags) {
             if (Arrays.equals(arguments, cmd)) {
                 return true;
