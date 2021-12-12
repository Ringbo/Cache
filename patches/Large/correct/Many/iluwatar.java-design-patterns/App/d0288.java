diff --git a/adapter/src/main/java/com/iluwatar/App.java b/adapter/src/main/java/com/iluwatar/App.java
index 54bd3c1..e029ea3 100644
--- a/adapter/src/main/java/com/iluwatar/App.java
+++ b/adapter/src/main/java/com/iluwatar/App.java
@@ -15,7 +15,7 @@
 public class App {
 
 	public static void main(String[] args) {
-		GnomeEngineeringManager manager = new GnomeEngineeringManager();
+		Engineer manager = new GnomeEngineeringManager();
 		manager.operateDevice();
 	}
 }
