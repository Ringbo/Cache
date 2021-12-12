diff --git a/EssentialsChat/src/com/earth2me/essentials/chat/ChatStore.java b/EssentialsChat/src/com/earth2me/essentials/chat/ChatStore.java
index 38239ab..d353d5d 100644
--- a/EssentialsChat/src/com/earth2me/essentials/chat/ChatStore.java
+++ b/EssentialsChat/src/com/earth2me/essentials/chat/ChatStore.java
@@ -36,7 +36,7 @@
 
 	public String getLongType()
 	{
-		return type.length() > 0 ? "chat" : "chat-" + type;
+		return type.length() == 0 ? "chat" : "chat-" + type;
 	}
 
 	public long getRadius()
