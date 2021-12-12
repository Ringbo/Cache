diff --git a/h2/src/main/org/h2/value/ValueLobDb.java b/h2/src/main/org/h2/value/ValueLobDb.java
index e5cdbcd..7881937 100644
--- a/h2/src/main/org/h2/value/ValueLobDb.java
+++ b/h2/src/main/org/h2/value/ValueLobDb.java
@@ -325,7 +325,7 @@
     }
 
     public boolean equals(Object other) {
-        return other instanceof ValueLob && compareSecure((Value) other, null) == 0;
+        return other instanceof ValueLobDb && compareSecure((Value) other, null) == 0;
     }
 
     public boolean isFileBased() {
