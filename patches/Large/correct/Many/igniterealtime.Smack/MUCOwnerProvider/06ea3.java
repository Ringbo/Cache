diff --git a/source/org/jivesoftware/smackx/provider/MUCOwnerProvider.java b/source/org/jivesoftware/smackx/provider/MUCOwnerProvider.java
index b193d26..7822a78 100644
--- a/source/org/jivesoftware/smackx/provider/MUCOwnerProvider.java
+++ b/source/org/jivesoftware/smackx/provider/MUCOwnerProvider.java
@@ -59,7 +59,7 @@
 import org.xmlpull.v1.XmlPullParser;
 
 /**
- * Represents .....
+ * The MUCOwnerProvider parses MUCOwner packets. (@see MUCOwner)
  * 
  * @author Gaston Dombiak
  */
@@ -109,7 +109,7 @@
                     item.setActor(parser.getAttributeValue("", "jid"));
                 }
                 if (parser.getName().equals("reason")) {
-                    item.setReason(parser.getText());
+                    item.setReason(parser.nextText());
                 }
             }
             else if (eventType == XmlPullParser.END_TAG) {
@@ -129,7 +129,7 @@
             int eventType = parser.next();
             if (eventType == XmlPullParser.START_TAG) {
                 if (parser.getName().equals("reason")) {
-                    destroy.setReason(parser.getText());
+                    destroy.setReason(parser.nextText());
                 }
             }
             else if (eventType == XmlPullParser.END_TAG) {
