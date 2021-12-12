diff --git a/Conversions/HexaDecimalToBinary.java b/Conversions/HexaDecimalToBinary.java
index e43bb1d..29608e1 100644
--- a/Conversions/HexaDecimalToBinary.java
+++ b/Conversions/HexaDecimalToBinary.java
@@ -3,7 +3,7 @@
 import java.util.Scanner;
 import javax.swing.*;
 
-public class HexaToBin {
+public class HexaDecimalToBinary {
  
     private final int LONG_BITS = 8;
 
@@ -28,7 +28,7 @@
         //Testing Numbers:
         String[] hexNums = {"1", "A1", "ef", "BA", "AA", "BB",
             "19", "01", "02", "03", "04"};
-        Convert objConvert = new Convert();
+        HexaDecimalToBinary objConvert = new HexaDecimalToBinary();
 
         for (String num : hexNums) {
             objConvert.convert(num);
