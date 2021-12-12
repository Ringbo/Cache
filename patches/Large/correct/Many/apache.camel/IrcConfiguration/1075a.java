diff --git a/components/camel-irc/src/main/java/org/apache/camel/component/irc/IrcConfiguration.java b/components/camel-irc/src/main/java/org/apache/camel/component/irc/IrcConfiguration.java
index a953abd..3680f3f 100644
--- a/components/camel-irc/src/main/java/org/apache/camel/component/irc/IrcConfiguration.java
+++ b/components/camel-irc/src/main/java/org/apache/camel/component/irc/IrcConfiguration.java
@@ -125,11 +125,11 @@
      * Return space separated list of channel names without pwd
      */
     public String getListOfChannels() {
-        String retval = "";
+        StringBuilder retval = new StringBuilder();
         for (IrcChannel channel : channels) {
-            retval += (retval.isEmpty() ? "" : " ") + channel.getName();
+            retval.append(retval.length() == 0 ? "" : " ").append(channel.getName());
         }
-        return retval;
+        return retval.toString();
     }
 
     public void configure(String uriStr) throws URISyntaxException, UnsupportedEncodingException  {
