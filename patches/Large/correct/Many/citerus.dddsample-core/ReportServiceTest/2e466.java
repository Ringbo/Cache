diff --git a/dddsample/external/reporting/src/test/java/com/reporting/ReportServiceTest.java b/dddsample/external/reporting/src/test/java/com/reporting/ReportServiceTest.java
index a0148d2..882abe7 100644
--- a/dddsample/external/reporting/src/test/java/com/reporting/ReportServiceTest.java
+++ b/dddsample/external/reporting/src/test/java/com/reporting/ReportServiceTest.java
@@ -103,7 +103,8 @@
     assertEquals("In transit", voyage.get("currentStatus"));
     assertEquals(0, voyage.get("delayedByMinutes"));
     assertEquals("6/6/09 2:01 PM", voyage.get("lastUpdatedOn"));
-    assertFalse(voyageReport.has("onboardCargos"));
+    assertTrue(voyageReport.has("onboardCargos"));
+    // TODO verify onboard cargos content 
   }
 
   @Test(expected = FileNotFoundException.class)
