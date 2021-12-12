diff --git a/src/java/org/apache/nutch/service/NutchServer.java b/src/java/org/apache/nutch/service/NutchServer.java
index 16929ac..b991c3e 100644
--- a/src/java/org/apache/nutch/service/NutchServer.java
+++ b/src/java/org/apache/nutch/service/NutchServer.java
@@ -198,7 +198,7 @@
     OptionBuilder.withArgName("host");
     OptionBuilder.hasOptionalArg();
     OptionBuilder.withDescription("The host to bind the Nutch Server to. Default is localhost.");
-    options.addOption(OptionBuilder.create(CMD_PORT));
+    options.addOption(OptionBuilder.create(CMD_HOST));
 
     return options;
   }
