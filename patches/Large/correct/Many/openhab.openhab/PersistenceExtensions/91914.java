diff --git a/bundles/core/org.openhab.core.persistence/src/main/java/org/openhab/core/persistence/extensions/PersistenceExtensions.java b/bundles/core/org.openhab.core.persistence/src/main/java/org/openhab/core/persistence/extensions/PersistenceExtensions.java
index b3fd47b..89ae9cc 100644
--- a/bundles/core/org.openhab.core.persistence/src/main/java/org/openhab/core/persistence/extensions/PersistenceExtensions.java
+++ b/bundles/core/org.openhab.core.persistence/src/main/java/org/openhab/core/persistence/extensions/PersistenceExtensions.java
@@ -461,7 +461,7 @@
 	 */
 	static public DecimalType deltaSince(Item item, AbstractInstant timestamp, String serviceName) {
 		DecimalType result = null;
-		HistoricItem itemThen = historicState(item, timestamp);
+		HistoricItem itemThen = historicState(item, timestamp, serviceName);
 		if (itemThen != null) {
 			DecimalType valueThen = (DecimalType) itemThen.getState();
 			DecimalType valueNow = (DecimalType) item.getStateAs(DecimalType.class);
@@ -503,7 +503,7 @@
 	 */
 	static public DecimalType evolutionRate(Item item, AbstractInstant timestamp, String serviceName) {
 		DecimalType result = null;
-		HistoricItem itemThen = historicState(item, timestamp);
+		HistoricItem itemThen = historicState(item, timestamp, serviceName);
 		if (itemThen != null) {
 			DecimalType valueThen = (DecimalType) itemThen.getState();
 			DecimalType valueNow = (DecimalType) item.getStateAs(DecimalType.class);
