diff --git a/smack-extensions/src/main/java/org/jivesoftware/smackx/muc/packet/MUCItem.java b/smack-extensions/src/main/java/org/jivesoftware/smackx/muc/packet/MUCItem.java
index 9922599..7f16303 100644
--- a/smack-extensions/src/main/java/org/jivesoftware/smackx/muc/packet/MUCItem.java
+++ b/smack-extensions/src/main/java/org/jivesoftware/smackx/muc/packet/MUCItem.java
@@ -148,7 +148,7 @@
         xml.optAttribute("affiliation", getAffiliation());
         xml.optAttribute("jid", getJid());
         xml.optAttribute("nick", getNick());
-        if (role != MUCRole.none) {
+        if (role != null && role != MUCRole.none) {
             xml.attribute("role", getRole());
         }
         xml.rightAngleBracket();
