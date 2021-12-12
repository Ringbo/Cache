diff --git a/src/monitor/model/org/apache/jmeter/monitor/model/ObjectFactory.java b/src/monitor/model/org/apache/jmeter/monitor/model/ObjectFactory.java
index 54ab546..551d0fb 100644
--- a/src/monitor/model/org/apache/jmeter/monitor/model/ObjectFactory.java
+++ b/src/monitor/model/org/apache/jmeter/monitor/model/ObjectFactory.java
@@ -103,7 +103,7 @@
 	 * @param args
 	 */	
 	public static void main(String[] args){
-		if (args != null & args.length == 2){
+		if (args != null && args.length == 2){
 			String file = null;
 			//int count = 1;
 			if (args[0] != null){
