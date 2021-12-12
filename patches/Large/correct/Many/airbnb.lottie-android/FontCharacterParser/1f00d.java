diff --git a/lottie/src/main/java/com/airbnb/lottie/parser/FontCharacterParser.java b/lottie/src/main/java/com/airbnb/lottie/parser/FontCharacterParser.java
index 7e4c9bb..2443ac9 100644
--- a/lottie/src/main/java/com/airbnb/lottie/parser/FontCharacterParser.java
+++ b/lottie/src/main/java/com/airbnb/lottie/parser/FontCharacterParser.java
@@ -17,7 +17,7 @@
   static FontCharacter parse(
       JsonReader reader, LottieComposition composition) throws IOException {
     char character = '\0';
-    int size = 0;
+    double size = 0;
     double width = 0;
     String style = null;
     String fontFamily = null;
@@ -30,7 +30,7 @@
           character = reader.nextString().charAt(0);
           break;
         case "size":
-          size = reader.nextInt();
+          size = reader.nextDouble();
           break;
         case "w":
           width = reader.nextDouble();
