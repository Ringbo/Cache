diff --git a/core/java/android/text/style/TtsSpan.java b/core/java/android/text/style/TtsSpan.java
index 93a156b..e9153dd 100644
--- a/core/java/android/text/style/TtsSpan.java
+++ b/core/java/android/text/style/TtsSpan.java
@@ -1013,7 +1013,7 @@
          * @return This instance.
          */
         public MeasureBuilder setIntegerPart(long integerPart) {
-            return setNumber(String.valueOf(integerPart));
+            return setIntegerPart(String.valueOf(integerPart));
         }
 
         /**
