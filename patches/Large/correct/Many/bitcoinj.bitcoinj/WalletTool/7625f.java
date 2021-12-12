diff --git a/tools/src/main/java/org/bitcoinj/tools/WalletTool.java b/tools/src/main/java/org/bitcoinj/tools/WalletTool.java
index b4a3ed0..1428376 100644
--- a/tools/src/main/java/org/bitcoinj/tools/WalletTool.java
+++ b/tools/src/main/java/org/bitcoinj/tools/WalletTool.java
@@ -86,7 +86,7 @@
 
     private static OptionSet options;
     private static OptionSpec<Date> dateFlag;
-    private static OptionSpec<Integer> unixtimeFlag;
+    private static OptionSpec<Long> unixtimeFlag;
     private static OptionSpec<String> seedFlag, watchFlag;
     private static OptionSpec<String> xpubkeysFlag;
 
@@ -218,7 +218,7 @@
         OptionSpec<String> outputFlag = parser.accepts("output").withRequiredArg();
         parser.accepts("value").withRequiredArg();
         parser.accepts("fee").withRequiredArg();
-        unixtimeFlag = parser.accepts("unixtime").withRequiredArg().ofType(Integer.class);
+        unixtimeFlag = parser.accepts("unixtime").withRequiredArg().ofType(Long.class);
         OptionSpec<String> conditionFlag = parser.accepts("condition").withRequiredArg();
         parser.accepts("locktime").withRequiredArg();
         parser.accepts("allow-unconfirmed");
