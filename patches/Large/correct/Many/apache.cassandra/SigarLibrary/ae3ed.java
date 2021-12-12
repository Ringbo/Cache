diff --git a/src/java/org/apache/cassandra/utils/SigarLibrary.java b/src/java/org/apache/cassandra/utils/SigarLibrary.java
index be85977..7cf4d71 100644
--- a/src/java/org/apache/cassandra/utils/SigarLibrary.java
+++ b/src/java/org/apache/cassandra/utils/SigarLibrary.java
@@ -140,11 +140,11 @@
             long swapSize = swap.getTotal();
             if (swapSize > 0)
             {
-                return false;
+                return true;
             }
             else
             {
-                return true;
+                return false;
             }
         }
         catch (SigarException sigarException)
