diff --git a/src/monitor/model/org/apache/jmeter/monitor/model/ObjectFactory.java b/src/monitor/model/org/apache/jmeter/monitor/model/ObjectFactory.java
index 97ba945..7bc9398 100644
--- a/src/monitor/model/org/apache/jmeter/monitor/model/ObjectFactory.java
+++ b/src/monitor/model/org/apache/jmeter/monitor/model/ObjectFactory.java
@@ -48,7 +48,7 @@
 		return FACTORY;
 	}
 	
-	public Status parseBytes(byte[] bytes){
+	public synchronized Status parseBytes(byte[] bytes){
 		return PARSER.parseBytes(bytes);
 	}
 	
