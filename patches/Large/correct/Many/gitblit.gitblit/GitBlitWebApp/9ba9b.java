diff --git a/src/com/gitblit/wicket/GitBlitWebApp.java b/src/com/gitblit/wicket/GitBlitWebApp.java
index 245b1e0..4e32daa 100644
--- a/src/com/gitblit/wicket/GitBlitWebApp.java
+++ b/src/com/gitblit/wicket/GitBlitWebApp.java
@@ -104,7 +104,7 @@
 
 		// setup ticket urls
 		mount("/tickets", TicketsPage.class, "r");
-		mount("/ticket", TicketPage.class, "r", "h", "f");
+		mount("/ticket", TicketPage.class, "r", "f");
 
 		// setup the markdown urls
 		mount("/docs", DocsPage.class, "r");
