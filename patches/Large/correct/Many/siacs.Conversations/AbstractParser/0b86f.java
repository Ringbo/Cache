diff --git a/src/eu/siacs/conversations/parser/AbstractParser.java b/src/eu/siacs/conversations/parser/AbstractParser.java
index 25fcd92..efbf5ae 100644
--- a/src/eu/siacs/conversations/parser/AbstractParser.java
+++ b/src/eu/siacs/conversations/parser/AbstractParser.java
@@ -60,7 +60,7 @@
 
 	protected void updateLastseen(Element packet, Account account,
 			boolean presenceOverwrite) {
-		String[] fromParts = packet.getAttribute("from").split("/");
+		String[] fromParts = packet.getAttribute("from").split("/",2);
 		String from = fromParts[0];
 		String presence = null;
 		if (fromParts.length >= 2) {
