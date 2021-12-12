diff --git a/OsmAnd/src/net/osmand/plus/routing/VoiceRouter.java b/OsmAnd/src/net/osmand/plus/routing/VoiceRouter.java
index 0271fd2..fd6f05b 100644
--- a/OsmAnd/src/net/osmand/plus/routing/VoiceRouter.java
+++ b/OsmAnd/src/net/osmand/plus/routing/VoiceRouter.java
@@ -77,7 +77,7 @@
     public interface VoiceMessageListener {
     	void onVoiceMessage();
     }
-    private ConcurrentHashMap<VoiceMessageListener, Void> voiceMessageListeners;
+    private ConcurrentHashMap<VoiceMessageListener, Integer> voiceMessageListeners;
     
 	public VoiceRouter(RoutingHelper router, final OsmandSettings settings, CommandPlayer player) {
 		this.router = router;
@@ -85,7 +85,7 @@
         this.settings = settings;
 
 		empty = new Struct("");
-		voiceMessageListeners = new ConcurrentHashMap<VoiceRouter.VoiceMessageListener, Void>();
+		voiceMessageListeners = new ConcurrentHashMap<VoiceRouter.VoiceMessageListener, Integer>();
 	}
 	
 	public void setPlayer(CommandPlayer player) {
@@ -842,7 +842,7 @@
 	}
 
 	public void addVoiceMessageListener(VoiceMessageListener voiceMessageListener) {
-		voiceMessageListeners.put(voiceMessageListener, null);
+		voiceMessageListeners.put(voiceMessageListener, 0);
 	}
 	
 	public void removeVoiceMessageListener(VoiceMessageListener voiceMessageListener) {
