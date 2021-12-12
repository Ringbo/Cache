diff --git a/JodaTime/src/test/org/joda/time/TestPeriod_Basics.java b/JodaTime/src/test/org/joda/time/TestPeriod_Basics.java
index 154a06f..11931da 100644
--- a/JodaTime/src/test/org/joda/time/TestPeriod_Basics.java
+++ b/JodaTime/src/test/org/joda/time/TestPeriod_Basics.java
@@ -730,7 +730,7 @@
         try {
             test.plusYears(1);
             fail();
-        } catch (IllegalArgumentException ex) {}
+        } catch (UnsupportedOperationException ex) {}
     }
 
     public void testPlusZero() {
@@ -784,7 +784,7 @@
         try {
             test.minusYears(1);
             fail();
-        } catch (IllegalArgumentException ex) {}
+        } catch (UnsupportedOperationException ex) {}
     }
 
     //-----------------------------------------------------------------------
