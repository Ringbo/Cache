diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/Trigger.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/Trigger.java
index cfabb8b..90e9386 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/Trigger.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/Trigger.java
@@ -490,7 +490,7 @@
    * <p>Note that if {@code t1} is {@link OnceTrigger}, then {@code t1.orFinally(t2)} is the same
    * as {@code AfterFirst.of(t1, t2)}.
    */
-  public Trigger orFinally(OnceTrigger until) {
+  public OrFinallyTrigger orFinally(OnceTrigger until) {
     return new OrFinallyTrigger(this, until);
   }
 
