diff --git a/smack-extensions/src/main/java/org/jivesoftware/smackx/pubsub/AffiliationsExtension.java b/smack-extensions/src/main/java/org/jivesoftware/smackx/pubsub/AffiliationsExtension.java
index 9e4ae26..dd19877 100644
--- a/smack-extensions/src/main/java/org/jivesoftware/smackx/pubsub/AffiliationsExtension.java
+++ b/smack-extensions/src/main/java/org/jivesoftware/smackx/pubsub/AffiliationsExtension.java
@@ -63,7 +63,7 @@
         {
             // Can't use XmlStringBuilder(this), because we don't want the namespace to be included
             XmlStringBuilder xml = new XmlStringBuilder();
-            xml.openElement(getElementName());
+            xml.halfOpenElement(getElementName());
             xml.optAttribute("node", node);
             xml.rightAngleBracket();
             xml.append(items);
