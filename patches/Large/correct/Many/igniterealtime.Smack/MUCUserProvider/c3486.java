diff --git a/source/org/jivesoftware/smackx/provider/MUCUserProvider.java b/source/org/jivesoftware/smackx/provider/MUCUserProvider.java
index bcb2146..ed6913c 100644
--- a/source/org/jivesoftware/smackx/provider/MUCUserProvider.java
+++ b/source/org/jivesoftware/smackx/provider/MUCUserProvider.java
@@ -92,7 +92,7 @@
                     mucUser.setItem(parseItem(parser));
                 }
                 if (parser.getName().equals("password")) {
-                    mucUser.setPassword(parser.getText());
+                    mucUser.setPassword(parser.nextText());
                 }
                 if (parser.getName().equals("status")) {
                     mucUser.setStatus(new MUCUser.Status(parser.getAttributeValue("", "code")));
@@ -129,7 +129,7 @@
                     item.setActor(parser.getAttributeValue("", "jid"));
                 }
                 if (parser.getName().equals("reason")) {
-                    item.setReason(parser.getText());
+                    item.setReason(parser.nextText());
                 }
             }
             else if (eventType == XmlPullParser.END_TAG) {
@@ -150,7 +150,7 @@
             int eventType = parser.next();
             if (eventType == XmlPullParser.START_TAG) {
                 if (parser.getName().equals("reason")) {
-                    invite.setReason(parser.getText());
+                    invite.setReason(parser.nextText());
                 }
             }
             else if (eventType == XmlPullParser.END_TAG) {
@@ -171,7 +171,7 @@
             int eventType = parser.next();
             if (eventType == XmlPullParser.START_TAG) {
                 if (parser.getName().equals("reason")) {
-                    decline.setReason(parser.getText());
+                    decline.setReason(parser.nextText());
                 }
             }
             else if (eventType == XmlPullParser.END_TAG) {
@@ -191,7 +191,7 @@
             int eventType = parser.next();
             if (eventType == XmlPullParser.START_TAG) {
                 if (parser.getName().equals("reason")) {
-                    destroy.setReason(parser.getText());
+                    destroy.setReason(parser.nextText());
                 }
             }
             else if (eventType == XmlPullParser.END_TAG) {
