diff --git a/bundles/binding/org.openhab.binding.caldav-personal/src/main/java/org/openhab/binding/caldav_personal/internal/CalDavBinding.java b/bundles/binding/org.openhab.binding.caldav-personal/src/main/java/org/openhab/binding/caldav_personal/internal/CalDavBinding.java
index 2e7c1da..3eb1d01 100644
--- a/bundles/binding/org.openhab.binding.caldav-personal/src/main/java/org/openhab/binding/caldav_personal/internal/CalDavBinding.java
+++ b/bundles/binding/org.openhab.binding.caldav-personal/src/main/java/org/openhab/binding/caldav_personal/internal/CalDavBinding.java
@@ -220,7 +220,7 @@
         for (String item : bindingProvider.getItemNames()) {
             CalDavConfig config = bindingProvider.getConfig(item);
             List<CalDavEvent> events = eventCache.get(config.getUniqueEventListKey());
-            if (events == null) {
+            if (events == null && this.calDavLoader != null) {
                 CalDavQuery query = getQueryForConfig(config);
                 events = this.calDavLoader.getEvents(query);
                 eventCache.put(config.getUniqueEventListKey(), events);
