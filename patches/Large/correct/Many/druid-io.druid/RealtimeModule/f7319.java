diff --git a/services/src/main/java/io/druid/guice/RealtimeModule.java b/services/src/main/java/io/druid/guice/RealtimeModule.java
index 6770b65..7bcce15 100644
--- a/services/src/main/java/io/druid/guice/RealtimeModule.java
+++ b/services/src/main/java/io/druid/guice/RealtimeModule.java
@@ -65,7 +65,7 @@
         binder,
         "druid.realtime.chathandler.type",
         Key.get(ChatHandlerProvider.class),
-        Key.get(ServiceAnnouncingChatHandlerProvider.class)
+        Key.get(NoopChatHandlerProvider.class)
     );
     final MapBinder<String, ChatHandlerProvider> handlerProviderBinder = PolyBind.optionBinder(
         binder, Key.get(ChatHandlerProvider.class)
