diff --git a/java/org/apache/tomcat/websocket/PerMessageDeflate.java b/java/org/apache/tomcat/websocket/PerMessageDeflate.java
index 513cf08..d648050 100644
--- a/java/org/apache/tomcat/websocket/PerMessageDeflate.java
+++ b/java/org/apache/tomcat/websocket/PerMessageDeflate.java
@@ -240,7 +240,7 @@
     @Override
     public boolean validateRsv(int rsv, byte opCode) {
         if (Util.isControl(opCode)) {
-            if ((rsv & RSV_BITMASK) > 0) {
+            if ((rsv & RSV_BITMASK) != 0) {
                 return false;
             } else {
                 if (next == null) {
@@ -251,7 +251,7 @@
             }
         } else {
             int rsvNext = rsv;
-            if ((rsv & RSV_BITMASK) > 0) {
+            if ((rsv & RSV_BITMASK) != 0) {
                 rsvNext = rsv ^ RSV_BITMASK;
             }
             if (next == null) {
@@ -300,7 +300,7 @@
 
     @Override
     public boolean validateRsvBits(int i) {
-        if ((i & RSV_BITMASK) > 0) {
+        if ((i & RSV_BITMASK) != 0) {
             return false;
         }
         if (next == null) {
