diff --git a/source/com/intellij/psi/impl/source/xml/XmlTagImpl.java b/source/com/intellij/psi/impl/source/xml/XmlTagImpl.java
index 925f464..fc1b246 100644
--- a/source/com/intellij/psi/impl/source/xml/XmlTagImpl.java
+++ b/source/com/intellij/psi/impl/source/xml/XmlTagImpl.java
@@ -412,7 +412,7 @@
 
     for (final XmlAttribute attribute : attributes) {
       final LeafElement attrNameElement = (LeafElement)XmlChildRole.ATTRIBUTE_NAME_FINDER.findChild(attribute.getNode());
-      if (attrNameElement.getInternedText() == charTableIndex) return attribute;
+      if (attrNameElement != null && attrNameElement.getInternedText() == charTableIndex) return attribute;
     }
     return null;
   }
