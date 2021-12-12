diff --git a/driver-core/src/main/java/com/datastax/driver/core/Statement.java b/driver-core/src/main/java/com/datastax/driver/core/Statement.java
index 049e980..3eda368 100644
--- a/driver-core/src/main/java/com/datastax/driver/core/Statement.java
+++ b/driver-core/src/main/java/com/datastax/driver/core/Statement.java
@@ -79,7 +79,7 @@
      * normal consistency level defines the consistency for the "learn" phase, i.e. what
      * type of reads will be guaranteed to see the update right away. For instance, if
      * a conditional write has a regular consistency of QUORUM (and is successful), then a
-     * QUORUM read is guaranteed to see that write. But if teh regular consistency of that
+     * QUORUM read is guaranteed to see that write. But if the regular consistency of that
      * write is ANY, then only a read with a consistency of SERIAL is guaranteed to see it
      * (even a read with consistency ALL is not guaranteed to be enough).
      * <p>
@@ -114,7 +114,7 @@
      * In the latter case, the default serial consistency level will be used.
      */
     public ConsistencyLevel getSerialConsistencyLevel() {
-        return consistency;
+        return serialConsistency;
     }
 
     /**
