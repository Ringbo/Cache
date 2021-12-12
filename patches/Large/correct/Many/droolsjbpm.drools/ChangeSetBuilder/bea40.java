diff --git a/drools-compiler/src/main/java/org/drools/compiler/kie/util/ChangeSetBuilder.java b/drools-compiler/src/main/java/org/drools/compiler/kie/util/ChangeSetBuilder.java
index 81a1aac..d7d5ba5 100644
--- a/drools-compiler/src/main/java/org/drools/compiler/kie/util/ChangeSetBuilder.java
+++ b/drools-compiler/src/main/java/org/drools/compiler/kie/util/ChangeSetBuilder.java
@@ -197,7 +197,7 @@
     private static class RuleHierarchyComparator implements Comparator<RuleDescr> {
         @Override
         public int compare( RuleDescr r1, RuleDescr r2 ) {
-            return r1.getName().equals( r2.getParentName() ) ? -1 : r1.getName().equals( r2.getParentName() ) ? 1 : 0;
+            return r1.getName().equals( r2.getParentName() ) ? -1 : r2.getName().equals( r1.getParentName() ) ? 1 : 0;
         }
     }
 
