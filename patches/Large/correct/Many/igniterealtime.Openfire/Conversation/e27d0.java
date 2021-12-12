diff --git a/src/plugins/monitoring/src/java/org/jivesoftware/openfire/archive/Conversation.java b/src/plugins/monitoring/src/java/org/jivesoftware/openfire/archive/Conversation.java
index b0a99d8..e2882c5 100644
--- a/src/plugins/monitoring/src/java/org/jivesoftware/openfire/archive/Conversation.java
+++ b/src/plugins/monitoring/src/java/org/jivesoftware/openfire/archive/Conversation.java
@@ -315,7 +315,7 @@
 				JID toJID = new JID(rs.getString(3));
 				String toJIDResource = rs.getString(4);
 				if (toJIDResource != null && !"".equals(toJIDResource)) {
-					toJID = new JID(rs.getString(1) + "/" + toJIDResource);
+					toJID = new JID(rs.getString(3) + "/" + toJIDResource);
 				}
 				Date date = new Date(rs.getLong(5));
 				String body = DbConnectionManager.getLargeTextField(rs, 6);
