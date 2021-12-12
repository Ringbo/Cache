diff --git a/pinot-core/src/main/java/com/linkedin/pinot/core/realtime/impl/datasource/RealtimeSingleValueBlock.java b/pinot-core/src/main/java/com/linkedin/pinot/core/realtime/impl/datasource/RealtimeSingleValueBlock.java
index b005d18..797fa92 100644
--- a/pinot-core/src/main/java/com/linkedin/pinot/core/realtime/impl/datasource/RealtimeSingleValueBlock.java
+++ b/pinot-core/src/main/java/com/linkedin/pinot/core/realtime/impl/datasource/RealtimeSingleValueBlock.java
@@ -168,7 +168,7 @@
 
           @Override
           public boolean hasNext() {
-            return (counter <= max);
+            return (counter < max);
           }
 
           @Override
@@ -266,7 +266,7 @@
 
           @Override
           public boolean hasNext() {
-            return (counter <= max);
+            return (counter < max);
           }
 
           @Override
@@ -377,7 +377,7 @@
 
           @Override
           public boolean hasNext() {
-            return (counter <= max);
+            return (counter < max);
           }
 
           @Override
@@ -488,7 +488,7 @@
 
           @Override
           public boolean hasNext() {
-            return (counter <= max);
+            return (counter < max);
           }
 
           @Override
@@ -599,7 +599,7 @@
 
           @Override
           public boolean hasNext() {
-            return (counter <= max);
+            return (counter < max);
           }
 
           @Override
@@ -709,7 +709,7 @@
 
           @Override
           public boolean hasNext() {
-            return (counter <= max);
+            return (counter < max);
           }
 
           @Override
