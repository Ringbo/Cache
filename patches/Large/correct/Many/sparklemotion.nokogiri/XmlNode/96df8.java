diff --git a/ext/java/nokogiri/XmlNode.java b/ext/java/nokogiri/XmlNode.java
index c0ddfb4..49dbbef 100644
--- a/ext/java/nokogiri/XmlNode.java
+++ b/ext/java/nokogiri/XmlNode.java
@@ -1275,7 +1275,7 @@
         relink_namespace(context);
         // post_add_child(context, this, other);
 
-        return this;
+        return other;
     }
 
     protected void adoptAsChild(ThreadContext context, Node parent,
