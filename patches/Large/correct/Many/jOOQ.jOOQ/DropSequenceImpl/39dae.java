diff --git a/jOOQ/src/main/java/org/jooq/impl/DropSequenceImpl.java b/jOOQ/src/main/java/org/jooq/impl/DropSequenceImpl.java
index cd15721..c38d7f3 100644
--- a/jOOQ/src/main/java/org/jooq/impl/DropSequenceImpl.java
+++ b/jOOQ/src/main/java/org/jooq/impl/DropSequenceImpl.java
@@ -93,7 +93,7 @@
     // ------------------------------------------------------------------------
 
     private final boolean supportsIfExists(Context<?> ctx) {
-        return !asList(CUBRID, DERBY, FIREBIRD).contains(ctx.family());
+        return !asList(DERBY, FIREBIRD).contains(ctx.family());
     }
 
     @Override
