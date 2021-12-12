diff --git a/src/eu/siacs/conversations/entities/Message.java b/src/eu/siacs/conversations/entities/Message.java
index ce496d2..9505c5c 100644
--- a/src/eu/siacs/conversations/entities/Message.java
+++ b/src/eu/siacs/conversations/entities/Message.java
@@ -246,9 +246,9 @@
 
 	public void setPresence(String presence) {
 		if (presence == null) {
-			this.counterpart = this.counterpart.split("/")[0];
+			this.counterpart = this.counterpart.split("/",2)[0];
 		} else {
-			this.counterpart = this.counterpart.split("/")[0] + "/" + presence;
+			this.counterpart = this.counterpart.split("/",2)[0] + "/" + presence;
 		}
 	}
 
@@ -257,7 +257,7 @@
 	}
 
 	public String getPresence() {
-		String[] counterparts = this.counterpart.split("/");
+		String[] counterparts = this.counterpart.split("/",2);
 		if (counterparts.length == 2) {
 			return counterparts[1];
 		} else {
