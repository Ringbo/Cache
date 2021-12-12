diff --git a/src/main/java/eu/siacs/conversations/entities/Account.java b/src/main/java/eu/siacs/conversations/entities/Account.java
index f717666..83ff9ae 100644
--- a/src/main/java/eu/siacs/conversations/entities/Account.java
+++ b/src/main/java/eu/siacs/conversations/entities/Account.java
@@ -318,7 +318,7 @@
 	}
 
 	public String getUsername() {
-		return jid.getLocal();
+		return jid.getEscapedLocal();
 	}
 
 	public boolean setJid(final Jid next) {
