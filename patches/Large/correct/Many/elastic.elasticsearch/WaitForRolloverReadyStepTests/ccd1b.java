diff --git a/x-pack/plugin/core/src/test/java/org/elasticsearch/xpack/core/indexlifecycle/WaitForRolloverReadyStepTests.java b/x-pack/plugin/core/src/test/java/org/elasticsearch/xpack/core/indexlifecycle/WaitForRolloverReadyStepTests.java
index f737827..46acda7 100644
--- a/x-pack/plugin/core/src/test/java/org/elasticsearch/xpack/core/indexlifecycle/WaitForRolloverReadyStepTests.java
+++ b/x-pack/plugin/core/src/test/java/org/elasticsearch/xpack/core/indexlifecycle/WaitForRolloverReadyStepTests.java
@@ -81,10 +81,10 @@
                 });
                 break;
             case 3:
-                maxAge = TimeValue.parseTimeValue(randomPositiveTimeValue(), "rollover_action_test");
+                maxAge = randomValueOtherThan(maxAge, () -> TimeValue.parseTimeValue(randomPositiveTimeValue(), "rollover_action_test"));
                 break;
             case 4:
-                maxDocs = randomNonNegativeLong();
+                maxDocs = randomValueOtherThan(maxDocs, () -> randomNonNegativeLong());
                 break;
             default:
                 throw new AssertionError("Illegal randomisation branch");
