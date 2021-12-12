diff --git a/src/monitor/model/org/apache/jmeter/monitor/model/ObjectFactory.java b/src/monitor/model/org/apache/jmeter/monitor/model/ObjectFactory.java
index 4888972..1498d1b 100644
--- a/src/monitor/model/org/apache/jmeter/monitor/model/ObjectFactory.java
+++ b/src/monitor/model/org/apache/jmeter/monitor/model/ObjectFactory.java
@@ -30,7 +30,7 @@
 
 	private static ObjectFactory FACTORY = null;
 
-	private Parser PARSER = null;
+	private final Parser PARSER;
 
 	/**
 	 * 
@@ -40,7 +40,7 @@
 		PARSER = new MonitorParser(this);
 	}
 
-	public static ObjectFactory getInstance() {
+	public static synchronized ObjectFactory getInstance() {
 		if (FACTORY == null) {
 			FACTORY = new ObjectFactory();
 		}
