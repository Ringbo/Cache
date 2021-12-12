diff --git a/ext/java/nokogiri/XmlDocument.java b/ext/java/nokogiri/XmlDocument.java
index 60f3417..425788c 100644
--- a/ext/java/nokogiri/XmlDocument.java
+++ b/ext/java/nokogiri/XmlDocument.java
@@ -288,7 +288,7 @@
 
     @JRubyMethod
     public IRubyObject encoding(ThreadContext context) {
-        if (this.encoding == null) {
+        if (this.encoding == null || this.encoding.isNil()) {
             if (getDocument().getXmlEncoding() == null) {
                 this.encoding = context.getRuntime().getNil();
             } else {
