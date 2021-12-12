diff --git a/dropwizard-db/src/main/java/com/yammer/dropwizard/db/Database.java b/dropwizard-db/src/main/java/com/yammer/dropwizard/db/Database.java
index b6ad686..b9f4a3b 100644
--- a/dropwizard-db/src/main/java/com/yammer/dropwizard/db/Database.java
+++ b/dropwizard-db/src/main/java/com/yammer/dropwizard/db/Database.java
@@ -30,7 +30,7 @@
         this.pool = pool;
         this.ping = onDemand(Ping.class);
         setSQLLog(new Log4JLog(LOGGER, Level.TRACE));
-        setTimingCollector(new InstrumentedTimingCollector(Metrics.defaultRegistry(), Database.class));
+        setTimingCollector(new InstrumentedTimingCollector(Metrics.defaultRegistry()));
         setStatementRewriter(new NamePrependingStatementRewriter());
         setStatementLocator(new ScopedStatementLocator());
         registerArgumentFactory(new OptionalArgumentFactory());
