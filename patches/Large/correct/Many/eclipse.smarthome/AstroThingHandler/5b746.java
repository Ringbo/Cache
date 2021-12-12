diff --git a/extensions/binding/org.eclipse.smarthome.binding.astro/src/main/java/org/eclipse/smarthome/binding/astro/handler/AstroThingHandler.java b/extensions/binding/org.eclipse.smarthome.binding.astro/src/main/java/org/eclipse/smarthome/binding/astro/handler/AstroThingHandler.java
index 91287dc..42d471d 100644
--- a/extensions/binding/org.eclipse.smarthome.binding.astro/src/main/java/org/eclipse/smarthome/binding/astro/handler/AstroThingHandler.java
+++ b/extensions/binding/org.eclipse.smarthome.binding.astro/src/main/java/org/eclipse/smarthome/binding/astro/handler/AstroThingHandler.java
@@ -183,9 +183,10 @@
                 dailyJob.run();
 
                 // Repeat positional job every configured seconds
+                // Use scheduleAtFixedRate to avoid time drift associated with scheduleWithFixedDelay
                 if (isPositionalChannelLinked()) {
                     Job positionalJob = new PositionalJob(thingUID);
-                    ScheduledFuture<?> future = scheduler.scheduleWithFixedDelay(positionalJob, 0,
+                    ScheduledFuture<?> future = scheduler.scheduleAtFixedRate(positionalJob, 0,
                             thingConfig.getInterval(), TimeUnit.SECONDS);
                     scheduledFutures.add(future);
                     logger.info("Scheduled {} every {} seconds", positionalJob, thingConfig.getInterval());
