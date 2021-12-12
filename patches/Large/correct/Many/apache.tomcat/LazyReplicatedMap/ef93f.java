diff --git a/java/org/apache/catalina/tribes/tipis/LazyReplicatedMap.java b/java/org/apache/catalina/tribes/tipis/LazyReplicatedMap.java
index 0002d95..653b52a 100644
--- a/java/org/apache/catalina/tribes/tipis/LazyReplicatedMap.java
+++ b/java/org/apache/catalina/tribes/tipis/LazyReplicatedMap.java
@@ -140,7 +140,7 @@
             Member next = members[nextIdx];
             
             //increment for the next round of back up selection
-            nextIdx = firstIdx + 1;
+            nextIdx = nextIdx + 1;
             if ( nextIdx >= members.length ) nextIdx = 0;
             
             if (next == null) {
