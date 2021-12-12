diff --git a/ext/java/nokogiri/XmlNode.java b/ext/java/nokogiri/XmlNode.java
index 1f4f891..ae43be2 100644
--- a/ext/java/nokogiri/XmlNode.java
+++ b/ext/java/nokogiri/XmlNode.java
@@ -511,7 +511,7 @@
         NamedNodeMap attrs = this.node.getAttributes();
         Node attr = attrs.getNamedItem(rubyStringToString(name));
         if(attr == null) {
-            return  context.getRuntime().newString(ERR_INSECURE_SET_INST_VAR);
+            return  context.getRuntime().getNil();
         }
         return getCachedNodeOrCreate(context.getRuntime(), attr);
     }
