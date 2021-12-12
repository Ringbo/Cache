diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/config/gui/UrlConfigGui.java b/src/protocol/http/org/apache/jmeter/protocol/http/config/gui/UrlConfigGui.java
index 3544412..13eed80 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/config/gui/UrlConfigGui.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/config/gui/UrlConfigGui.java
@@ -194,7 +194,7 @@
             port.setText(portString);
         }
         protocol.setText(el.getPropertyAsString(HTTPSampler.PROTOCOL));
-        if ("POST".equals(el.getProperty(HTTPSampler.METHOD)))
+        if ("POST".equals(el.getPropertyAsString(HTTPSampler.METHOD)))
         {
             post.setSelected(true);
             get.setSelected(false);
