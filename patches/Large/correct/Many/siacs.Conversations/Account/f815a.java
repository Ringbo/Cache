diff --git a/src/main/java/eu/siacs/conversations/entities/Account.java b/src/main/java/eu/siacs/conversations/entities/Account.java
index 64bbaa2..46865a6 100644
--- a/src/main/java/eu/siacs/conversations/entities/Account.java
+++ b/src/main/java/eu/siacs/conversations/entities/Account.java
@@ -281,7 +281,7 @@
 	}
 
 	public boolean hasErrorStatus() {
-		return getXmppConnection() != null && getStatus().isError() && getXmppConnection().getAttempt() >= 2;
+		return getXmppConnection() != null && getStatus().isError() && getXmppConnection().getAttempt() >= 3;
 	}
 
 	public String getResource() {
