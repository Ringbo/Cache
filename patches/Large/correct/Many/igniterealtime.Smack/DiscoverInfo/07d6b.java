diff --git a/smack-extensions/src/main/java/org/jivesoftware/smackx/disco/packet/DiscoverInfo.java b/smack-extensions/src/main/java/org/jivesoftware/smackx/disco/packet/DiscoverInfo.java
index 512dfda..135f9d8 100644
--- a/smack-extensions/src/main/java/org/jivesoftware/smackx/disco/packet/DiscoverInfo.java
+++ b/smack-extensions/src/main/java/org/jivesoftware/smackx/disco/packet/DiscoverInfo.java
@@ -327,7 +327,7 @@
             xml.halfOpenElement("identity");
             xml.xmllangAttribute(lang);
             xml.attribute("category", category);
-            xml.attribute("name", name);
+            xml.optAttribute("name", name);
             xml.optAttribute("type", type);
             xml.closeEmptyElement();
             return xml;
