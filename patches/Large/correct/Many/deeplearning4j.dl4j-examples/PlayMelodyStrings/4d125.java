diff --git a/dl4j-examples/src/main/java/org/deeplearning4j/examples/recurrent/character/melodl4j/PlayMelodyStrings.java b/dl4j-examples/src/main/java/org/deeplearning4j/examples/recurrent/character/melodl4j/PlayMelodyStrings.java
index 2c62169..04fc435 100644
--- a/dl4j-examples/src/main/java/org/deeplearning4j/examples/recurrent/character/melodl4j/PlayMelodyStrings.java
+++ b/dl4j-examples/src/main/java/org/deeplearning4j/examples/recurrent/character/melodl4j/PlayMelodyStrings.java
@@ -17,6 +17,16 @@
 import org.apache.commons.io.FileUtils;
 
 /*
+ *  This plays melody strings using your operating system's software synthesizer.
+ *  There's a public static method for playing melody strings in files and
+ *  another method for playing melody strings passed in as java.lang.Strings.
+ *
+ *  The format for the melody strings is determined by Midi2MelodyStrings.java.
+ *
+ *  In a valid melody string, each pitch or rest character should be followed by
+ *  a duration. But during learning some of the melody strings are invalid syntax.
+ *  This class will ignore invalid characters in the melody strings.
+ *
  * @author Donald A. Smith
  */
 public class PlayMelodyStrings {
@@ -30,6 +40,7 @@
     //-----------------------------------
     public static void main(String[] args) {
         try {
+            //  playMelody("s2s2s1s",10,48); System.exit(0);
             String pathToMelodiesFile = args.length == 0 ? getPathToExampleMelodiesFile() : args[0];
             playMelodies(pathToMelodiesFile, "Acoustic Grand Piano", 20);
         } catch (Exception exc) {
@@ -177,7 +188,7 @@
         }
         int noteDurationInTicks = 0;
 
-        while (index < melody.length() - 2) {
+        while (index < melody.length() - 1) {
             char ch = melody.charAt(index);
             if (ch == 'R') {
                 index++;
