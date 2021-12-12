diff --git a/ext/java/nokogiri/XmlDocumentFragment.java b/ext/java/nokogiri/XmlDocumentFragment.java
index a6dd79d..f2e636a 100644
--- a/ext/java/nokogiri/XmlDocumentFragment.java
+++ b/ext/java/nokogiri/XmlDocumentFragment.java
@@ -115,7 +115,7 @@
         // strips trailing \n off forcefully
         // not to return new object in case of no chomp needed, chomp! is used here.
         IRubyObject result;
-        if (context.getRuntime().is1_9()) result = str.chomp_bang19(context);
+        if (context.getRuntime().is1_9()) result = str.chomp19(context);
         else result = str.chomp_bang(context);
         return result.isNil() ? str : result;
     }
