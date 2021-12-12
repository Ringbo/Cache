diff --git a/services/src/main/java/io/druid/cli/CliPeon.java b/services/src/main/java/io/druid/cli/CliPeon.java
index d4eb022..d85e974 100644
--- a/services/src/main/java/io/druid/cli/CliPeon.java
+++ b/services/src/main/java/io/druid/cli/CliPeon.java
@@ -111,7 +111,7 @@
                 binder,
                 "druid.indexer.task.chathandler.type",
                 Key.get(ChatHandlerProvider.class),
-                Key.get(NoopChatHandlerProvider.class)
+                Key.get(ServiceAnnouncingChatHandlerProvider.class)
             );
             final MapBinder<String, ChatHandlerProvider> handlerProviderBinder = PolyBind.optionBinder(
                 binder, Key.get(ChatHandlerProvider.class)
