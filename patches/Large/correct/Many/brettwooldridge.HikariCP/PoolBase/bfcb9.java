diff --git a/src/main/java/com/zaxxer/hikari/pool/PoolBase.java b/src/main/java/com/zaxxer/hikari/pool/PoolBase.java
index f99537d..70a3767 100755
--- a/src/main/java/com/zaxxer/hikari/pool/PoolBase.java
+++ b/src/main/java/com/zaxxer/hikari/pool/PoolBase.java
@@ -168,7 +168,7 @@
 
          return true;
       }
-      catch (SQLException e) {
+      catch (Exception e) {
          lastConnectionFailure.set(e);
          LOGGER.warn("{} - Failed to validate connection {} ({})", poolName, connection, e.getMessage());
          return false;
