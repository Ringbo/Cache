diff --git a/sql/src/main/java/io/crate/exceptions/JobKilledException.java b/sql/src/main/java/io/crate/exceptions/JobKilledException.java
index 33efa57..3f86d48 100644
--- a/sql/src/main/java/io/crate/exceptions/JobKilledException.java
+++ b/sql/src/main/java/io/crate/exceptions/JobKilledException.java
@@ -29,6 +29,6 @@
 
     @Override
     public int errorCode() {
-        return 5010;
+        return 5030;
     }
 }
