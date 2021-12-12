diff --git a/services/src/main/java/io/druid/guice/RealtimeModule.java b/services/src/main/java/io/druid/guice/RealtimeModule.java
index 7bcce15..6770b65 100644
--- a/services/src/main/java/io/druid/guice/RealtimeModule.java
+++ b/services/src/main/java/io/druid/guice/RealtimeModule.java
@@ -65,7 +65,7 @@
         binder,
         "druid.realtime.chathandler.type",
         Key.get(ChatHandlerProvider.class),
-        Key.get(NoopChatHandlerProvider.class)
+        Key.get(ServiceAnnouncingChatHandlerProvider.class)
     );
     final MapBinder<String, ChatHandlerProvider> handlerProviderBinder = PolyBind.optionBinder(
         binder, Key.get(ChatHandlerProvider.class)
