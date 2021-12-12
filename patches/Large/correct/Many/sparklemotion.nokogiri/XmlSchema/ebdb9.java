diff --git a/ext/java/nokogiri/XmlSchema.java b/ext/java/nokogiri/XmlSchema.java
index 1a35f78..0f827a6 100644
--- a/ext/java/nokogiri/XmlSchema.java
+++ b/ext/java/nokogiri/XmlSchema.java
@@ -171,7 +171,7 @@
         Ruby ruby = context.getRuntime();
 
         XmlDomParserContext ctx = new XmlDomParserContext(ruby, RubyFixnum.newFixnum(ruby, 1L));
-        ctx.setInputSource(context, file, context.getRuntime().getNil());
+        ctx.setInputSourceFile(context, file);
         XmlDocument xmlDocument = ctx.parse(context, getNokogiriClass(ruby, "Nokogiri::XML::Document"), ruby.getNil());
         return validate_document_or_file(context, xmlDocument);
     }
