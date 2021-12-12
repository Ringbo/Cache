diff --git a/source/org/jivesoftware/smackx/muc/MultiUserChat.java b/source/org/jivesoftware/smackx/muc/MultiUserChat.java
index 17c6f71..2caa970 100644
--- a/source/org/jivesoftware/smackx/muc/MultiUserChat.java
+++ b/source/org/jivesoftware/smackx/muc/MultiUserChat.java
@@ -1157,7 +1157,7 @@
      * XMPP user ID of the user who initiated the ban.
      *
      * @param jid the bare XMPP user ID of the user to ban (e.g. "user@host.org").
-     * @param reason the reason why the user was banned.
+     * @param reason the optional reason why the user was banned.
      * @throws XMPPException if an error occurs banning a user. In particular, a
      *      405 error can occur if a moderator or a user with an affiliation of "owner" or "admin"
      *      was tried to be banned (i.e. Not Allowed error).
@@ -1276,7 +1276,7 @@
      * @throws XMPPException if an error occurs granting ownership privileges to a user.
      */
     public void grantOwnership(Collection<String> jids) throws XMPPException {
-        changeAffiliationByOwner(jids, "owner");
+        changeAffiliationByAdmin(jids, "owner");
     }
 
     /**
@@ -1289,7 +1289,7 @@
      * @throws XMPPException if an error occurs granting ownership privileges to a user.
      */
     public void grantOwnership(String jid) throws XMPPException {
-        changeAffiliationByOwner(jid, "owner");
+        changeAffiliationByAdmin(jid, "owner", null);
     }
 
     /**
@@ -1301,7 +1301,7 @@
      * @throws XMPPException if an error occurs revoking ownership privileges from a user.
      */
     public void revokeOwnership(Collection<String> jids) throws XMPPException {
-        changeAffiliationByOwner(jids, "admin");
+        changeAffiliationByAdmin(jids, "admin");
     }
 
     /**
@@ -1313,7 +1313,7 @@
      * @throws XMPPException if an error occurs revoking ownership privileges from a user.
      */
     public void revokeOwnership(String jid) throws XMPPException {
-        changeAffiliationByOwner(jid, "admin");
+        changeAffiliationByAdmin(jid, "admin", null);
     }
 
     /**
@@ -1423,6 +1423,14 @@
         }
     }
 
+    /**
+     * Tries to change the affiliation with an 'muc#admin' namespace
+     *
+     * @param jid
+     * @param affiliation
+     * @param reason the reason for the affiliation change (optional)
+     * @throws XMPPException
+     */
     private void changeAffiliationByAdmin(String jid, String affiliation, String reason)
             throws XMPPException {
         MUCAdmin iq = new MUCAdmin();
@@ -1632,7 +1640,7 @@
      *         don't have enough privileges to get this information.
      */
     public Collection<Affiliate> getOwners() throws XMPPException {
-        return getAffiliatesByOwner("owner");
+        return getAffiliatesByAdmin("owner");
     }
 
     /**
