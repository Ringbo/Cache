diff --git a/src/main/java/com/gitblit/wicket/pages/TicketsPage.java b/src/main/java/com/gitblit/wicket/pages/TicketsPage.java
index d88ccb6..dfa7b02 100644
--- a/src/main/java/com/gitblit/wicket/pages/TicketsPage.java
+++ b/src/main/java/com/gitblit/wicket/pages/TicketsPage.java
@@ -576,7 +576,7 @@
 
 					Fragment milestonePanel = new Fragment("milestonePanel", "openMilestoneFragment", this);
 					Label label = new Label("progress");
-					WicketUtils.setCssStyle(label, "width:" + tm.getProgress() + "%;");
+					WicketUtils.setCssStyle(label, "width:" + m.getProgress() + "%;");
 					milestonePanel.add(label);
 
 					milestonePanel.add(new LinkPanel("openTickets", null,
