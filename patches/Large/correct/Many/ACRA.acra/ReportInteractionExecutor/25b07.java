diff --git a/acra-core/src/main/java/org/acra/interaction/ReportInteractionExecutor.java b/acra-core/src/main/java/org/acra/interaction/ReportInteractionExecutor.java
index 9635621..49f71ad 100644
--- a/acra-core/src/main/java/org/acra/interaction/ReportInteractionExecutor.java
+++ b/acra-core/src/main/java/org/acra/interaction/ReportInteractionExecutor.java
@@ -47,7 +47,7 @@
         this.config = config;
         reportInteractions = new ArrayList<>();
         //noinspection ForLoopReplaceableByForEach
-        for (final Iterator<ReportInteraction> iterator = ServiceLoader.load(ReportInteraction.class).iterator(); iterator.hasNext(); ) {
+        for (final Iterator<ReportInteraction> iterator = ServiceLoader.load(ReportInteraction.class, getClass().getClassLoader()).iterator(); iterator.hasNext(); ) {
             try {
                 final ReportInteraction reportInteraction = iterator.next();
                 if (reportInteraction.enabled(config)) {
