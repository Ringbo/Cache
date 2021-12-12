diff --git a/modules/core/src/main/java/org/apache/ignite/internal/util/GridLongList.java b/modules/core/src/main/java/org/apache/ignite/internal/util/GridLongList.java
index 09fb098..d1f20e6 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/util/GridLongList.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/util/GridLongList.java
@@ -530,7 +530,7 @@
 
         switch (writer.state()) {
             case 0:
-                if (!writer.writeLongArray("arr", arr))
+                if (!writer.writeLongArray("arr", arr, idx))
                     return false;
 
                 writer.incrementState();
