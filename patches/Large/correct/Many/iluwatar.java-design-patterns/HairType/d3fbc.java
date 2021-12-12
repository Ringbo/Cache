diff --git a/builder/src/main/java/com/iluwatar/HairType.java b/builder/src/main/java/com/iluwatar/HairType.java
index 9766b29..f829b72 100644
--- a/builder/src/main/java/com/iluwatar/HairType.java
+++ b/builder/src/main/java/com/iluwatar/HairType.java
@@ -2,13 +2,13 @@
 
 public enum HairType {
 
-	BOLD, SHORT, CURLY, LONG_STRAIGHT, LONG_CURLY;
+	BALD, SHORT, CURLY, LONG_STRAIGHT, LONG_CURLY;
 
 	@Override
 	public String toString() {
 		String s = "";
 		switch(this) {
-		case BOLD: s = "bold"; break;
+		case BALD: s = "bold"; break;
 		case SHORT: s = "short"; break;
 		case CURLY: s = "curly"; break;
 		case LONG_STRAIGHT: s = "long straight"; break;
