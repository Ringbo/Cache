diff --git a/bundles/binding/org.openhab.binding.energenie/src/main/java/org/openhab/binding/energenie/internal/EnergenieBinding.java b/bundles/binding/org.openhab.binding.energenie/src/main/java/org/openhab/binding/energenie/internal/EnergenieBinding.java
index 8d14eb0..b9a60b7 100644
--- a/bundles/binding/org.openhab.binding.energenie/src/main/java/org/openhab/binding/energenie/internal/EnergenieBinding.java
+++ b/bundles/binding/org.openhab.binding.energenie/src/main/java/org/openhab/binding/energenie/internal/EnergenieBinding.java
@@ -114,7 +114,7 @@
 						
 						String stateResponseSearch = "var sockstates = ";
 						int findState=loginResponseString.lastIndexOf(stateResponseSearch);
-						if (findState !=0) {
+						if (findState > 0) {
 							logger.trace("searchstring sockstates found at position {}", findState);
 							
 							String slicedResponse = loginResponseString.substring(findState+18, findState+25);
