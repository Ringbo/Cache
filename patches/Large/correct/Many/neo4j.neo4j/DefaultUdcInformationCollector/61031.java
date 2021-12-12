diff --git a/community/udc/src/main/java/org/neo4j/ext/udc/impl/DefaultUdcInformationCollector.java b/community/udc/src/main/java/org/neo4j/ext/udc/impl/DefaultUdcInformationCollector.java
index 848bf52..3f0794b 100644
--- a/community/udc/src/main/java/org/neo4j/ext/udc/impl/DefaultUdcInformationCollector.java
+++ b/community/udc/src/main/java/org/neo4j/ext/udc/impl/DefaultUdcInformationCollector.java
@@ -274,7 +274,7 @@
         {
             return ((OperatingSystemMXBean) operatingSystemMXBean).getTotalPhysicalMemorySize();
         }
-        catch ( NoClassDefFoundError e )
+        catch ( Throwable e )
         {
             // If not running on Oracle JDK
 
