diff --git a/bundles/binding/org.openhab.binding.s300th.test/src/test/java/org/openhab/binding/s300th/internal/ParsingTest.java b/bundles/binding/org.openhab.binding.s300th.test/src/test/java/org/openhab/binding/s300th/internal/ParsingTest.java
index 6ea7830..d1edb93 100644
--- a/bundles/binding/org.openhab.binding.s300th.test/src/test/java/org/openhab/binding/s300th/internal/ParsingTest.java
+++ b/bundles/binding/org.openhab.binding.s300th.test/src/test/java/org/openhab/binding/s300th/internal/ParsingTest.java
@@ -22,7 +22,7 @@
 		double temp = ParseUtils.parseTemperature(S300TH_DATA_1);
 		Assert.assertEquals(23.2, temp, 0.01);
 
-		double humidity = ParseUtils.parseHumidity(S300TH_DATA_1);
+		double humidity = ParseUtils.parseS300THHumidity(S300TH_DATA_1);
 		Assert.assertEquals(50.8, humidity, 0.01);
 
 		String address = ParseUtils.parseS300THAddress(S300TH_DATA_1);
