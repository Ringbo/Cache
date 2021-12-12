diff --git a/src/main/java/com/pokegoapi/api/map/Point.java b/src/main/java/com/pokegoapi/api/map/Point.java
index 386f8d5..6502190 100644
--- a/src/main/java/com/pokegoapi/api/map/Point.java
+++ b/src/main/java/com/pokegoapi/api/map/Point.java
@@ -22,10 +22,10 @@
 public class Point {
 	@Getter
 	@Setter
-	private static double longitude;
+	private double longitude;
 	@Getter
 	@Setter
-	private static double latitude;
+	private double latitude;
 
 	public Point(double latitude, double longitude) {
 		this.latitude = latitude;
