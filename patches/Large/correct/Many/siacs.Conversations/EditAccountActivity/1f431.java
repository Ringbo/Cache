diff --git a/src/main/java/eu/siacs/conversations/ui/EditAccountActivity.java b/src/main/java/eu/siacs/conversations/ui/EditAccountActivity.java
index 4481981..908c29d 100644
--- a/src/main/java/eu/siacs/conversations/ui/EditAccountActivity.java
+++ b/src/main/java/eu/siacs/conversations/ui/EditAccountActivity.java
@@ -503,7 +503,7 @@
 		} else {
 			if (this.mAccount.errorStatus()) {
 				this.mAccountJid.setError(getString(this.mAccount.getStatus().getReadableId()));
-				if (init) {
+				if (init || !accountInfoEdited()) {
 					this.mAccountJid.requestFocus();
 				}
 			} else {
