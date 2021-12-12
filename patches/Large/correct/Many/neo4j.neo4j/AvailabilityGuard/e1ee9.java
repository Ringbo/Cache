diff --git a/community/kernel/src/main/java/org/neo4j/kernel/AvailabilityGuard.java b/community/kernel/src/main/java/org/neo4j/kernel/AvailabilityGuard.java
index b683310..64d977b 100644
--- a/community/kernel/src/main/java/org/neo4j/kernel/AvailabilityGuard.java
+++ b/community/kernel/src/main/java/org/neo4j/kernel/AvailabilityGuard.java
@@ -35,8 +35,8 @@
 
 /**
  * The availability guard ensures that the database will only take calls when it is in an ok state.
- * It tracks a set of requirements (added via {@link #require(Object, String)}) that must all be marked
- * as fulfilled (using {@link #fulfill(Object)}) before the database is considered available again.
+ * It tracks a set of requirements (added via {@link #require(AvailabilityRequirement)}) that must all be marked
+ * as fulfilled (using {@link #fulfill(AvailabilityRequirement)}) before the database is considered available again.
  * Consumers determine if it is ok to call the database using {@link #isAvailable()},
  * or await availability using {@link #isAvailable(long)}.
  */
@@ -148,7 +148,7 @@
      *
      * @param requirement the requirement object
      */
-    public void fulfill( Object requirement )
+    public void fulfill( AvailabilityRequirement requirement )
     {
         if ( !blockingRequirements.remove( requirement ) )
         {
