diff --git a/sonar-core/src/main/java/org/sonar/core/issue/tracking/Tracker.java b/sonar-core/src/main/java/org/sonar/core/issue/tracking/Tracker.java
index 4ec4f84..66d1031 100644
--- a/sonar-core/src/main/java/org/sonar/core/issue/tracking/Tracker.java
+++ b/sonar-core/src/main/java/org/sonar/core/issue/tracking/Tracker.java
@@ -261,7 +261,7 @@
       if (this == o) {
         return true;
       }
-      LineAndLineHashKey that = (LineAndLineHashKey) o;
+      LineHashKey that = (LineHashKey) o;
       // start with most discriminant field
       return lineHash.equals(that.lineHash)
         && ruleKey.equals(that.ruleKey);
