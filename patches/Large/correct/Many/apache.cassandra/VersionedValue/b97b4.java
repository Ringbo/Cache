diff --git a/src/java/org/apache/cassandra/gms/VersionedValue.java b/src/java/org/apache/cassandra/gms/VersionedValue.java
index 5841c4b..60459c8 100644
--- a/src/java/org/apache/cassandra/gms/VersionedValue.java
+++ b/src/java/org/apache/cassandra/gms/VersionedValue.java
@@ -148,8 +148,8 @@
         public VersionedValue left(Collection<Token> tokens, long expireTime)
         {
             return new VersionedValue(versionString(VersionedValue.STATUS_LEFT,
-                    Long.toString(expireTime),
-                    makeTokenString(tokens)));
+                    makeTokenString(tokens),
+                    Long.toString(expireTime)));
         }
 
         public VersionedValue moving(Token token)
