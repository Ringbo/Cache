diff --git a/source/org/jivesoftware/smackx/muc/MultiUserChat.java b/source/org/jivesoftware/smackx/muc/MultiUserChat.java
index 9cbdee3..e62d6c0 100644
--- a/source/org/jivesoftware/smackx/muc/MultiUserChat.java
+++ b/source/org/jivesoftware/smackx/muc/MultiUserChat.java
@@ -1222,11 +1222,11 @@
      * @throws XMPPException if an error occurs granting ownership privileges to a user.
      */
     public void grantOwnership(String jid) throws XMPPException {
-        MUCAdmin iq = new MUCAdmin();
+        MUCOwner iq = new MUCOwner();
         iq.setTo(room);
         iq.setType(IQ.Type.SET);
         // Set the affiliation to "owner". This will grant a user's ownership
-        MUCAdmin.Item item = new MUCAdmin.Item("owner", null);
+        MUCOwner.Item item = new MUCOwner.Item("owner");
         item.setJid(jid);
         iq.addItem(item);
 
@@ -1257,11 +1257,11 @@
      * @throws XMPPException if an error occurs granting ownership privileges to a user.
      */
     public void revokeOwnership(String jid) throws XMPPException {
-        MUCAdmin iq = new MUCAdmin();
+        MUCOwner iq = new MUCOwner();
         iq.setTo(room);
         iq.setType(IQ.Type.SET);
         // Set the affiliation to "admin". This will revoke a user's ownership
-        MUCAdmin.Item item = new MUCAdmin.Item("admin", null);
+        MUCOwner.Item item = new MUCOwner.Item("admin");
         item.setJid(jid);
         iq.addItem(item);
 
@@ -1293,11 +1293,11 @@
      * @throws XMPPException if an error occurs granting administrator privileges to a user.
      */
     public void grantAdmin(String jid) throws XMPPException {
-        MUCAdmin iq = new MUCAdmin();
+        MUCOwner iq = new MUCOwner();
         iq.setTo(room);
         iq.setType(IQ.Type.SET);
         // Set the affiliation to "admin". This will grant administrator privileges
-        MUCAdmin.Item item = new MUCAdmin.Item("admin", null);
+        MUCOwner.Item item = new MUCOwner.Item("admin");
         item.setJid(jid);
         iq.addItem(item);
 
@@ -1329,11 +1329,11 @@
      * @throws XMPPException if an error occurs revoking administrator privileges from a user.
      */
     public void revokeAdmin(String jid) throws XMPPException {
-        MUCAdmin iq = new MUCAdmin();
+        MUCOwner iq = new MUCOwner();
         iq.setTo(room);
         iq.setType(IQ.Type.SET);
         // Set the affiliation to "member". This will revoke a user's ownership
-        MUCAdmin.Item item = new MUCAdmin.Item("member", null);
+        MUCOwner.Item item = new MUCOwner.Item("member");
         item.setJid(jid);
         iq.addItem(item);
 
