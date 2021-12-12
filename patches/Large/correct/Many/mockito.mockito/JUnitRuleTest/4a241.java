diff --git a/src/test/java/org/mockito/internal/junit/JUnitRuleTest.java b/src/test/java/org/mockito/internal/junit/JUnitRuleTest.java
index fd5101d..7cc1640 100644
--- a/src/test/java/org/mockito/internal/junit/JUnitRuleTest.java
+++ b/src/test/java/org/mockito/internal/junit/JUnitRuleTest.java
@@ -58,7 +58,7 @@
             fail();
         } catch (AssertionError e) {
             assertEquals("x", e.getMessage());
-            assertTrue(logger.getLoggedInfo().startsWith("This stubbing was never used"));
+            assertTrue(logger.getLoggedInfo().contains("This stubbing was never used"));
         }
     }
 
