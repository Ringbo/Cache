diff --git a/src/test/java/net/sf/jsqlparser/test/select/SpecialOracleTest.java b/src/test/java/net/sf/jsqlparser/test/select/SpecialOracleTest.java
index 54aa078..e9b1e69 100644
--- a/src/test/java/net/sf/jsqlparser/test/select/SpecialOracleTest.java
+++ b/src/test/java/net/sf/jsqlparser/test/select/SpecialOracleTest.java
@@ -76,7 +76,7 @@
         }
 
         LOG.log(Level.INFO, "tested {0} files. got {1} correct parse results", new Object[]{count, success});
-        assertTrue(success >= 130);
+        assertTrue(success >= 135);
     }
 
     @Test
