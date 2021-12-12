diff --git a/presto-main/src/main/java/com/facebook/presto/Main.java b/presto-main/src/main/java/com/facebook/presto/Main.java
index 21c63f0..3cf8ec6 100644
--- a/presto-main/src/main/java/com/facebook/presto/Main.java
+++ b/presto-main/src/main/java/com/facebook/presto/Main.java
@@ -24,12 +24,12 @@
     public static void main(String[] args)
             throws Exception
     {
-        CliBuilder<Runnable> builder = Cli.buildCli("presto", Runnable.class)
+        CliBuilder<Runnable> builder = Cli.<Runnable>builder("presto")
                 .withDefaultCommand(Server.class)
                 .withCommand(Server.class)
                 .withCommand(Execute.class)
                 .withCommand(Console.class)
-                .withCommands(Help.class);
+                .withCommand(Help.class);
 
         builder.withGroup("convert")
                 .withDescription("convert file formats")
