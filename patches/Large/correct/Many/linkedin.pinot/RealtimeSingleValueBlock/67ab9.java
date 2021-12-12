diff --git a/pinot-core/src/main/java/com/linkedin/pinot/core/realtime/impl/datasource/RealtimeSingleValueBlock.java b/pinot-core/src/main/java/com/linkedin/pinot/core/realtime/impl/datasource/RealtimeSingleValueBlock.java
index 1e43b57..4b56a09 100644
--- a/pinot-core/src/main/java/com/linkedin/pinot/core/realtime/impl/datasource/RealtimeSingleValueBlock.java
+++ b/pinot-core/src/main/java/com/linkedin/pinot/core/realtime/impl/datasource/RealtimeSingleValueBlock.java
@@ -233,7 +233,7 @@
 
           @Override
           public int nextIntVal() {
-            if (counter >= max) {
+            if (counter > max) {
               return Constants.EOF;
             }
 
@@ -243,7 +243,7 @@
 
           @Override
           public long nextLongVal() {
-            if (counter >= max) {
+            if (counter > max) {
               return Constants.EOF;
             }
 
@@ -253,7 +253,7 @@
 
           @Override
           public float nextFloatVal() {
-            if (counter >= max) {
+            if (counter > max) {
               return Constants.EOF;
             }
 
@@ -263,7 +263,7 @@
 
           @Override
           public double nextDoubleVal() {
-            if (counter >= max) {
+            if (counter > max) {
               return Constants.EOF;
             }
 
@@ -332,7 +332,7 @@
 
           @Override
           public int nextIntVal() {
-            if (counter >= max) {
+            if (counter > max) {
               return Constants.EOF;
             }
 
@@ -342,7 +342,7 @@
 
           @Override
           public long nextLongVal() {
-            if (counter >= max) {
+            if (counter > max) {
               return Constants.EOF;
             }
 
@@ -352,7 +352,7 @@
 
           @Override
           public float nextFloatVal() {
-            if (counter >= max) {
+            if (counter > max) {
               return Constants.EOF;
             }
 
@@ -362,7 +362,7 @@
 
           @Override
           public double nextDoubleVal() {
-            if (counter >= max) {
+            if (counter > max) {
               return Constants.EOF;
             }
 
@@ -431,7 +431,7 @@
 
           @Override
           public int nextIntVal() {
-            if (counter >= max) {
+            if (counter > max) {
               return Constants.EOF;
             }
 
@@ -444,7 +444,7 @@
 
           @Override
           public long nextLongVal() {
-            if (counter >= max) {
+            if (counter > max) {
               return Constants.EOF;
             }
 
@@ -457,7 +457,7 @@
 
           @Override
           public float nextFloatVal() {
-            if (counter >= max) {
+            if (counter > max) {
               return Constants.EOF;
             }
 
@@ -470,7 +470,7 @@
 
           @Override
           public double nextDoubleVal() {
-            if (counter >= max) {
+            if (counter > max) {
               return Constants.EOF;
             }
 
@@ -555,7 +555,7 @@
 
           @Override
           public long nextLongVal() {
-            if (counter >= max) {
+            if (counter > max) {
               return Constants.EOF;
             }
 
@@ -568,7 +568,7 @@
 
           @Override
           public float nextFloatVal() {
-            if (counter >= max) {
+            if (counter > max) {
               return Constants.EOF;
             }
 
@@ -581,7 +581,7 @@
 
           @Override
           public double nextDoubleVal() {
-            if (counter >= max) {
+            if (counter > max) {
               return Constants.EOF;
             }
 
@@ -653,7 +653,7 @@
 
           @Override
           public int nextIntVal() {
-            if (counter >= max) {
+            if (counter > max) {
               return Constants.EOF;
             }
 
@@ -666,7 +666,7 @@
 
           @Override
           public long nextLongVal() {
-            if (counter >= max) {
+            if (counter > max) {
               return Constants.EOF;
             }
 
@@ -679,7 +679,7 @@
 
           @Override
           public float nextFloatVal() {
-            if (counter >= max) {
+            if (counter > max) {
               return Constants.EOF;
             }
 
@@ -692,7 +692,7 @@
 
           @Override
           public double nextDoubleVal() {
-            if (counter >= max) {
+            if (counter > max) {
               return Constants.EOF;
             }
 
@@ -765,7 +765,7 @@
 
           @Override
           public int nextIntVal() {
-            if (counter >= max) {
+            if (counter > max) {
               return Constants.EOF;
             }
             ByteBuffer rawData = metBuffs[counter++];
@@ -776,7 +776,7 @@
 
           @Override
           public long nextLongVal() {
-            if (counter >= max) {
+            if (counter > max) {
               return Constants.EOF;
             }
 
@@ -789,7 +789,7 @@
 
           @Override
           public float nextFloatVal() {
-            if (counter >= max) {
+            if (counter > max) {
               return Constants.EOF;
             }
 
@@ -802,7 +802,7 @@
 
           @Override
           public double nextDoubleVal() {
-            if (counter >= max) {
+            if (counter > max) {
               return Constants.EOF;
             }
 
