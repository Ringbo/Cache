diff --git a/core/src/main/scala/kafka/tools/StreamsResetter.java b/core/src/main/scala/kafka/tools/StreamsResetter.java
index 4be5f37..d2c5e14 100644
--- a/core/src/main/scala/kafka/tools/StreamsResetter.java
+++ b/core/src/main/scala/kafka/tools/StreamsResetter.java
@@ -137,7 +137,8 @@
     }
 
     private void parseArguments(final String[] args) throws IOException {
-        final OptionParser optionParser = new OptionParser();
+
+        final OptionParser optionParser = new OptionParser(false);
         applicationIdOption = optionParser.accepts("application-id", "The Kafka Streams application ID (application.id).")
             .withRequiredArg()
             .ofType(String.class)
