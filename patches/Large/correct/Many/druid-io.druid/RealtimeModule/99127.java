diff --git a/services/src/main/java/io/druid/guice/RealtimeModule.java b/services/src/main/java/io/druid/guice/RealtimeModule.java
index 04f897a..276f850 100644
--- a/services/src/main/java/io/druid/guice/RealtimeModule.java
+++ b/services/src/main/java/io/druid/guice/RealtimeModule.java
@@ -48,13 +48,13 @@
         binder,
         "druid.publish.type",
         Key.get(SegmentPublisher.class),
-        Key.get(NoopSegmentPublisher.class)
+        Key.get(DbSegmentPublisher.class)
     );
     final MapBinder<String, SegmentPublisher> publisherBinder = PolyBind.optionBinder(
         binder,
         Key.get(SegmentPublisher.class)
     );
-    publisherBinder.addBinding("db").to(DbSegmentPublisher.class);
+    publisherBinder.addBinding("noop").to(NoopSegmentPublisher.class);
     binder.bind(DbSegmentPublisher.class).in(LazySingleton.class);
 
     JsonConfigProvider.bind(binder, "druid.realtime", RealtimeManagerConfig.class);
