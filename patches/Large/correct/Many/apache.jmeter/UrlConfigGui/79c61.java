diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/config/gui/UrlConfigGui.java b/src/protocol/http/org/apache/jmeter/protocol/http/config/gui/UrlConfigGui.java
index bf88975..0fc84ff 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/config/gui/UrlConfigGui.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/config/gui/UrlConfigGui.java
@@ -199,7 +199,7 @@
              * On retrival, CRLF is converted back to LF for storage in the text field.
              * See
              */
-            HTTPArgument arg = new HTTPArgument("", text.replaceAll("\n","\r\n"), true);
+            HTTPArgument arg = new HTTPArgument("", text.replaceAll("\n","\r\n"), false);
             arg.setAlwaysEncoded(false);
             args.addArgument(arg);
         } else {
