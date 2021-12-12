diff --git a/buildSrc/src/main/groovy/org/mockito/release/steps/DefaultReleaseSteps.java b/buildSrc/src/main/groovy/org/mockito/release/steps/DefaultReleaseSteps.java
index ff64bd1..e28e3cd 100644
--- a/buildSrc/src/main/groovy/org/mockito/release/steps/DefaultReleaseSteps.java
+++ b/buildSrc/src/main/groovy/org/mockito/release/steps/DefaultReleaseSteps.java
@@ -33,7 +33,7 @@
 
     private static void rollback(List<ReleaseStep> attempted) {
         System.out.println("Release failed. Rolling back " + attempted.size() + " release steps.");
-        LinkedList<ReleaseStep> targets = new LinkedList<ReleaseStep>();
+        LinkedList<ReleaseStep> targets = new LinkedList<ReleaseStep>(attempted);
         while(!targets.isEmpty()) {
             ReleaseStep s = targets.removeLast();
             Operation r = s.getRollback();
