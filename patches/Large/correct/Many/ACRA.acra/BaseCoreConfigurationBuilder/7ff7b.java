diff --git a/acra-core/src/main/java/org/acra/config/BaseCoreConfigurationBuilder.java b/acra-core/src/main/java/org/acra/config/BaseCoreConfigurationBuilder.java
index abcd325..76086af 100644
--- a/acra-core/src/main/java/org/acra/config/BaseCoreConfigurationBuilder.java
+++ b/acra-core/src/main/java/org/acra/config/BaseCoreConfigurationBuilder.java
@@ -47,7 +47,7 @@
         reportContentChanges = new EnumMap<>(ReportField.class);
         configurationBuilders = new ArrayList<>();
         //noinspection ForLoopReplaceableByForEach
-        for (final Iterator<ConfigurationBuilderFactory> iterator = ServiceLoader.load(ConfigurationBuilderFactory.class).iterator(); iterator.hasNext(); ) {
+        for (final Iterator<ConfigurationBuilderFactory> iterator = ServiceLoader.load(ConfigurationBuilderFactory.class, getClass().getClassLoader()).iterator(); iterator.hasNext(); ) {
             try {
                 final ConfigurationBuilderFactory factory = iterator.next();
                 if (DEV_LOGGING) ACRA.log.d(LOG_TAG, "Discovered and loaded plugin of type " + factory.getClass().getSimpleName().replace("BuilderFactory", ""));
