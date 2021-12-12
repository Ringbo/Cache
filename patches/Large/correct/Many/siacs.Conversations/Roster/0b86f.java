diff --git a/src/eu/siacs/conversations/entities/Roster.java b/src/eu/siacs/conversations/entities/Roster.java
index c6212f7..f11f025 100644
--- a/src/eu/siacs/conversations/entities/Roster.java
+++ b/src/eu/siacs/conversations/entities/Roster.java
@@ -15,12 +15,12 @@
 	}
 
 	public boolean hasContact(String jid) {
-		String cleanJid = jid.split("/")[0];
+		String cleanJid = jid.split("/",2)[0];
 		return contacts.containsKey(cleanJid);
 	}
 
 	public Contact getContact(String jid) {
-		String cleanJid = jid.split("/")[0].toLowerCase(Locale.getDefault());
+		String cleanJid = jid.split("/",2)[0].toLowerCase(Locale.getDefault());
 		if (contacts.containsKey(cleanJid)) {
 			return contacts.get(cleanJid);
 		} else {
