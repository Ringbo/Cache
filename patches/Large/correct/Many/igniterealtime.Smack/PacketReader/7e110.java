diff --git a/source/org/jivesoftware/smack/PacketReader.java b/source/org/jivesoftware/smack/PacketReader.java
index 365bb89..f3ea56a 100644
--- a/source/org/jivesoftware/smack/PacketReader.java
+++ b/source/org/jivesoftware/smack/PacketReader.java
@@ -311,7 +311,7 @@
 
         // Remove all null values from the collectors list.
         synchronized (collectors) {
-            for (int i=collectors.size()-1; i<=0; i--) {
+            for (int i=collectors.size()-1; i>=0; i--) {
                     if (collectors.get(i) == null) {
                         collectors.remove(i);
                     }
