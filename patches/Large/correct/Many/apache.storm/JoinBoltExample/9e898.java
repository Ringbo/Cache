diff --git a/examples/storm-starter/src/jvm/org/apache/storm/starter/JoinBoltExample.java b/examples/storm-starter/src/jvm/org/apache/storm/starter/JoinBoltExample.java
index ec9b009..a8359fa 100644
--- a/examples/storm-starter/src/jvm/org/apache/storm/starter/JoinBoltExample.java
+++ b/examples/storm-starter/src/jvm/org/apache/storm/starter/JoinBoltExample.java
@@ -31,7 +31,7 @@
 import java.util.concurrent.TimeUnit;
 
 public class JoinBoltExample {
-    public static void main(String[] args) {
+    public static void main(String[] args) throws Exception {
 
         FeederSpout genderSpout = new FeederSpout(new Fields("id", "gender"));
         FeederSpout ageSpout = new FeederSpout(new Fields("id", "age"));
