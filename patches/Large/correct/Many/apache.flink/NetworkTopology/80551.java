diff --git a/nephele/nephele-management/src/main/java/eu/stratosphere/nephele/topology/NetworkTopology.java b/nephele/nephele-management/src/main/java/eu/stratosphere/nephele/topology/NetworkTopology.java
index d67fc5d..7b2b370 100644
--- a/nephele/nephele-management/src/main/java/eu/stratosphere/nephele/topology/NetworkTopology.java
+++ b/nephele/nephele-management/src/main/java/eu/stratosphere/nephele/topology/NetworkTopology.java
@@ -61,7 +61,7 @@
 
 		try {
 
-			while ((strLine = br.readLine()) != null) {
+			while ((strLine = br.readLine()) != null && !strLine.isEmpty()) {
 
 				final Matcher m = pattern.matcher(strLine);
 				if (!m.matches()) {
