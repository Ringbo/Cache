diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/InstanceOfSnippets.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/InstanceOfSnippets.java
index dee55ea..c3577b2 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/InstanceOfSnippets.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/InstanceOfSnippets.java
@@ -98,7 +98,7 @@
         for (int i = 0; i < hints.length; i++) {
             KlassPointer hintHub = hints[i];
             boolean positive = hintIsPositive[i];
-            if (probability(NOT_FREQUENT_PROBABILITY, hintHub.equal(objectHub))) {
+            if (probability(LIKELY_PROBABILITY, hintHub.equal(objectHub))) {
                 hintsHit.inc();
                 return positive ? trueValue : falseValue;
             }
