diff --git a/smack-extensions/src/main/java/org/jivesoftware/smackx/bookmarks/Bookmarks.java b/smack-extensions/src/main/java/org/jivesoftware/smackx/bookmarks/Bookmarks.java
index 10fdb2c..6c1dfe5 100644
--- a/smack-extensions/src/main/java/org/jivesoftware/smackx/bookmarks/Bookmarks.java
+++ b/smack-extensions/src/main/java/org/jivesoftware/smackx/bookmarks/Bookmarks.java
@@ -169,13 +169,13 @@
     @Override
     public XmlStringBuilder toXML() {
         XmlStringBuilder buf = new XmlStringBuilder();
-        buf.openElement(ELEMENT).xmlnsAttribute(NAMESPACE);
+        buf.halfOpenElement(ELEMENT).xmlnsAttribute(NAMESPACE).rightAngelBracket();
 
         for (BookmarkedURL urlStorage : getBookmarkedURLS()) {
             if(urlStorage.isShared()) {
                 continue;
             }
-            buf.openElement("url").attribute("name", urlStorage.getName()).attribute("url", urlStorage.getURL());
+            buf.halfOpenElement("url").attribute("name", urlStorage.getName()).attribute("url", urlStorage.getURL());
             buf.condAttribute(urlStorage.isRss(), "rss", "true");
             buf.closeEmptyElement();
         }
@@ -185,7 +185,7 @@
             if(conference.isShared()) {
                 continue;
             }
-            buf.openElement("conference");
+            buf.halfOpenElement("conference");
             buf.attribute("name", conference.getName());
             buf.attribute("autojoin", Boolean.toString(conference.isAutoJoin()));
             buf.attribute("jid", conference.getJid());
